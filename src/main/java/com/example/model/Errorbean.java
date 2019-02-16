package com.example.model;

/**
 * Created by Gayan Sanjeewa on 12/9/2018.
 */
public class Errorbean {
    String status;
    String code;
    String error_description;

    public Errorbean() {
    }

    public Errorbean(String status, String code, String error_description) {
        this.status = status;
        this.code = code;
        this.error_description = error_description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getError_description() {
        return error_description;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }
}
