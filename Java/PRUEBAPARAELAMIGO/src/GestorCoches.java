import java.util.ArrayList;

public class GestorCoches {
    CochesDBMemoria cochesDB = new CochesDBMemoria();

    public ArrayList<Coche> listarCoches(Coche coche) {
        return cochesDB.listar(coche);
    }

    public Coche obtenerCoche(Coche coche) {
        if (coche instanceof CocheElectrico) {
            Coche cocheElectrico = new CocheElectrico();

            return cochesDB.buscar(cocheElectrico);
        }

        if (coche instanceof CocheDeCombustible) {
            Coche cocheDeCombustible = new CocheDeCombustible();

            return cochesDB.buscar(cocheDeCombustible);
        }

        if (coche instanceof CocheHibrido){
            Coche cocheHibrido = new CocheHibrido();

            return cochesDB.buscar(cocheHibrido);
        }

        return null;
    }

    public void crearCoche(Coche coche) {
        if (coche instanceof CocheElectrico) {
            if (cochesDB.buscar(coche) != null) {
                System.out.println("El coche ya existe");
            }else {
                System.out.println("aqui llegas?");
                cochesDB.crear(coche);
            }
        }

       /* if (coche instanceof CocheDeCombustible) {
            if (cochesDB.obtener(coche) != null) {
                System.out.println("El coche ya existe");
            }else {

                cochesDB.crear(coche);
            }
        } */

        if (coche instanceof CocheHibrido){
            if (cochesDB.buscar(coche) != null) {
                System.out.println("El coche ya existe");
            }else {

                cochesDB.crear(coche);
            }
        }
    }

    public void borrarCoche(Coche coche) {
        if (coche instanceof CocheElectrico) {
            Coche cocheElectrico = new CocheElectrico();

            cochesDB.borrar(cocheElectrico);
        }

        if (coche instanceof CocheDeCombustible) {
            Coche cocheDeCombustible = new CocheDeCombustible();

            cochesDB.borrar(cocheDeCombustible);
        }

        if (coche instanceof CocheHibrido){
            Coche cocheHibrido = new CocheHibrido();

            cochesDB.borrar(cocheHibrido);
        }
    }
}