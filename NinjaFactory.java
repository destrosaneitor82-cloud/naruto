package patrones;

import personajes.Ninja;

public class NinjaFactory {
    public static Ninja crearNinja(String tipo) {
        switch (tipo.toLowerCase()) {
            case "naruto":
                return new Ninja("Naruto Uzumaki", "Konoha", "Genin");
            case "sasuke":
                return new Ninja("Sasuke Uchiha", "Konoha", "Genin");
            case "kakashi":
                return new Ninja("Kakashi Hatake", "Konoha", "Jonin");
            default:
                return new Ninja("Ninja Genérico", "Desconocida", "Chunin");
        }
    }
}
