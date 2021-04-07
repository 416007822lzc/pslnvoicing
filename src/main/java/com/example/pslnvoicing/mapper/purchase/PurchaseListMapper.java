package com.example.pslnvoicing.mapper.purchase;

import com.example.pslnvoicing.pojos.PurchaseOrder;
import com.example.pslnvoicing.vo.ParameterVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PurchaseListMapper {
    /**
     *
     * @param empNameOrStoreNameOrNumber  搜索条件 员工或仓库或订单编号
     * @param startTime 时间范围搜索的开始时间
     * @param endTime 时间范围搜索的结束时间
     * @param approvalstatus 审批状态
     * @return
     */
    List<PurchaseOrder> purchaseOrderall(@Param("parameterVo") ParameterVo parameterVo);
}
