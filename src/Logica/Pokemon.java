package Logica;

public abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    public Pokemon(){

    }
    public Pokemon(int numPokedex, String nombre, double peso, String sexo, int temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
        this.temporada = temporada;
    }

    protected abstract void atacarPlacaje();
    protected abstract void atacarPlacaje2();
    protected abstract void atacarPlacaje3();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
}
