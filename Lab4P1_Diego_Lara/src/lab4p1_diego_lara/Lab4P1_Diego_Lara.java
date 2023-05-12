/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_diego_lara;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Lab4P1_Diego_Lara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerS = new Scanner(System.in);
        Scanner leerI = new Scanner(System.in);
        boolean respuesta = true;
        while(respuesta) {
            System.out.println("1. Conjuntos");
            System.out.println("2. Contraseña Mejorada");
            System.out.println("3. Salir");
            int opcion = leerI.nextInt();
            switch(opcion) {
                case 1: {
                    String A;
                    String B;
                    System.out.println("Ingrese el primer conjunto: ");
                    A = leerS.next();
                    System.out.println("Ingrese el segundo conjunto: ");
                    B = leerS.next();
                    
                    if (A.equals(B)) {
                        System.out.println("Ambos conjuntos son Iguales");
                    } else {
                        System.out.println("Ambos conjuntos no son Iguales");

                    }
                }
                break;
                
                case 2: {
                    System.out.println("Ingrese la contraseña: ");
                    String contra = leerS.next();
                    System.out.println("Ingrese el numero: ");
                    int numero = leerI.nextInt();
                    
                    if(contra.length() < 8) {
                        System.out.println("La contrasena no es segura porque tiene menos de 8 caracteres");
                    } else {
                        System.out.println("La contrasena es segura");
                        String palabra = "";
                        for(int i = 0; i < contra.length(); i += 2) {
                             palabra += contra.charAt(i);
                             if(i + 1 < contra.length()) {
                                 palabra += contra.charAt(i+1); 
                             }
                             palabra += numero++;
                        }
                        System.out.println("La nueva contrasena es: " + palabra);
                    }
                }
                    break;
                case 3: {
                    respuesta = false;
                }
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }
    }
    
}
