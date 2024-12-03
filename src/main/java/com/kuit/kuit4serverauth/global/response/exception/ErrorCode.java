package com.kuit.kuit4serverauth.global.response.exception;

public enum ErrorCode {
    INVALID_USERNAME_OR_PASSWORD(401, "Invalid username or password"),
    MISSING_AUTH_HEADER(401, "Missing or invalid Authorization header"),
    INVALID_ACCESS_TOKEN(401, "Invalid or expired token"),
    INVALID_REFRESH_TOKEN(402, "Invalid or expired refresh token"),
    FORBIDDEN_ACCESS(403, "Access denied"),
    INTERNAL_SERVER_ERROR(500, "Internal server error"),
    NO_SUCH_STORE(500, "No such store"),
    NO_SUCH_ORDER(500, "No such order");


    private final int status;
    private final String message;

    ErrorCode(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
