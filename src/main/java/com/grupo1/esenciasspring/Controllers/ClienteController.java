package com.grupo1.esenciasspring.Controllers;

import com.grupo1.esenciasspring.Entities.ClienteEntity;
import com.grupo1.esenciasspring.Services.ClienteService;
import com.grupo1.esenciasspring.Services.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/Cliente")
public class ClienteController {


@Autowired
ClienteServiceImpl clienteService;

@GetMapping("/obtener")
    public List<ClienteEntity> obtenerClientes(){
    return clienteService.obtenerClientes();
}

@PostMapping("/nuevo")
    public ResponseEntity<Map<String,Object>>crearCliente(@RequestBody ClienteEntity cliente){
    ClienteEntity clienteCreado = clienteService.crearCliente(cliente);
    Map<String,Object> response =  new HashMap<>();
    response.put("cliente",clienteCreado);
    return ResponseEntity.ok(response);

}




}