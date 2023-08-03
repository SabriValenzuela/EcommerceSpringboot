package com.grupo1.esenciasspring.Repositories;

import com.grupo1.esenciasspring.Entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {

}
