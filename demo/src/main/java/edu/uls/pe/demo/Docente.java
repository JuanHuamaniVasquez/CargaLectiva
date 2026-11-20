package edu.uls.pe.demo;

public record Docente(
        int id,
        String nombreCompleto,
        String departamento,
        int horasNoLectivas,
        boolean tiempoCompletoOtraUniversidad
) {
}
