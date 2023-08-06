import decoracion.DecoracionTerminal;

public class Clase064 {
    public static void BucleEtiquetasBuscar(){
        String nombreMetodo = new Object() {}.getClass().getEnclosingMethod().getName();
        DecoracionTerminal.astericosPrint(nombreMetodo);
        String frase = "trigo tres tristes tigres tragan trigotrigo en un trigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra; 

        int cantidad = 0;

        buscar:
        for (int i = 0; i <= maxFrase;) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if(frase.charAt(k++) != palabra.charAt(j)){
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i += maxPalabra;
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra '" +  palabra + "' en la frase");

        DecoracionTerminal.astericosPrint();
    }
}
