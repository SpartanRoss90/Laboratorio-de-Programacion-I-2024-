
package tp1;

import java.util.Scanner;

public class TP1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String respuesta;
                
        do {
            System.out.println("Ingrese una lista de razas de perros.");
            System.out.println("Ingrese una raza o escriba salir para terminar: ");
            respuesta = scanner.nextLine();
            
        } while (respuesta!="salir");   
       
        
    }
    
}
