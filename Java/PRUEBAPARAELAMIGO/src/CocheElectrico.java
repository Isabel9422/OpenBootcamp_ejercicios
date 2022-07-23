public class CocheElectrico extends Coche {
        String tipoBateria;

        public CocheElectrico(){}
        public CocheElectrico(String tipoBateria) {
            super();
            this.tipoBateria = tipoBateria;
        }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    @Override
        public String toString() {
            return "CocheElectrico{" +
                    "modelo='" + modelo + '\'' +
                    ", marca='" + marca + '\'' +
                    ", velocidad=" + velocidad +
                    ", tipoBateria='" + tipoBateria + '\'' +
                    ", patente='" + patente + '\'' +
                    '}';
        }
    }
