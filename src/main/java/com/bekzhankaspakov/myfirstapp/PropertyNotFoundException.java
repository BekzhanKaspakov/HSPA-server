package com.bekzhankaspakov.myfirstapp;

class PropertyNotFoundException extends RuntimeException {

    PropertyNotFoundException(Long id) {
        super("Could not find Property " + id);
    }
}