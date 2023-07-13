package com.grupo1.esenciasspring.Controllers;

import com.grupo1.esenciasspring.Entities.BlogEntity;
import com.grupo1.esenciasspring.Services.BlogService;
import com.grupo1.esenciasspring.Services.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/blog")


public class BlogController {
    @Autowired
    BlogServiceImpl blogService;

    @PostMapping("/nuevo")
    public ResponseEntity<BlogEntity> crearPost(@RequestBody BlogEntity textoBlog) {
        return ResponseEntity.ok(blogService.crearPost(textoBlog));
    }
    @GetMapping("/obtener")
    public List<BlogEntity> obtenerPost(){
        return blogService.obtenerPost();
    }
}

