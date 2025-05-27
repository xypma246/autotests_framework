package org.powerbank.constants;

public class UserServiceConstants {

    public static final String USER_REGISTRATION = "/user";
    public static final String EMAIL_VERIFICATION = "/user/reset/verification";
    public static final String AUTHORIZATION = "/user/login";
    public static final String REFRESH_TOKENS = "/user/token";
    public static final String PASSWORD_RESET_PROCEDURE_START = "/user/client/{id}/password/reset";
    public static final String PASSWORD_RESET_PROCEDURE_IDENTIFICATION = "/user/reset/verification";
    public static final String PASSWORD_RESET_PROCEDURE_SEND_CODE = "/user/verification";
    public static final String PASSWORD_RESET_PROCEDURE_ANWSER_TO_QUESTION = "/user/clients/password/recovery";
    public static final String PASSWORD_RESET_PROCEDURE_NEW_PASS_INIT = "/user/clients/password/replace";
    public static final String BLOCK_USER_PROFILE = "/user/block";
    public static final String UNBLOCK_USER_PROFILE = "/user/unblock";
}
