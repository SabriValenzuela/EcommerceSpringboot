package com.grupo1.esenciasspring.Services;

import com.grupo1.esenciasspring.Entities.ClienteEntity;
import com.grupo1.esenciasspring.Repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<ClienteEntity> obtenerClientes() {
        return clienteRepository.findAll();}

    @Override
    public ClienteEntity crearCliente(ClienteEntity cliente){
        return clienteRepository.save(cliente);
    }



}
