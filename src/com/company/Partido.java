package com.company;

public class Partido {
    // Atributos
    private Equipo equipo1;
    private Equipo equipo2;

    private Integer golesEquipo1;
    private Integer golesEquipo2;

    // Constructor
    public Partido(Equipo equipo1, Equipo equipo2, Integer golesEquipo1, Integer golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    public Partido() {
    }

    // Métodos
    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public Integer getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(Integer golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public Integer getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(Integer golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    public ResultadoEnum resultado (Equipo pEquipo) {
        try {
            if (pEquipo.getNombre().equals(equipo1.getNombre())) {
                if (golesEquipo1 > golesEquipo2) {
                    return ResultadoEnum.Ganador;
                } else if (golesEquipo1 < golesEquipo2) {
                    return ResultadoEnum.Perdedor;
                } else {
                    return ResultadoEnum.Empate;
                }

            } else if (pEquipo.getNombre().equals(equipo2.getNombre())) {
                if (golesEquipo2 > golesEquipo1) {
                    return ResultadoEnum.Ganador;
                } else if (golesEquipo2 < golesEquipo1) {
                    return ResultadoEnum.Perdedor;
                } else {
                    return ResultadoEnum.Empate;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

}
