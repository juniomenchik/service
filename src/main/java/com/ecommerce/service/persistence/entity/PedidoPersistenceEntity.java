package com.ecommerce.service.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pedidos") 
public class PedidoPersistenceEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "comanda_id", nullable = false)
    private ComandaPersistenceEntity comanda; // Comanda a qual o pedido pertence

    @Column(name = "observacao")
    private String observacao; // "Sem cebola", "Ponto da carne"

    @ManyToOne
    @JoinColumn(name = "item_id", nullable = false)
    private ItemPersistenceEntity item; // Item do cardápio
    
    @Column(name = "quantidade", nullable = false)
    private Integer quantidade; // 1, 2, 3, ...

}
