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
        // Nombres y valores proporcionados para la demostración; todavía sin BD.
        // SI/NO se representa como true/false en contratoCompletoExterno.
        return List.of(
                new Docente(1, "ALATRISTA CORRALES ARTURO", "DACTE", 0, true),
                new Docente(2, "ALFARO BEJARANO JULIO CARLO", "DIMA", 0, false),
                new Docente(3, "ALVAREZ BUSTIOS JOSÉ CARLOS", "DACTE", 0, true),
                new Docente(4, "APAZA VALDIVIA ADELUZ", "DIMA", 0, true),
                new Docente(5, "ARAMAYO VARGAS MARÍA CECILIA", "DACJ", 0, true),
                new Docente(6, "ARDILES ZEBALLOS LUIS ALBERT", "DACJ", 0, false),
                new Docente(7, "CHÁVEZ CONTRERAS ÁNGEL EVARISTO", "DAHUC", 0, true),
                new Docente(8, "DÍAZ TORRES JOHN ELVIS", "DAHUC", 0, true)
        );
    }
}
