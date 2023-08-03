package com.grupo1.esenciasspring.Services;

import com.grupo1.esenciasspring.Entities.ClienteEntity;

import java.util.List;

public interface ClienteService {
    List<ClienteEntity> obtenerClientes();

    ClienteEntity crearCliente(ClienteEntity orden);

}
