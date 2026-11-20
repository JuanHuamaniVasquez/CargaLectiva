package edu.uls.pe.demo;

public record ParametrosSistema(
        String cicloVigente,
        int minHorasDocente,
        int maxHorasDocente,
        int maxHorasTotalesDocente,
        int maxHorasContratoExterno
) {
}
