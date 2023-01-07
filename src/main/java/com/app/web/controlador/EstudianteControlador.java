package com.app.web.controlador;

import com.app.web.entidad.Estudiante;
import com.app.web.servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstudianteControlador {

    @Autowired
    private EstudianteServicio servicio;

    @GetMapping({"/estudiantes","/"})
    public String mostrarFormularioDeRegistrarEstudiante(Model modelo ){
        modelo.addAttribute("estudiantes", servicio.listarTodosLosEstudiantes());
        return "estudiantes";  //nos retorna el archivo estudiante
    }
    @GetMapping("/estudiantes/nuevo")
    public String CrearEstudianteFormulario(Model modelo ){
        Estudiante estudiante = new Estudiante();
        modelo.addAttribute("estudiante",estudiante);
        return "crear_estudiante";
    }
    @PostMapping("/estudiante")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante){
        servicio.guadarEstudiante(estudiante);
        return "redirect:/estudiantes";

    }
}
