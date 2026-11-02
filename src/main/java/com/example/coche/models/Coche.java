package com.example.coche.models; // Ajusta a tu paquete real

public class Coche {
    private int id;
    private String marca;
    private String modelo;
    private int propietarioId; // ID del propietario asociado
    
    public Coche(int id, String marca, String modelo, int propietarioId) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.propietarioId = propietarioId;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getPropietarioId() {
     return propietarioId; 
    }
   
    public void setPropietarioId(int propietarioId) {
         this.propietarioId = propietarioId; 

    }
    
    public void arrancar() {
        System.out.println("El coche " + marca + " " + modelo + " está arrancando.");
    }
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
