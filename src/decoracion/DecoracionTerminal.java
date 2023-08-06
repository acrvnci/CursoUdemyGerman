package decoracion;
public class DecoracionTerminal {
    private static final int NUMERO_ASTERISCOS = 70;

    public static void astericosPrint(String metodoNombre){
        int indiceI = 0;
        StringBuilder cadenaChars = new StringBuilder();
        int tamNombreMetodo = metodoNombre.length() + 2;

        int mediaAsterisco = NUMERO_ASTERISCOS - (tamNombreMetodo/2);
        for (indiceI = 0; indiceI < mediaAsterisco; indiceI++) {
            cadenaChars.append('*');
        }

        
        System.out.print(cadenaChars.toString());
        System.out.print(" " + metodoNombre + " ");
        System.out.println(cadenaChars.toString());
    }

    public static void astericosPrint(){
        int indiceI = 0;
        StringBuilder cadenaChars = new StringBuilder();
        int numTotalAsteriscos = NUMERO_ASTERISCOS * 2;
        for (indiceI = 0; indiceI < numTotalAsteriscos ; indiceI++) {
            cadenaChars.append('*');
        }

        System.out.println(cadenaChars.toString());
    }
}
