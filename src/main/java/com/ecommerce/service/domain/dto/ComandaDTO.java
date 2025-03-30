package com.ecommerce.service.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ComandaDTO {

    private Long id;                   
                            
    private String status;                                     
    private Integer numeroMesa;                                
    private Double precoTotal;                                 
    private List<PedidoDTO> listaPedidos;
}
