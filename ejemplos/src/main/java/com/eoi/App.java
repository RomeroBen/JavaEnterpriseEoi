package com.eoi;

import java.util.ArrayList;
import java.util.List;

public class App 
{


    public static void ejercicio1() {
        List <Figura> figuras = new ArrayList<Figura>();
        figuras.add(new Circulo(5));
        figuras.add(new Cuadrado(5));
        figuras.add(new Circulo(3));
        figuras.add(new Cuadrado(7));
        figuras.add(new Circulo(2));
        figuras.add(new Cuadrado(9));

        for (Figura figura : figuras) {
            System.out.println("Area: " + figura.getArea() + " Perímetro: " + figura.getPerimetro());
        }

    }

    public static void main( String[] args )
    {
        ejercicio1();
    }
}
