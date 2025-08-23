package misiones;

import personajes.Ninja;

public class Mision {
    private String descripcion;
    private String dificultad;

    public Mision(String descripcion, String dificultad) {
        this.descripcion = descripcion;
        this.dificultad = dificultad;
    }

    public String getDescripcion() { return descripcion; }
    public String getDificultad() { return dificultad; }

    public void asignar(Ninja ninja) {
        System.out.println("Misión '" + descripcion + "' asignada a " + ninja.getNombre());
    }
}
