package org.aiwe.comarca.domain;

import java.util.Objects;

public class Comarca {
    String nombre;
    String ubicacion;
    int dimensiones_m2;
    int cant_habitantes;
    String tipo_construccion;

    public Comarca(String nombre, String ubicacion, int dimensiones_m2, int cant_habitantes, String tipo_construccion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.dimensiones_m2 = dimensiones_m2;
        this.cant_habitantes = cant_habitantes;
        this.tipo_construccion = tipo_construccion;
    }

    public String getNombre() {
        return nombre;
    }

    public Comarca setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Comarca setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
        return this;
    }

    public int getDimensiones_m2() {
        return dimensiones_m2;
    }

    public Comarca setDimensiones_m2(int dimensiones_m2) {
        this.dimensiones_m2 = dimensiones_m2;
        return this;
    }

    public int getCant_habitantes() {
        return cant_habitantes;
    }

    public Comarca setCant_habitantes(int cant_habitantes) {
        this.cant_habitantes = cant_habitantes;
        return this;
    }

    public String getTipo_construccion() {
        return tipo_construccion;
    }

    public Comarca setTipo_construccion(String tipo_construccion) {
        this.tipo_construccion = tipo_construccion;
        return this;
    }

    @Override
    public String toString() {
        return "Comarca{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", dimensiones_m2=" + dimensiones_m2 +
                ", cant_habitantes=" + cant_habitantes +
                ", tipo_construccion='" + tipo_construccion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comarca comarca = (Comarca) o;
        return dimensiones_m2 == comarca.dimensiones_m2 && cant_habitantes == comarca.cant_habitantes && Objects.equals(nombre, comarca.nombre) && Objects.equals(ubicacion, comarca.ubicacion) && Objects.equals(tipo_construccion, comarca.tipo_construccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, ubicacion, dimensiones_m2, cant_habitantes, tipo_construccion);
    }
}
