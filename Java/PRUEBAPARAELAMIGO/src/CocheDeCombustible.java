public class CocheDeCombustible extends Coche{
    String tipoCombustible;

    public CocheDeCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public CocheDeCombustible(String modelo, String marca, String patente, int velocidad, String tipoCombustible) {
        super(modelo, marca, patente, velocidad);
        this.tipoCombustible = tipoCombustible;
    }

    public CocheDeCombustible() {

    }

    @Override
    public String toString() {
        return "CocheDeCombustible{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", patente=" + patente +
                '}';
    }
}