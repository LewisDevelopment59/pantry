package org.liftoff.thepantry.user;

public class EmailExistsException extends Exception {

    public EmailExistsException(String message) {
        super(message);
    }

}