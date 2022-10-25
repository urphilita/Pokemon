package Logica;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle(int numPokedex,String nombre,double peso,String sexo,int temporada){
        super(numPokedex,nombre,peso,sexo,temporada);
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy "+nombre+" y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy "+nombre+" y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy "+nombre+" y este es mi ataque mordisco");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Hola soy "+nombre+" y este es mi ataque Hidro Bomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy "+nombre+" y este es mi ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy "+nombre+" y este es mi ataque Pistola Agua");
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
        }
    }
}
