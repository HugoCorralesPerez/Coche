package com.example.coche;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.coche.models.Coche;
import com.example.coche.models.Propietario;

@SpringBootApplication
public class CocheApplication {

    public static void main(String[] args) {
        SpringApplication.run(CocheApplication.class, args);

        // 1. Crear el ArrayList de Propietarios
        List<Propietario> propietarios = new ArrayList<>();
        propietarios.add(new Propietario(1, "Carlos Gómez"));
        propietarios.add(new Propietario(2, "Ana Martínez"));
        propietarios.add(new Propietario(3, "Luis Fernández"));

        // 2. Crear el ArrayList de Coches (¡SIN escribir "id:", "marca:", etc.!)
        List<Coche> coches = new ArrayList<>();
        coches.add(new Coche(1, "Ford", "Kuga", 1));
        coches.add(new Coche(2, "Opel", "Astra", 2));
        coches.add(new Coche(3, "Renault", "Megane", 1));
        coches.add(new Coche(4, "Volkswagen", "Golf", 3));

        // Probar métodos
        coches.get(0).arrancar();
        coches.get(1).arrancar();

        // 3. Recorrer y buscar propietario
        System.out.println("\n=== RELACIÓN DE COCHES Y SUS PROPIETARIOS ===");
        for (Coche coche : coches) {
            Propietario dueno = buscarPropietarioPorId(propietarios, coche.getPropietarioId());
            if (dueno != null) {
                System.out.println("El coche " + coche.getMarca() + " " + coche.getModelo() + 
                                   " pertenece a: " + dueno.getNombre());
            } else {
                System.out.println("El coche " + coche.getMarca() + " no tiene propietario.");
            }
        }
    }

    public static Propietario buscarPropietarioPorId(List<Propietario> propietarios, int idBuscado) {
        for (Propietario p : propietarios) {
            if (p != null && p.getId() == idBuscado) {
                return p;
            }
        }
        return null;
    }
}