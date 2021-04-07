package com.example.pslnvoicing.service.purchase;

import com.example.pslnvoicing.mapper.purchase.PurchaseMapper;
import com.example.pslnvoicing.pojos.PslvoicingProduct;
import com.example.pslnvoicing.pojos.PurchaseOrder;
import com.example.pslnvoicing.pojos.PurchaseProductdetails;
import com.example.pslnvoicing.vo.purchase.NewpurchaseOrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseImpl implements PurchaseService{

    @Autowired
    private PurchaseMapper purchaseMapper;

    @Override
    public Boolean addCaigou(NewpurchaseOrderVo newpurchaseOrderVo) {
//        PurchaseOrder p=new PurchaseOrder();
//        p.setSupplierId(newpurchaseOrderVo.getSupplierId());
//        p.setWarehouseId(newpurchaseOrderVo.getWarehouseId());
//        p.setEmpId(newpurchaseOrderVo.getEmpId());
//        p.setPOPurchasenumber(newpurchaseOrderVo.getShuzi());
//        p.setPOJine(newpurchaseOrderVo.getZj());
//        p.setPODocumentdate(newpurchaseOrderVo.getJq());
//        p.setPODeliverydate(newpurchaseOrderVo.getSj());
        int caig = purchaseMapper.addPurchase(newpurchaseOrderVo);

        PurchaseProductdetails xiangq=new PurchaseProductdetails();
        List<PslvoicingProduct> list= newpurchaseOrderVo.getPslvoicingproducts();
        List<PurchaseProductdetails> xq=new ArrayList<>();
        for (PslvoicingProduct pslvoicingProduct : list) {
            PurchaseProductdetails pu=new PurchaseProductdetails();
            pu.setPOPurchasenumber(newpurchaseOrderVo.getShuzi());//采购编号
            pu.setPPdCpid(pslvoicingProduct.getProductNum());//产品编号
            pu.setPPdSname(pslvoicingProduct.getProductName());//产品名称
            pu.setPPdCompany(pslvoicingProduct.getProductUnit());//单位
            BigDecimal openingNum = pslvoicingProduct.getProductOpeningNum();
            int i = openingNum.intValue(); //BigDecimal类型转为int
            pu.setPPdNumber(i);//数量
            double v=0;
            if (pslvoicingProduct.getProductPurchasePrice()!=null){
                 v = pslvoicingProduct.getProductPurchasePrice().doubleValue();
            }
            pu.setPPdUnitprice(v);//单价
            if (v==0){
                pu.setPPdTotalprice(0.00);
            }else {
                pu.setPPdTotalprice(i*v);//总价
            }

            xq.add(pu);
        }
        int xqing = purchaseMapper.addPurchaseDetails(xq);
        if (xqing>0&&caig>0){
            return true;
        }else {
            return false;
        }

    }
}
