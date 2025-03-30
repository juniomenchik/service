package com.ecommerce.service.persistence.repository.jpa.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.service.persistence.entity.UsuarioPersistenceEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioPersistenceEntity, Long> {
    // Métodos personalizados podem ser adicionados aqui, se necessário
    
}
