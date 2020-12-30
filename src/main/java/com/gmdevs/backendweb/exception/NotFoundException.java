package com.gmdevs.backendweb.exception;

public class NotFoundException extends Exception{

    public NotFoundException(String message, String mensaje) {
        super(message);
        this.mensaje = mensaje;
    }

    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}

