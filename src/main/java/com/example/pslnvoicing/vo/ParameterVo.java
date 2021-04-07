package com.example.pslnvoicing.vo;

public class ParameterVo {
    private String startTime;
    private String endTime;
    private String empNameOrStoreNameOrNumber;
    private Integer orderStatus;
    private Integer pageNum;
    private Integer pageSize;

    public ParameterVo() {
    }

    public ParameterVo(String startTime, String endTime, String empNameOrStoreNameOrNumber, Integer orderStatus, Integer pageNum, Integer pageSize) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.empNameOrStoreNameOrNumber = empNameOrStoreNameOrNumber;
        this.orderStatus = orderStatus;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEmpNameOrStoreNameOrNumber() {
        return empNameOrStoreNameOrNumber;
    }

    public void setEmpNameOrStoreNameOrNumber(String empNameOrStoreNameOrNumber) {
        this.empNameOrStoreNameOrNumber = empNameOrStoreNameOrNumber;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
