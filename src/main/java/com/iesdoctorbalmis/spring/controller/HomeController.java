package com.iesdoctorbalmis.spring.controller;

import com.iesdoctorbalmis.spring.repository.ClienteRepository;
import com.iesdoctorbalmis.spring.repository.EmpleadoRepository;
import com.iesdoctorbalmis.spring.repository.ProductoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final ClienteRepository clienteRepository;
    private final EmpleadoRepository empleadoRepository;
    private final ProductoRepository productoRepository;

    // Inyección por constructor
    public HomeController(ClienteRepository clienteRepository,
                          EmpleadoRepository empleadoRepository,
                          ProductoRepository productoRepository) {
        this.clienteRepository = clienteRepository;
        this.empleadoRepository = empleadoRepository;
        this.productoRepository = productoRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("totalClientes", clienteRepository.count());
        model.addAttribute("totalEmpleados", empleadoRepository.count());
        model.addAttribute("totalProductos", productoRepository.count());
        return "index";  // → templates/index.html
    }
}