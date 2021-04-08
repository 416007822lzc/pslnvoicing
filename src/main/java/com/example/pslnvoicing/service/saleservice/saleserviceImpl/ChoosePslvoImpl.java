package com.example.pslnvoicing.service.saleservice.saleserviceImpl;

import com.example.pslnvoicing.mapper.salemapper.ChoosePslvoMapper;
import com.example.pslnvoicing.pojos.PslvoicingProduct;
import com.example.pslnvoicing.service.saleservice.ChoosePslvoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChoosePslvoImpl implements ChoosePslvoService {

    @Autowired
    private ChoosePslvoMapper choosePslvoMapper;

    /**
     * 查询所有产品基础信息
     * @param productName
     * @param productNum
     * @param productCategories
     * @param limit
     * @param page
     * @return
     */

    @Override
    public PageInfo<PslvoicingProduct> chaPslvoicing(String productName, String productNum, String productCategories, Integer limit, Integer page) {
        PageHelper.startPage(limit,page);
        return new PageInfo<>(choosePslvoMapper.chaPslvoicing(productName,productNum,productCategories));
    }
}
