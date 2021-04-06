package com.example.pslnvoicing.vo.workbench;


public class DataStatisticsVo {
    private Integer sum;
    private Integer count;

    public DataStatisticsVo() {

    }

    public DataStatisticsVo(Integer sum, Integer count) {
        this.sum = sum;
        this.count = count;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "DataStatisticsVo{" +
                "sum=" + sum +
                ", count=" + count +
                '}';
    }
}
