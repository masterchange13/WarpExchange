package org.mao.common;

public record ApiErrorResponse(ApiError error, String data, String message) {

}