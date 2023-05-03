package com.acme.webserviceslinerepair.security.domain.model.entity;

import com.acme.webserviceslinerepair.security.domain.model.enumeration.Roles;
import com.acme.webserviceslinerepair.shared.domain.model.AuditModel;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@With
@Entity
@Table(name = "roles")
public class Role extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Roles name;
}