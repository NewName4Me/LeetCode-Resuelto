package LeetCode_Easy;
import java.util.*;

public class LC9_Num_Palíndromo {
    public static void main(String[]args){
        /*
        Un ejercicio que compruebe si un número introducido es o no palíndromo
        
        //es extremadamente lento comparado con otra opciones de leetcode, seguramente lo actualice
        */
        Scanner scanner = new Scanner(System.in);
        
        //variables
        int num;
        String numReversed="";
        String numString;//para covertilo a string y poder studiarlo mas facilmente
        char numChar;
        
        //programa
        System.out.println("Dame un numero y te dire si es o no palíndromo");
        num=scanner.nextInt();
        
        numString=Integer.toString(num); //convierte nuestro numero en texto
        
        for(int i=0;i<numString.length();i++){//analiza cada numero uno a uno
            numChar=numString.charAt(i);
            numReversed=numChar+numReversed;//alamcena nuestro numero del reves
        }
        
        //salida
        if(numReversed.equals(numString)){ //comprueba si nuestro numero es igual del derecho que del reves
            System.out.println("Palíndromo");
        }
        else{
            System.out.println("No palíndromo");
        }
        
    }
}
