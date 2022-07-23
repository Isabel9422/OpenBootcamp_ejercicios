abstract public class Coche {
    String modelo = "";
    String marca = "";
    String patente = "";
    int velocidad = 0;

    public Coche() {

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Coche(String modelo, String marca, String patente, int velocidad) {
        this.modelo = modelo;
        this.marca = marca;
        this.patente = patente;
        this.velocidad = velocidad;
    }

    public void Encender(){
        System.out.println("El coche eléctrico está encendido.");
    }
    public void acelerar(){
        velocidad++;
    }
    public void frenar(){
        if(velocidad > 0){
            velocidad--;
        } else{
            System.out.println("El coche no está en movimiento.");
        }
    }
    public void Apagar(){
        System.out.println("El coche eléctrico está apagado.");
    }
}