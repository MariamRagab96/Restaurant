package com.spring.mapper;

import com.spring.dto.UserDTO;
import com.spring.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "userName", source = "userDTO.name")
    public User userDtoToUser(UserDTO userDTO);
    
    public UserMapper INSTANCE = Mappers.getMapper( UserMapper .class );
}
