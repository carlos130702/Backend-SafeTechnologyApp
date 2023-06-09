package com.acme.webserviceslinerepair.client.domain.model.entity;

import com.acme.webserviceslinerepair.shared.domain.model.AuditModel;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@With
@Entity
@Table(name = "clients", uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
public class Client extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Size(max=100)
    private String username;

    @NotNull
    @NotBlank
    @Size(max=100)
    private String names;

    @NotNull
    @NotBlank
    @Size(max=100)
    private String lastNames;

    @NotNull
    @NotBlank
    @Size(max=100)
    private String address;

    @NotNull
    @NotBlank
    @Size(max=100)
    @Email
    private String email;

    @NotNull
    @NotBlank
    @Size(max=100)
    private String password;

    @NotNull
    @NotBlank
    @Size(max=13)
    private String cellPhoneNumber;

    @NotNull
    @NotBlank
    @Size(max=1000)
    private String urlToProfile;

    @NotNull
    @NotBlank
    @Size(max=20)
    private String planType;
}
