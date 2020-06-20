package me.weekbelt.corespringsecurity.service.Impl;

import lombok.RequiredArgsConstructor;
import me.weekbelt.corespringsecurity.domain.Account;
import me.weekbelt.corespringsecurity.domain.form.AccountDto;
import me.weekbelt.corespringsecurity.repository.UserRepository;
import me.weekbelt.corespringsecurity.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void createUser(AccountDto accountDto) {
        Account account = Account.builder()
                .username(accountDto.getUsername())
                .password(passwordEncoder.encode(accountDto.getPassword()))
                .email(accountDto.getEmail())
                .age(accountDto.getAge())
                .role(accountDto.getRole())
                .build();
        userRepository.save(account);
    }
}
