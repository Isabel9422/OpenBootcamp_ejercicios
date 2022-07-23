package Creational_Patterns.Singleton;

public class Singleton {
    private static Singleton instancia;
    public int contador = 0;

    Singleton() { }

    public static Singleton getInstance() {
        if (instancia == null) {
            //Si no hay una instancia creada, creamos una nueva y si la hay, devolvemos dicha instancia
            // pero no creamos otra nueva
            instancia = new Singleton();
        }

        return instancia;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }
}
