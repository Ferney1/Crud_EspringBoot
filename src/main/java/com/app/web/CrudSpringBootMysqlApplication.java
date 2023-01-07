package com.app.web;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringBootMysqlApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringBootMysqlApplication.class, args);
    }


    @Autowired
    private EstudianteRepositorio repositorio;



    @Override
    public void run(String... args) throws Exception {

      Estudiante estudiante1 = new Estudiante("ferney","Paternina","ferneypaternina78@gmail.com");
        repositorio.save(estudiante1);

        Estudiante estudiante2 = new Estudiante("Andres","Quiroz","Andres78@gmail.com");
        repositorio.save(estudiante2);


    }
}
