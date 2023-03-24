package com.tvtservices.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
