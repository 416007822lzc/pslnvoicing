package com.example.pslnvoicing.service.purchase;


import com.example.pslnvoicing.pojos.PslvoicingProduct;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ChoosePslvoicingService {
    /*
    查询所有产品基础信息
     */
    public PageInfo<PslvoicingProduct> chaPslvoicing(String productName, String productNum, String productCategories,Integer limit,Integer page);
}
