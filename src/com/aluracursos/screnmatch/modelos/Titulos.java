package com.aluracursos.screnmatch.modelos;

public class Titulos {
    private String nombre;
    private int fechaLanzamiento;
    private int duracionMinutos;
    private boolean includidoEnPlan;

    private double sumaDeEvaluaciones; //private es un modificador
    private int totalEvaluaciones;

    //geters

    public String getNombre() {
        return nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public boolean isIncludidoEnPlan() {
        return includidoEnPlan;
    }

    //seters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setIncludidoEnPlan(boolean includidoEnPlan) {
        this.includidoEnPlan = includidoEnPlan;
    }

    public int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es:" + nombre);
        System.out.println("fecha de lanzamiento es: " + fechaLanzamiento);
        System.out.println("Duracion en minutos es: "+ duracionMinutos);
    }

    public void evalua(double nota){
        sumaDeEvaluaciones += nota;
        totalEvaluaciones ++;
    }
    public double calculaMedia(){
        return sumaDeEvaluaciones / totalEvaluaciones;
    }
}
