package com.eoi;

public class Cuadrado extends Figura {
    public Cuadrado(float lado) {
        this.lado = lado;
    }

    private float lado;


    @Override
    public double getPerimetro() {
        return lado*4;
    }
        
    @Override
    public double getArea() {
        return lado*lado;
    }

}
