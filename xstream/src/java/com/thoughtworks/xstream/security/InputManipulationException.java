/*
 * Copyright (C) 2021 XStream Committers.
 * All rights reserved.
 *
 * Created on 21. September 2021 by Joerg Schaible
 */
package com.thoughtworks.xstream.security;


/**
 * Class for a Security Exception assuming input manipulation in XStream.
 * 
 * @author J&ouml;rg Schaible
 * @since upcoming
 */
public class InputManipulationException extends AbstractSecurityException {
    private static final long serialVersionUID = 20210921L;

    /**
     * Constructs a SecurityException.
     * @param message the exception message
     * @since upcoming
     */
    public InputManipulationException(final String message) {
        super(message);
    }
}
