package com.gmdevs.backendweb.exception;

public class ServiceException extends Exception{

    public ServiceException(String message) {
        super(message);
    }

    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
