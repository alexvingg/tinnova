package br.com.tinnova.demo.response;

import lombok.Data;

@Data
public class ErrorResponse {

    private String error;

    private int status;

}
