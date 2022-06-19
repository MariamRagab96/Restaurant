package com.spring.model;

import com.spring.utility.validation.user.annotation.UniqueEmail;
import com.spring.utility.validation.user.annotation.UniqueUserName;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User extends BaseEntity implements Serializable {

    @UniqueUserName
    @Pattern(regexp = "^[A-Za-z]+", message = "user name should be character only")
    @NotBlank(message = "is required")
    @Column(name = "user_name")
    private String userName;

    @UniqueEmail
    @Email(message = "invalid email")
    @NotBlank(message = "is required")
    @Column(name = "email")
    private String email;

    @Pattern(regexp = "^01[012569]{1}[0-9]{8}$", message = "invalid phone")
    @NotBlank(message = "is required")
    @Column(name = "phone")
    private String phone;

    @NotBlank(message = "is required")
    @Column(name = "password")
    private String password;


    @NotNull(message = "is required")
    @Min(value = 50, message = "Credit Limit should be greater than 50$")
    @Column(name = "credit_limit")
    private Long creditLimit;

    @Column(name = "role")
    private String role;
}
