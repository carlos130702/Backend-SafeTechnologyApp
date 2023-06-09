package com.acme.webserviceslinerepair.client.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Getter
@Setter
public class UpdateClientResource {
    @NotNull
    @NotBlank
    private String username;

    @NotNull
    @NotBlank
    private String names;

    @NotNull
    @NotBlank
    private String lastNames;

    @NotNull
    @NotBlank
    private String address;

    @NotNull
    @NotBlank
    @Size(max=50)
    private String email;

    @NotNull
    @NotBlank
    @Size(min=5,max=20)
    private String password;

    @NotNull
    @NotBlank
    @Size(max=9)
    private String cellPhoneNumber;

    @NotNull
    @NotBlank
    private String urlToProfile;

    @NotNull
    @NotBlank
    @Size(max=10)
    private String planType;
}
