package com.example.camadaServico.Repositories;

import com.example.camadaServico.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
