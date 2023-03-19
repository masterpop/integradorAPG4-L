package com.company;

import java.util.HashMap;
import java.util.Map;

public class Ronda {
    private String numero;
    private Partido[] partidos;

    public Ronda(String numero, Partido[] partidos) {
        this.numero = numero;
        this.partidos = partidos;
    }

    public int puntos() {
        // Crear un mapa para llevar la cuenta de los puntos acumulados por cada equipo
        Map<Equipo, Integer> puntosPorEquipo = new HashMap<>();

        // Recorrer todos los partidos de la ronda
        for (Partido partido : partidos) {
            // Obtener los equipos que jugaron el partido
            Equipo equipo1 = partido.getEquipo1();
            Equipo equipo2 = partido.getEquipo2();

            // Verificar si ya se ha registrado algún punto para cada equipo
            if (!puntosPorEquipo.containsKey(equipo1)) {
                puntosPorEquipo.put(equipo1, 0);
            }
            if (!puntosPorEquipo.containsKey(equipo2)) {
                puntosPorEquipo.put(equipo2, 0);
            }

            // Calcular el resultado del partido y asignar los puntos correspondientes a cada equipo
            ResultadoEnum resultado = partido.resultado(null);
            if (resultado == ResultadoEnum.Ganador) {
                puntosPorEquipo.put(equipo1, puntosPorEquipo.get(equipo1) + 3);
            } else if (resultado == ResultadoEnum.Perdedor) {
                puntosPorEquipo.put(equipo2, puntosPorEquipo.get(equipo2) + 3);
            } else if (resultado == ResultadoEnum.Empate) {
                puntosPorEquipo.put(equipo1, puntosPorEquipo.get(equipo1) + 1);
                puntosPorEquipo.put(equipo2, puntosPorEquipo.get(equipo2) + 1);
            }
        }

        // Sumar los puntos de todos los equipos y devolver el resultado
        int puntosTotales = 0;
        for (int puntosEquipo : puntosPorEquipo.values()) {
            puntosTotales += puntosEquipo;
        }
        return puntosTotales;
    }
}