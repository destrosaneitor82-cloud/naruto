package patrones;

import personajes.Ninja;

public class EvaluarMisionVisitor implements Visitor {
    @Override
    public void visitar(Ninja ninja) {
        System.out.println("Evaluando misión completada por el ninja " + ninja.getNombre());
    }
}
