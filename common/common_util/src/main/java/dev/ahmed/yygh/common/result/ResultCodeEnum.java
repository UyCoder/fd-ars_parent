package dev.ahmed.yygh.common.result;

import lombok.Getter;

/**
 * Unified return result status information class
 */
@Getter
public enum ResultCodeEnum {
    SUCCESS(200, "مۇۋاپىقىيەتلىك ئۇچۇر ئالماشتى"),
    FAIL(201, "مۇۋەپپىقىيەتسىز بولدى. قايتا سىناڭ"),
    PARAM_ERROR(202, "The parameter is incorrect"),
    SERVICE_ERROR(203, "Service exception"),
    DATA_ERROR(204, "Data error"),
    DATA_UPDATE_ERROR(205, "Data version abnormal"),

    LOGIN_AUTH(208, "Not logged in"),
    PERMISSION(209, "No permission"),

    CODE_ERROR(210, "Verification code error"),
    // LOGIN_MOBLE_ERROR(211, "Incorrect account number"),
    LOGIN_DISABLED_ERROR(212, "Change user has been disabled"),
    REGISTER_MOBLE_ERROR(213, "Mobile phone number is already in use"),
    LOGIN_AURH(214, "Login required"),
    LOGIN_ACL(215, "No permission"),

    URL_ENCODE_ERROR(216, "URL encoding failed"),
    ILLEGAL_CALLBACK_REQUEST_ERROR(217, "Illegal callback request"),
    FETCH_ACCESSTOKEN_FAILD(218, "Failed to get accessToken"),
    FETCH_USERINFO_ERROR(219, "Failed to get user information"),
    //LOGIN_ERROR( 23005, "Login failed"),

    PAY_RUN(220, "Paying"),
    CANCEL_ORDER_FAIL(225, "Failed to cancel order"),
    CANCEL_ORDER_NO(225, "Cannot cancel the reservation"),

    HOSCODE_EXIST(230, "Hospital number already exists"),
    NUMBER_NO(240, "Insufficient reservation number"),
    TIME_NO(250, "The current time cannot make an appointment"),

    SIGN_ERROR(300, "Signature error"),
    HOSPITAL_OPEN(310, "The hospital has not been opened and cannot be accessed temporarily"),
    HOSPITAL_LOCK(320, "The hospital is locked and cannot be accessed temporarily"),
    ;

    private Integer code;
    private String message;

    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
