package com.app.web;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;
import com.app.web.servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServicioImpl implements EstudianteServicio {

    @Autowired
    private EstudianteRepositorio repositorio;

    @Override
    public List<Estudiante> listarTodosLosEstudiantes() {
        return repositorio.findAll();
    }

    @Override
    public Estudiante guadarEstudiante(Estudiante estudiante) {
        return repositorio.save(estudiante);
    }
}
