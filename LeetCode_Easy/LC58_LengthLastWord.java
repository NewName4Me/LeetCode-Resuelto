package LeetCode_Easy;
import java.util.*;

public class LC58_LengthLastWord {
    public static void main(String[]args){
        /*
        dada una frase que me de la longitud de la ultima palabra
        */
        Scanner scanner=new Scanner(System.in);
        
        //variables
        String frase="";
        String[] salida;
        
        //programa
        System.out.println("Deme una frase y le indico cuanto mide la ultima palabra");
        frase=scanner.nextLine();
        
        salida=frase.split(" ");//cada vez que detectamos un espacio lo añadimos al nuestro array
        
        System.out.println(salida[salida.length-1]);//esto nos imprime la ultima palabra de nuestra lista
        System.out.println(salida[salida.length-1].length()); //la longitud del ultimo elemento
    }
}
