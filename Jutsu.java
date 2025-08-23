package jutsus;

public abstract class Jutsu {
    protected String nombre;

    public Jutsu(String nombre) {
        this.nombre = nombre;
    }

    public abstract void ejecutar();
}
