package edu.uls.pe.demo;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerCargaLectiva {

    private final ServiceCargaLectiva service;

    public ControllerCargaLectiva(ServiceCargaLectiva service) {
        this.service = service;
    }

    @GetMapping("/parametros")
    public ParametrosSistema consultarParametros() {
        return service.consultarParametros();
    }

    @GetMapping("/catalogos/carreras")
    public List<Carrera> consultarCarreras() {
        return service.consultarCarreras();
    }

    @GetMapping("/catalogos/docentes")
    public List<Docente> consultarDocentes() {
        return service.consultarDocentes();
    }
}
