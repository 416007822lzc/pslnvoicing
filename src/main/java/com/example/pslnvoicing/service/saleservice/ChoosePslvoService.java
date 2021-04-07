package com.example.pslnvoicing.service.saleservice;

import com.example.pslnvoicing.pojos.PslvoicingProduct;
import com.github.pagehelper.PageInfo;

public interface ChoosePslvoService {

    public PageInfo<PslvoicingProduct> chaPslvoicing(String productName, String productNum, String productCategories, Integer limit, Integer page);
}
