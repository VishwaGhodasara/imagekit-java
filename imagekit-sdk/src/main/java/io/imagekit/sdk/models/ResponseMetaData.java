package io.imagekit.sdk.models;


import com.google.gson.JsonObject;

import java.util.Map;

import okhttp3.ResponseBody;

public class ResponseMetaData {

    private String raw;
    private int httpStatusCode;
    private String headers;

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }
}
