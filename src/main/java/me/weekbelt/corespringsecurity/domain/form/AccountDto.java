package me.weekbelt.corespringsecurity.domain.form;

import lombok.*;

@Builder
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class AccountDto {

    private String username;

    private String password;

    private String email;

    private String age;

    private String role;
}
