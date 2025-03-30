package com.ecommerce.service.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "comandas") 
public class ComandaPersistenceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                                            // de 1 a 300

    @Column(name = "status", nullable = false)
    private String status;                                      // "INATIVA", "ATIVA"

    @Column(name = "numero_mesa", nullable = false)
    private Integer numeroMesa;                                 // de 1 a 50

    @Column(name = "preco_total", nullable = false)
    private Double precoTotal;                                  // preco total da comanda   listaPedidos X preco de cada um

    @OneToMany(mappedBy = "comanda", orphanRemoval = true)
    private List<PedidoPersistenceEntity> listaPedidos = new ArrayList<>();      // cada anotacao, e um pedido

}
