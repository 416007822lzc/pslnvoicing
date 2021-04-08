package com.example.pslnvoicing.mapper.salemapper;

import com.example.pslnvoicing.pojos.PslnvoiningWarehouse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PslnvoiningWarehouseMapper {
    /**
     * 查询所有仓库信息
     * @return
     */
    List<PslnvoiningWarehouse> pslnvoiningWarehouseList();
}
