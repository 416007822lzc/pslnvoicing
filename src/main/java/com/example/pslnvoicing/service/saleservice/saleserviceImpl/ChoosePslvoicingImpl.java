package com.example.pslnvoicing.service.saleservice.saleserviceImpl;

import com.example.pslnvoicing.mapper.salemapper.ChoosePslvoicingMapper;
import com.example.pslnvoicing.pojos.PslvoicingProduct;
import com.example.pslnvoicing.service.saleservice.ChoosePslvoicingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChoosePslvoicingImpl implements ChoosePslvoicingService {

    @Autowired
    private ChoosePslvoicingMapper choosePslvoicingMapper;

    @Override
    public PageInfo<PslvoicingProduct> chaPslvoicing(String productName, String productNum, String productCategories, Integer limit, Integer page) {
        PageHelper.startPage(limit,page);
        return new PageInfo<>(choosePslvoicingMapper.chaPslvoicing(productName,productNum,productCategories));
    }
}
