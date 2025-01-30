package com.example.camadaServico.services;

import com.example.camadaServico.Repositories.UserRepository;
import com.example.camadaServico.dtos.UserDto;
import com.example.camadaServico.entities.User;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public UserDto findByIde(Long id){
        User entity = userRepository.findById(id).get();
        UserDto dto = new UserDto(entity);
        return dto;
    }



}
