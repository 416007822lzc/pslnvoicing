package com.example.pslnvoicing.vo.xgy;

public class WarehouseVo {
    private String warehouseName;
    private int warehouseId;
    private String warehouseNum;
    private String warehouseAddress;
    private String warehouseHead;
    private int warehousePhone;
    private int warehouseCall;
    private String warehouseNote;
    private int warehouseDisable;

    public WarehouseVo() {
    }

    public WarehouseVo(String warehouseName, int warehouseId, String warehouseNum, String warehouseAddress, String warehouseHead, int warehousePhone, int warehouseCall, String warehouseNote, int warehouseDisable) {
        this.warehouseName = warehouseName;
        this.warehouseId = warehouseId;
        this.warehouseNum = warehouseNum;
        this.warehouseAddress = warehouseAddress;
        this.warehouseHead = warehouseHead;
        this.warehousePhone = warehousePhone;
        this.warehouseCall = warehouseCall;
        this.warehouseNote = warehouseNote;
        this.warehouseDisable = warehouseDisable;
    }

    @Override
    public String toString() {
        return "WarehouseVo{" +
                "warehouseName='" + warehouseName + '\'' +
                ", warehouseId=" + warehouseId +
                ", warehouseNum='" + warehouseNum + '\'' +
                ", warehouseAddress='" + warehouseAddress + '\'' +
                ", warehouseHead='" + warehouseHead + '\'' +
                ", warehousePhone=" + warehousePhone +
                ", warehouseCall=" + warehouseCall +
                ", warehouseNote='" + warehouseNote + '\'' +
                ", warehouseDisable=" + warehouseDisable +
                '}';
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseNum() {
        return warehouseNum;
    }

    public void setWarehouseNum(String warehouseNum) {
        this.warehouseNum = warehouseNum;
    }

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }

    public String getWarehouseHead() {
        return warehouseHead;
    }

    public void setWarehouseHead(String warehouseHead) {
        this.warehouseHead = warehouseHead;
    }

    public int getWarehousePhone() {
        return warehousePhone;
    }

    public void setWarehousePhone(int warehousePhone) {
        this.warehousePhone = warehousePhone;
    }

    public int getWarehouseCall() {
        return warehouseCall;
    }

    public void setWarehouseCall(int warehouseCall) {
        this.warehouseCall = warehouseCall;
    }

    public String getWarehouseNote() {
        return warehouseNote;
    }

    public void setWarehouseNote(String warehouseNote) {
        this.warehouseNote = warehouseNote;
    }

    public int getWarehouseDisable() {
        return warehouseDisable;
    }

    public void setWarehouseDisable(int warehouseDisable) {
        this.warehouseDisable = warehouseDisable;
    }
}
