package dev.ahmed.yygh.enums;

public enum RefundStatusEnum {
    UNREFUND(1,"Unrefund"),
    REFUND(2,"Refund");

    private Integer status ;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name ;

    RefundStatusEnum(Integer status, String name) {
        this.status = status;
        this.name=name;
    }

}
