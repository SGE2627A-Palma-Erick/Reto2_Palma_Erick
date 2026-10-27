package com.iesdoctorbalmis.spring.controller;

import com.iesdoctorbalmis.spring.repository.ProductoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoRepository productoRepository;

    // Inyección por constructor
    public ProductoController(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @GetMapping
    public String lista(Model model) {
        model.addAttribute("productos", productoRepository.findAll());
        return "productos/lista";
    }
}