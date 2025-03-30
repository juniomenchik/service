package com.ecommerce.service.persistence.repository;

import java.util.List;

import com.ecommerce.service.domain.dto.ComandaDTO;

public interface ComandaCustomRepository {

    List<ComandaDTO> getAllComandas();

}
