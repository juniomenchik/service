package com.ecommerce.service.persistence.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "itens")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_de_barra", nullable = false) // "7894900011517"     
    private String codigoDeBarra;                       

    @Column(name = "name",nullable = false)             // "Coca-Cola", "Hamburguer", "Pudim"
    private String name;

    @Column(name = "full_name",nullable = false)        // "Coca-Cola 2L", "Hamburguer", "Pudim"
    private String fullName;

    @Column(name = "preco")
    private Double preco;                               // 0.00

    @Column(name = "categoria")
    private String categoria;                           // "Bebida", "Prato", "Sobremesa"
    
    @Column(name = "descricao")                         // "Refrigerante de cola", "Pão, carne, queijo e salada", "Doce de leite"
    private String descricao;

}
