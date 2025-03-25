package com.ecommerce.service.application.utils;


public class ResponseBodyDTO {

    private final String status; // Tornando o campo imutável
    private final String message; // Tornando o campo imutável

    // Construtor
    public ResponseBodyDTO(String status, String message) {
        this.status = status;
        this.message = message;
    }

    // Getters (sem setters, pois os campos são finais)
    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    // Método toString para facilitar a visualização do objeto
    @Override
    public String toString() {
        return "ResponseBodyDTO{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}