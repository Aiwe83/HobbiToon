package org.aiwe.comarca.domain;

import java.util.Objects;

public class Hobbit {

    private String nombre;
    private int edad;
    private String raza;
    private String habitad;
    private String poder;

    public Hobbit() {

    }

    public String getNombre() {
        return ;
    }

    public Hobbit setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getEdad() {
        return edad;
    }

    public Hobbit setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public String getRaza() {
        return raza;
    }

    public Hobbit setRaza(String raza) {
        this.raza = raza;
        return this;
    }

    public String getHabitad() {
        return habitad;
    }

    public Hobbit setHabitad(String habitad) {
        this.habitad = habitad;
        return this;
    }

    public String getPoder() {
        return poder;
    }

    public Hobbit setPoder(String poder) {
        this.poder = poder;
        return this;
    }

    public Hobbit(String nombre, int edad, String raza, String habitad, String poder) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.habitad = habitad;
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Hobbit{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", habitad='" + habitad + '\'' +
                ", poder='" + poder + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hobbit hobbit = (Hobbit) o;
        return edad == hobbit.edad && Objects.equals(nombre, hobbit.nombre) && Objects.equals(raza, hobbit.raza) && Objects.equals(habitad, hobbit.habitad) && Objects.equals(poder, hobbit.poder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, raza, habitad, poder);
    }
}




