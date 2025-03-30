package com.ecommerce.service.persistence.repository.jpa.pedido;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.service.persistence.entity.PedidoPersistenceEntity;

public interface PedidoRepository extends JpaRepository<PedidoPersistenceEntity, Long> {
    // Métodos personalizados podem ser adicionados aqui, se necessário
    
}
