package com.iesdoctorbalmis.spring.controller;

import com.iesdoctorbalmis.spring.repository.EmpleadoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empleados")
public class EmpleadoController {

    private final EmpleadoRepository empleadoRepository;

    // Inyección por constructor
    public EmpleadoController(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @GetMapping
    public String lista(Model model) {
        model.addAttribute("empleados", empleadoRepository.findAll());
        return "empleados/lista";
    }
}