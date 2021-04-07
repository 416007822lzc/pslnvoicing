package com.example.pslnvoicing.service.purchase;

import com.example.pslnvoicing.mapper.purchase.ChoosePslvoicingMapper;
import com.example.pslnvoicing.pojos.PslvoicingProduct;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoosePslvoicingImpl implements ChoosePslvoicingService{

    @Autowired
    private ChoosePslvoicingMapper choosePslvoicingMapper;

    /**
     * 查询所有产品基础信息
     * @return
     */
    @Override
    public PageInfo<PslvoicingProduct> chaPslvoicing(String productName,String productNum,String productCategories,Integer limit,Integer page) {
        PageHelper.startPage(limit,page);
        return new PageInfo<>(choosePslvoicingMapper.chaPslvoicing(productName,productNum,productCategories));
    }
}
