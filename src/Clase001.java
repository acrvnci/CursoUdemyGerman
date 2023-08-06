import decoracion.DecoracionTerminal;

public class Clase001 {
    public static void claseStrings(){
        String nombreMetodo = new Object() {}.getClass().getEnclosingMethod().getName();
        DecoracionTerminal.astericosPrint(nombreMetodo);
        String cadena = "Hola Mundo";
        System.out.println(cadena);
        DecoracionTerminal.astericosPrint();
    }
}
