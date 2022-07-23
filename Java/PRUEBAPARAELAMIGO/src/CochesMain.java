public class CochesMain {
    public static void main(String[] args){
        Coche cocheElectrico = new CocheElectrico("Litio");
        cocheElectrico.patente = "ABC123";
        cocheElectrico.marca = "Chevrolet";
        cocheElectrico.modelo = "Astra";
        cocheElectrico.velocidad = 0;

        Coche cocheElectrico2 = new CocheElectrico("Litio");
        cocheElectrico2.patente = "ACD333";
        cocheElectrico2.marca = "Tesla";
        cocheElectrico2.modelo = "Model3";
        cocheElectrico2.velocidad = 0;

        Coche cocheHibrido = new CocheHibrido("Cadmio", "Diesel");
        cocheHibrido.patente = "AAB369";
        cocheHibrido.marca = "Ford";
        cocheHibrido.modelo = "Mondeo";
        cocheHibrido.velocidad = 0;

        GestorCoches gestorCoches = new GestorCoches();
        gestorCoches.crearCoche(cocheElectrico);
        gestorCoches.crearCoche(cocheElectrico2);
        gestorCoches.crearCoche(cocheHibrido);


        gestorCoches.listarCoches(cocheElectrico);
        System.out.println(gestorCoches.listarCoches(cocheElectrico));

    }
}