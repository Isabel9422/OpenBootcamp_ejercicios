public class CocheHibrido extends Coche{
        String tipoCombustible;
        String tipoBateria;

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public CocheHibrido(){}
        public CocheHibrido(String tipoBateria, String tipoCombustible){
            super();
            this.tipoCombustible = tipoCombustible;
            this.tipoBateria = tipoBateria;
        }

        @Override
        public String toString() {
            return "CocheHibrido{" +
                    "modelo='" + modelo + '\'' +
                    ", marca='" + marca + '\'' +
                    ", velocidad=" + velocidad +
                    ", tipoCombustible='" + tipoCombustible + '\'' +
                    ", tipoBateria='" + tipoBateria + '\'' +
                    ", patente='" + patente + '\'' +
                    '}';
        }
    }