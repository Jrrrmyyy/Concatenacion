
import java.util.Scanner;




public class Concatenacion {
  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Introduce tus apellidos");
        String apellidos = entrada.nextLine();
        
        System.out.println("Tu nombre y apellidos son: "+ nombre + " " +
         apellidos);
    }
    
}
