package com.tienda.demo.service;

import com.tienda.demo.repository.CategoriaRepository;
import com.tienda.demo.domain.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
public class CategoriaService {
 
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Transactional(readOnly=true)
    public List<Categoria> getCategorias(boolean activo) {
        if (activo) {
            return categoriaRepository.findByActivoTrue();
        }
        return categoriaRepository.findAll();
    }
 
 
}