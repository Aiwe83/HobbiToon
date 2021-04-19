package org.aiwe.comarca;

import org.aiwe.comarca.domain.Comarca;
import org.aiwe.comarca.domain.Frodo;
import org.aiwe.comarca.domain.Hobbit;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestion {
    private boolean salir;
    private Scanner tc;

    public Gestion() {
        salir = false;
        tc = new Scanner(System.in);

    }

    public void ejecutar() {
        do {
            System.out.println("_________________||La org.aiwe.comarca.domain.Comarca||____________  ");
            System.out.println("                      Menú                      ");
            System.out.println("Aplicación GesTaller v0.1");
            System.out.println("1.Agregar Hobbits");
            System.out.println("2.Agregar Comarcas");
            System.out.println("3.Agregar cualidades a org.aiwe.comarca.domain.Frodo");
            System.out.println("4.Listar caracteristicas Hobbits");
            System.out.println("5.Listar caracteristicas org.aiwe.comarca.domain.Comarca");
            System.out.println("6.Listar caracteristicas org.aiwe.comarca.domain.Frodo");
            System.out.println("x.Salir");
            System.out.print("Selecciona: ");

            String opcion = tc.nextLine();

            switch (opcion) {
                case "1":
                    AgregarHobbit();
                    break;
                case "2":
                    AgregarComarca();
                    break;
                case "3":
                    AgregarFrodo();
                    break;
                case "4":
                    ListarHobbit();
                    break;
                case "5":
                    ListarComarca();
                    break;
                case "6":
                    ListarFrodo();
                    break;
                case "x":
                    salir();
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private void ListarFrodo() {
        ArrayList<Frodo> frodoArrayList=new ArrayList<>();
        Frodo frodo1=new Frodo(110,"mithrill","anillo de poder","pescado y hiervas del bosque","conejo");
        for(Frodo frodo:frodoArrayList);
        System.out.println(frodoArrayList);
    }
    private void ListarComarca() {
        ArrayList<Comarca> comarcaArrayList =new ArrayList<>();
        Comarca comarca1=new Comarca("la fuente","frontera de eredor",155,188,"madera");
        Comarca comarca2=new Comarca("flor dorada","indur",200,100,"cañamo");
        Comarca comarca3=new Comarca("bellatina","molsen",120,140,"madera-oscura");
        Comarca comarca4=new Comarca("hobbittown","isildur",500,300,"tierra");
        Comarca comarca5=new Comarca("hada peregrina","mar de las hadas",190,100,"pino");

        comarcaArrayList.add(comarca1);
        comarcaArrayList.add(comarca2);
        comarcaArrayList.add(comarca3);
        comarcaArrayList.add(comarca4);
        comarcaArrayList.add(comarca5);
        for(Comarca comarca:comarcaArrayList);
        System.out.println( comarcaArrayList);


    }

    private void ListarHobbit() {
        ArrayList<Hobbit> hobbitArrayList =new ArrayList<>();
       Hobbit hobbit1=new Hobbit("sam",78,"hobbit-pacifico","montañas","valentia");
        Hobbit hobbit2=new Hobbit("fili",88,"hobbit-temerario","montañas escarpadas","agilidad");
        Hobbit hobbit3=new Hobbit("mr zoe",50,"hobbit-temerario","mar","elocuencia");
        Hobbit hobbit4=new Hobbit("Fili",128,"hobbit-pacifico","mar","cazador");
        Hobbit hobbit5=new Hobbit("aiwe",79,"hobbit-pies agiles","estepas","agilidad");

        hobbitArrayList .add(hobbit1);
        hobbitArrayList .add(hobbit2);
        hobbitArrayList .add(hobbit3);
        hobbitArrayList .add(hobbit4);
        hobbitArrayList .add(hobbit5);

        for(Hobbit hobbit:hobbitArrayList);
        System.out.println( hobbitArrayList);

    }


    private void AgregarFrodo() {
        ArrayList<Frodo> frodoArrayList = new ArrayList<>();
        System.out.println("altura?");
        int altura = tc.nextInt();
        System.out.println("armadura?");
        String armadura = tc.nextLine();
        System.out.println("accesorios?");
        String accesorios= tc.nextLine();
        System.out.println("alimentacion?");
        String alimentacion= tc.nextLine();
        System.out.println("mascota?");
        String mascota= tc.nextLine();
        Frodo frodo=new Frodo(altura,armadura,accesorios,alimentacion,mascota);
        frodoArrayList.add(frodo);
        System.out.println(frodoArrayList);
    }

    private void AgregarComarca() {
        ArrayList<Comarca> comarcaArrayList = new ArrayList<>();
        System.out.println("nombre?");
        String nombre = tc.nextLine();
        System.out.println("ubicacion?");
        String ubicacion = tc.nextLine();
        System.out.println("diensiones_m2?");
        int dimensiones_m2= tc.nextInt();
        System.out.println("cant_habitantes?");
        int cant_habitantes = tc.nextInt();
        System.out.println("tipo_construccion?");
        String tipo_construccion= tc.nextLine();
        Comarca comarca=new Comarca(nombre,ubicacion,dimensiones_m2,cant_habitantes,tipo_construccion);
        comarcaArrayList.add(comarca);
        System.out.println(comarcaArrayList);
    }

    private void AgregarHobbit() {

        ArrayList<Hobbit> hobbitArrayList = new ArrayList<>();
        System.out.println("nombre?");
        String nombre = tc.nextLine();
        System.out.println("edad?");
        int edad = tc.nextInt();
        System.out.println("raza?");
        String raza= tc.nextLine();
        System.out.println("habitad?");
        String habitad = tc.nextLine();
        System.out.println("poder?");
        String poder= tc.nextLine();
        Hobbit hobbit=new Hobbit(nombre,edad,raza,habitad,poder);
        hobbitArrayList.add(hobbit);
        System.out.println(hobbitArrayList);


    }
    private void salir() {

    }

}
