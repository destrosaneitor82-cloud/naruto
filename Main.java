import personajes.Ninja;
import patrones.NinjaFactory;
import patrones.NinjaBuilder;
import patrones.EvaluarMisionVisitor;
import jutsus.Ninjutsu;
import misiones.Mision;

public class Main {
    public static void main(String[] args) {
        // Usando Factory
        Ninja naruto = NinjaFactory.crearNinja("naruto");
        naruto.mostrarInfo();
        naruto.agregarJutsu(new Ninjutsu("Rasengan"));
        naruto.usarJutsus();

        // Usando Builder
        Ninja customNinja = new NinjaBuilder()
                .setNombre("Itachi Uchiha")
                .setAldea("Konoha")
                .setRango("Anbu")
                .build();
        customNinja.mostrarInfo();

        // Misión
        Mision mision = new Mision("Proteger al Hokage", "Alta");
        mision.asignar(naruto);

        // Visitor
        EvaluarMisionVisitor visitor = new EvaluarMisionVisitor();
        naruto.aceptar(visitor);
    }
}
