package com.example.pslnvoicing.service.saleservice.saleserviceImpl;

import com.example.pslnvoicing.mapper.salemapper.TbOrderDetailsVoMapper;
import com.example.pslnvoicing.mapper.salemapper.TbOrderMapper;
import com.example.pslnvoicing.pojos.*;
import com.example.pslnvoicing.service.saleservice.TbOrderService;
import com.example.pslnvoicing.vo.NewsaleOrderVo;
import com.example.pslnvoicing.vo.ParameterVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class TbOrderServiceImpl implements TbOrderService {
    @Autowired
    private TbOrderMapper tbOrderMapper;

    @Autowired
    private TbOrderDetailsVoMapper  tbOrderDetailsVoMapper;

    @Override
    public PageInfo<TbOrder> tbOrderfindAll(ParameterVo parameterVo) {
        PageHelper.startPage(parameterVo.getPageNum(),parameterVo.getPageSize());
        PageInfo<TbOrder> orders = new PageInfo<>(tbOrderMapper.tbOrderfindAll(parameterVo.getEmpNameOrStoreNameOrNumber(),parameterVo.getStartTime(),parameterVo.getEndTime(),parameterVo.getStatus()));
        return orders;
    }

    @Override
    public Boolean addorder(NewsaleOrderVo newsaleOrderVo) {
            TbOrder tbOrder=new TbOrder();

            PslnvoicingClient pslnvoicingClient=new PslnvoicingClient();
            pslnvoicingClient.setClientId(newsaleOrderVo.getClientid());
            tbOrder.setPslnvoicingClient(pslnvoicingClient);

            PslnvoiningWarehouse pslnvoiningWarehouse=new PslnvoiningWarehouse();
            pslnvoiningWarehouse.setWarehouseId(newsaleOrderVo.getWarehouseId());
            tbOrder.setPslnvoiningWarehouse(pslnvoiningWarehouse);

            PersonnelEmp personnelEmp=new PersonnelEmp();
            personnelEmp.setEmpId(newsaleOrderVo.getEmpId());
            tbOrder.setPersonnelEmp(personnelEmp);
            tbOrder.setOrderNumber(newsaleOrderVo.getOrdernumber());
            tbOrder.setAccountReceivable(newsaleOrderVo.getZj());
            tbOrder.setDocumentDate(newsaleOrderVo.getDocumentdate());
            tbOrder.setDeliveryDate(newsaleOrderVo.getDeliverydate());
            int addtborder = tbOrderMapper.addtborder(tbOrder);


             List<PslvoicingProduct> pslvoicingProducts = newsaleOrderVo.getPslvoicingProducts();
                List<TbOrderDetails> xq=new ArrayList<>();
                for (PslvoicingProduct pslvoicingProduct : pslvoicingProducts) {
                    TbOrderDetails tbOrderDetails=new TbOrderDetails();
                    tbOrderDetails.setOrderId(newsaleOrderVo.getOrdernumber());
                    tbOrderDetails.setProductNumber(pslvoicingProduct.getProductNum());
                    tbOrderDetails.setProductName(pslvoicingProduct.getProductName());
                    tbOrderDetails.setProductUnit(pslvoicingProduct.getProductUnit());
                    BigDecimal openingNum = pslvoicingProduct.getProductOpeningNum();
                    int i = openingNum.intValue(); //BigDecimal类型转为int
                    tbOrderDetails.setNumber(i);//产品数量
                    double v=0;
                    if (pslvoicingProduct.getProductPurchasePrice()!=null){
                        v = pslvoicingProduct.getProductPurchasePrice().doubleValue();
                    }
                    tbOrderDetails.setSalesUnitPrice(v);
                    if (v==0){
                        tbOrderDetails.setSalesAmount(0.00);
                    }else {
                        tbOrderDetails.setSalesAmount(i*v);//总价
                    }
                    xq.add(tbOrderDetails);
                     }
                    int i1 = tbOrderDetailsVoMapper.addtbOrderDetails(xq);
                    if (i1>0&&addtborder>0){
                        return true;
                    }else {
                        return false;
                    }
    }
}
