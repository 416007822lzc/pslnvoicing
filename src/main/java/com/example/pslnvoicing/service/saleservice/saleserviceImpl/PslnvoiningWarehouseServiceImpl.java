package com.example.pslnvoicing.service.saleservice.saleserviceImpl;

import com.example.pslnvoicing.mapper.salemapper.PslnvoiningWarehouseMapper;
import com.example.pslnvoicing.pojos.PslnvoiningWarehouse;
import com.example.pslnvoicing.service.saleservice.PslnvoiningWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PslnvoiningWarehouseServiceImpl implements PslnvoiningWarehouseService {

    @Autowired
    private PslnvoiningWarehouseMapper kucunWarehouseMapper;

    /**
     * 查询所有仓库信息
     * @return
     */
    @Override
    public List<PslnvoiningWarehouse> pslnvoiningWarehouseList() {
        return kucunWarehouseMapper.pslnvoiningWarehouseList();
    }
}
