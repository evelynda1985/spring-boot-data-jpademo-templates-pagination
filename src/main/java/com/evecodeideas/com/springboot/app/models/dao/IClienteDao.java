package com.evecodeideas.com.springboot.app.models.dao;

import com.evecodeideas.com.springboot.app.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
