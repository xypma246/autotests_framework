package org.powerbank.constants;

public class AccountServiceConstants {

    public static final String GETTING_USER_DATA = "/user";
    public static final String GETTING_USER_PASSPORT_NUMBER = "/user/info";
    public static final String USER_LOGOUT = "/user/logout";
    public static final String USER_AVATAR_INTERACTION = "/user/avatar";
    public static final String CHANGING_PASSWORD_BY_PERSONAL_ACCOUNT = "/user/password";
    public static final String USER_SECURITY_QUESTION_INTERACTION = "/user/question";
    public static final String CHANGING_USER_EMAIL = "/user/email";
    public static final String CHECK_USER_EMAIL_SENDINGS = "/user/subscriptions";
    public static final String USER_EMAIL_SENDINGS_INTERACTION = "/user/subscriptions";
    public static final String UPLOADING_DOCUMENTS_FOR_VALIDATION = "/user/validation/passport";
    public static final String DISABLE_MFA = "/user/2fa?statusMfa=false";
    public static final String ENABLE_MFA = "/user/2fa?statusMfa=true";
    public static final String NEW_DEVICE_NOTIFICATIONS_CHANNELS_INTERACTION = "/user/NotificationChannels";
    public static final String VERIFICATION_CODE_CHECK = "/user/verification/code";
    public static final String VERIFICATION_CODE_RESEND = "/user/reverification/code";
    public static final String CHECK_USER_SESSION = "/user/token/introspect";
}
