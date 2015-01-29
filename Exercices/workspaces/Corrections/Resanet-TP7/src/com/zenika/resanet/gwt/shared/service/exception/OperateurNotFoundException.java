package com.zenika.resanet.gwt.shared.service.exception;

import java.io.Serializable;

@SuppressWarnings("serial")
public class OperateurNotFoundException extends Exception implements Serializable {

    public OperateurNotFoundException() {
        super();
    }

    public OperateurNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public OperateurNotFoundException(String message) {
        super(message);
        System.out.println("[Resanet] Je passe par une Exception");
    }

    public OperateurNotFoundException(Throwable cause) {
        super(cause);
    }

}
