package dev.ahmed.yygh.enums;

public enum PaymentTypeEnum {
    ALIPAY(1, "AliPay"),
    WEIXIN(2, "Wexin");

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    private Integer status;
    private String comment;


    PaymentTypeEnum(Integer status, String comment) {
        this.status = status;
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
