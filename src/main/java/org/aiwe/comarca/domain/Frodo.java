package org.aiwe.comarca.domain;

import java.util.Objects;

public class Frodo {
    private int altura;
    private String armadura;
    private String accesorios;
    private String alimentacion;
    private String mascota;

    public Frodo(int altura, String armadura, String accesorios, String alimentacion, String mascota) {
        this.altura = altura;
        this.armadura = armadura;
        this.accesorios = accesorios;
        this.alimentacion = alimentacion;
        this.mascota = mascota;
    }

    public int getAltura() {
        return altura;
    }

    public Frodo setAltura(int altura) {
        this.altura = altura;
        return this;
    }

    public String getArmadura() {
        return armadura;
    }

    public Frodo setArmadura(String armadura) {
        this.armadura = armadura;
        return this;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public Frodo setAccesorios(String accesorios) {
        this.accesorios = accesorios;
        return this;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public Frodo setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
        return this;
    }

    public String getMascota() {
        return mascota;
    }

    public Frodo setMascota(String mascota) {
        this.mascota = mascota;
        return this;
    }

    @Override
    public String toString() {
        return "org.aiwe.comarca.domain.org.aiwe.comarca.domain.Frodo{" +
                "altura=" + altura +
                ", armadura='" + armadura + '\'' +
                ", accesorios='" + accesorios + '\'' +
                ", alimentacion='" + alimentacion + '\'' +
                ", mascota='" + mascota + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frodo frodo = (Frodo) o;
        return altura == frodo.altura && Objects.equals(armadura, frodo.armadura) && Objects.equals(accesorios, frodo.accesorios) && Objects.equals(alimentacion, frodo.alimentacion) && Objects.equals(mascota, frodo.mascota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(altura, armadura, accesorios, alimentacion, mascota);
    }
}

