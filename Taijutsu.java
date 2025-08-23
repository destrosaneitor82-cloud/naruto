package jutsus;

public class Taijutsu extends Jutsu {
    public Taijutsu(String nombre) {
        super(nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando Taijutsu: " + nombre);
    }
}
