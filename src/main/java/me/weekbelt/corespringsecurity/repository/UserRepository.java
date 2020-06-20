package me.weekbelt.corespringsecurity.repository;

import me.weekbelt.corespringsecurity.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Account, Long> {
}
