package com.ecommerce.service.persistence.mapper;

import java.util.Collections;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.ecommerce.service.domain.dto.UsuarioDTO;
import com.ecommerce.service.persistence.entity.UsuarioPersistenceEntity;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    
    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    UsuarioDTO toDTO(UsuarioPersistenceEntity entity);

    UsuarioPersistenceEntity toEntity(UsuarioDTO dto);

        // Método personalizado para mapear UsuarioDTO para User
    default User toUser(UsuarioDTO dto) {
        return new User(
            dto.getUsername(),
            dto.getPassword(),
            Collections.singletonList(new SimpleGrantedAuthority(dto.getRole()))
        );
    }
    
}
