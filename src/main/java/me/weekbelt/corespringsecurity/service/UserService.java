package me.weekbelt.corespringsecurity.service;

import me.weekbelt.corespringsecurity.domain.Account;
import me.weekbelt.corespringsecurity.domain.form.AccountDto;

public interface UserService {

    void createUser(AccountDto accountDto);
}
