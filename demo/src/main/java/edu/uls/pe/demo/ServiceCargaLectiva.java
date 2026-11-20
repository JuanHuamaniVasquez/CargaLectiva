package edu.uls.pe.demo;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ServiceCargaLectiva {

    public ParametrosSistema consultarParametros() {
        return new ParametrosSistema(
                "2026-II",
                8,   // Mínimo recomendado de horas lectivas.
                24,  // Máximo recomendado de horas lectivas.
                40,  // Máximo de horas lectivas + no lectivas.
                16   // Máximo lectivo con contrato completo externo.
        );
    }

    public List<Carrera> consultarCarreras() {
        return List.of(
                new Carrera(1, "ADM", "Administración de Negocios Internacionales"),
                new Carrera(2, "DER", "Derecho"),
                new Carrera(3, "ING", "Ingeniería de Software"),
                new Carrera(4, "ICO", "Ingeniería Comercial"),
                new Carrera(5, "COM", "Ciencias de la Comunicación"),
                new Carrera(6, "PSI", "Psicología"),
                new Carrera(7, "IND", "Ingeniería Industrial"),
                new Carrera(8, "ARQ", "Arquitectura")
        );
    }

    public List<Docente> consultarDocentes() {
        // Datos ficticios para demostrar los servicios sin acceso a una BD.
        return List.of(
                new Docente(1, "Ana Torres Ruiz", "DAHUC", 8, false),
                new Docente(2, "Bruno Vega Soto", "DIMA", 4, true),
                new Docente(3, "Carla Mendoza Rojas", "DACJ", 12, false),
                new Docente(4, "Diego Salas Ramos", "DACTE", 6, false)
        );
    }
}
