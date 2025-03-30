package com.ecommerce.service.persistence.repository.jpa.item;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.service.persistence.entity.ItemPersistenceEntity;

public interface ItemRepository extends JpaRepository<ItemPersistenceEntity, Long> {
    // Métodos personalizados podem ser adicionados aqui, se necessário

}
