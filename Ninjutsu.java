package jutsus;

public class Ninjutsu extends Jutsu {
    public Ninjutsu(String nombre) {
        super(nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando Ninjutsu: " + nombre);
    }
}
