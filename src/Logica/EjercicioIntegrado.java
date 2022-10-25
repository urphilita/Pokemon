package Logica;

public class EjercicioIntegrado {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle(34,"Squirt",25.6,"masculino",1);
        Charmander charmander = new Charmander();
        Bulbasaur bulb = new Bulbasaur();
        Pikachu pika = new Pikachu();

        squirtle.atacarAraniazo();
        squirtle.atacarHidroBomba();

        charmander.atacarAraniazo();
        charmander.atacarLanzaLlamas();

        bulb.atacarAraniazo();
        bulb.atacarDrenaje();

        pika.atacarAraniazo();
        pika.atacarImpactrueno();
    }
}
