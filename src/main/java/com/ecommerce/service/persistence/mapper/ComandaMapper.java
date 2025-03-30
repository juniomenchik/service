package com.ecommerce.service.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ecommerce.service.domain.dto.ComandaDTO;
import com.ecommerce.service.persistence.entity.ComandaPersistenceEntity;

@Mapper(componentModel = "spring")
public interface ComandaMapper {
    
    ComandaMapper INSTANCE = Mappers.getMapper(ComandaMapper.class);

    ComandaDTO toDTO(ComandaPersistenceEntity entity);

    ComandaPersistenceEntity toEntity(ComandaDTO dto);

}
