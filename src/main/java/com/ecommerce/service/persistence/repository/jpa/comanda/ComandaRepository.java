package com.ecommerce.service.persistence.repository.jpa.comanda;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.service.persistence.entity.ComandaPersistenceEntity;

public interface ComandaRepository extends JpaRepository<ComandaPersistenceEntity, Long> {
    // Métodos personalizados podem ser adicionados aqui, se necessário

}
