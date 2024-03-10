package ru.practicum.shareit.exceptions;

public class ErrorResponse {
    private final String error;

    public ErrorResponse(String error) {
        this.error = error;
    }

    public String getMessage() {
        return error;
    }
}
