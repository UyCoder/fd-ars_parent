package dev.ahmed.yygh.enums;

public enum AuthStatusEnum {

    NO_AUTH(0, "No Auth"),
    AUTH_RUN(1, "Auth Run"),
    AUTH_SUCCESS(2, "Auth Success"),
    AUTH_FAIL(-1, "Auth Fail");;

    private Integer status;
    private String name;

    AuthStatusEnum(Integer status, String name) {
        this.status = status;
        this.name = name;
    }

    public static String getStatusNameByStatus(Integer status) {
        AuthStatusEnum arrObj[] = AuthStatusEnum.values();
        for (AuthStatusEnum obj : arrObj) {
            if (status.intValue() == obj.getStatus().intValue()) {
                return obj.getName();
            }
        }
        return "";
    }


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
}
