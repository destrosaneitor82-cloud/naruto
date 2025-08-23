package personajes;

import jutsus.Jutsu;
import patrones.Visitor;
import java.util.ArrayList;
import java.util.List;

public class Ninja extends Personaje {
    private String rango;
    private List<Jutsu> jutsus;

    public Ninja(String nombre, String aldea, String rango) {
        super(nombre, aldea);
        this.rango = rango;
        this.jutsus = new ArrayList<>();
    }

    public void agregarJutsu(Jutsu jutsu) {
        jutsus.add(jutsu);
    }

    public String getRango() { return rango; }

    public void usarJutsus() {
        for (Jutsu j : jutsus) {
            j.ejecutar();
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Ninja: " + nombre + " | Aldea: " + aldea + " | Rango: " + rango);
    }

    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }
}
