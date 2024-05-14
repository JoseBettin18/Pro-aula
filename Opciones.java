
package com.mycompany.turismo1;
import java.util.Scanner;

public class Opciones {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su usuario: ");
        String user = sc.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String contraseña = sc.nextLine();
        
        System.out.println("¡BIENVENIDO!" + user);
        System.out.println("Elija un lugar para visitar:");
        
        //Opcion1
        System.out.println("1. Restaurantes:");
        //Submenu1
        System.out.println("1.1 - Henry´s");
        System.out.println("1.2 - El Totumazo de Mayeya. ");
        System.out.println("1.3 - Braza y Barril. ");
        System.out.println("1.4 - Restaurante Mar de las Antillanas. ");
        
        //Opcion2
        System.out.println("2. Museos:");
        //Submenu2
        System.out.println("2.1 - Museo del Oro. ");
        System.out.println("2.2 - Museo de Arte Moderno. ");
        System.out.println("2.3 - Museo San Pedro Claver. ");
        System.out.println("2.4 - Museo Naval del Caribe. ");
        
        //Opcion3
        System.out.println("3. Discotecas");
        //Submenu3
        System.out.println("3.1 - El Bar Etico. ");
        System.out.println("3.2 - Jet-Set. ");
        System.out.println("3.3 - Engels. ");
        System.out.println("3.4 - Epico Social Club. ");
        
        //Opcion4
        System.out.println("4. confirmar");
        
        int opcion1 = sc.nextInt();
        int opcion2 = sc.nextInt();
        int opcion3 = sc.nextInt();
        var opcion4 = sc.nextInt();
        
        //Menu y submenu
        switch (opcion1) {
            case 1:
                System.out.println("Henry´s. ");
                break;
            case 2:
                System.out.println("El Totumazo de Mayeya. ");
                break;
            case 3:
                System.out.println("Braza y Barril. ");
                break;
            case 4:
                System.out.println("Restaurante Mar de las Antillanas. ");
                break;
            default:
                System.out.println("Operacion Invalida. ");
                break;
        }
        
        switch (opcion2) {
            case 1:
               System.out.println("Museo del Oro. ");
                break;
            case 2:
                System.out.println("Museo de Arte Moderno. ");
                break;
            case 3:
               System.out.println("Museo San Pedro Claver. ");
                break;
            case 4:
                System.out.println("Museo Naval del Caribe. ");
            default:
                System.out.println("opcion invalida. ");
                break;
        }
        
        switch (opcion3) {
            case 1:
               System.out.println("El Bar Etico. ");
                break;
            case 2:
                System.out.println("Jet-Set. ");
                break;
            case 3:
               System.out.println("Engels. ");
                break;
            case 4:
                System.out.println("Epico Social Club. ");
            default:
                System.out.println("opcion invalida. ");
                break;
        }
        switch (opcion4){
    case 1:
        System.out.println("¡CONFIRMADO!");
        break;
        }
        
        sc.close();
    }

    static void Opciones1() {
        
    }
}