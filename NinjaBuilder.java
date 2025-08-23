package patrones;

import personajes.Ninja;
import jutsus.Jutsu;

public class NinjaBuilder {
    private String nombre;
    private String aldea;
    private String rango;

    public NinjaBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public NinjaBuilder setAldea(String aldea) {
        this.aldea = aldea;
        return this;
    }

    public NinjaBuilder setRango(String rango) {
        this.rango = rango;
        return this;
    }

    public Ninja build() {
        return new Ninja(nombre, aldea, rango);
    }
}
