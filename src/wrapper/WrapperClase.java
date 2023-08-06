package wrapper;
import java.lang.reflect.Method;

import decoracion.DecoracionTerminal;

public class WrapperClase {
    public static void IntegerWrapper(){
        String nombreMetodo = new Object() {}.getClass().getEnclosingMethod().getName();
        DecoracionTerminal.astericosPrint(nombreMetodo);
        
        int intPrimitivo = 45_535;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        int numero = intObjeto;
        System.out.println("numero= " + numero);

        Short shortObjeto = intObjeto2.shortValue();
        System.out.println("shortObjeto= " + shortObjeto);

        DecoracionTerminal.astericosPrint();
    }

    public static void ejemploMetodoGetClass(){
        String nombreMetodo = new Object() {}.getClass().getEnclosingMethod().getName();
        DecoracionTerminal.astericosPrint(nombreMetodo);
        String texto = "Hola que tal!";

        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName()) = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        for (Method metodo : strClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }
        DecoracionTerminal.astericosPrint();

    }

    public static void pasarArgumentoPorValor(){
        String nombreMetodo = new Object() {}.getClass().getEnclosingMethod().getName();
        DecoracionTerminal.astericosPrint(nombreMetodo);
        System.out.println("nombreMetodo = " + nombreMetodo);
        //Recordar que ni un primitivo o wrapper se cambian sus valores, clases inmutables
        Integer objetoWrapperInteger = 45_344;
        int primitivoEntero = 644_345;

        System.out.println("objetoWrapperInteger= " + objetoWrapperInteger);
        System.out.println("primitivoEntero= " + primitivoEntero);

        cambiarValorPorArgumento(objetoWrapperInteger, primitivoEntero);

    System.out.println("nombreMetodo = " + nombreMetodo);
        System.out.println("objetoWrapperInteger= " + objetoWrapperInteger);
        System.out.println("primitivoEntero= " + primitivoEntero);
        DecoracionTerminal.astericosPrint();
    }

    public static void pasarPorReferencia(){
        //Los arreglos y listas se ideales
        String nombreMetodo = new Object() {}.getClass().getEnclosingMethod().getName();
        DecoracionTerminal.astericosPrint(nombreMetodo);
        System.out.println("nombreMetodo = " + nombreMetodo);
        int[] arregloEnteros = {34,245,3_456};
        for (int i = 0; i < arregloEnteros.length; i++) {
            System.out.println("arregloEnteros[" + i +"]= " + arregloEnteros [i]);
        }
    }

    private static void cambiarValorPorArgumento(Integer wrapperEntero, int primitivoEntero){
        String nombreMetodo = new Object() {}.getClass().getEnclosingMethod().getName();
        System.out.println("nombreMetodo = " + nombreMetodo);
        wrapperEntero = 35;
        primitivoEntero = 4_546;
        System.out.println("wrapperEntero= " + wrapperEntero);
        System.out.println("primitivoEntero= " + primitivoEntero);
    }
}
