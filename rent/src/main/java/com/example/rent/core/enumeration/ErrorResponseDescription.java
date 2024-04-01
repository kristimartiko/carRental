package com.example.rent.core.enumeration;

import lombok.Getter;

@Getter
public enum ErrorResponseDescription {
    BAD_CREDENTIALS("Bad Credentials!"),
    WRONG_EMAIL_FORMAT("Wrong Email Format!");
    private final String value;
    ErrorResponseDescription(String value) { this.value = value; }
}
