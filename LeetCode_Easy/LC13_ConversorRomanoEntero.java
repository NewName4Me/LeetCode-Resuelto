package LeetCode_Easy;
import java.util.*;

public class LC13_ConversorRomanoEntero {
    public static void main(String[]args){
        /*
        Un programa donde metemos un String en numeros romanos y nos lo convierte a entero
        I,V,X,L,C,D,M
        
        la parte más complicada del programa va a ser los numeros que son así 4,9 en cualquiera
        de sus formas
        
        I solo puede estar delante de X y V
        X de L y C
        C de D y M
        
        tendre que comparar el caracter con el que estamos ahroa con el siguiente
        y en caso de que sea alguna de esas situaciones que reste
        
        
        Basicamente el programa funciona asi: 
        Realizamos todas y cada una de las sumas necesarias para tener el numero romano, mientras que a su vez
        comparamos los caracteres n y n+1 para ver si existen una de las 6 circunstancias donde tenemos que restar
        y en caso de que se de le restamos pero el doble, debido a que la suma se ejecutó primero
        
        https://leetcode.com/problems/roman-to-integer/submissions/1096566680/
        si lo probamos el leetcode se ejecuta 2ms por tanto vence al 100% del resto de usuarios en java 😎
        pero usa 43,57 mb de memoria y solo vence al 62,49 %
        */
        Scanner scanner= new Scanner(System.in);
        
        //variables
        String numRomano;
        int sum=0;
        char numRomanoChar;
        char numRomanoComp='@';//valor cualquiera menos un simbolo romano
        
        //programa
        System.out.println("Inserte un número romano(mayúsculas obvio) y se lo muestro en decimal");
        numRomano=scanner.next();
        
        for(int i=0;i<numRomano.length();i++){//mira letra a letra los numeros romanos insertados
            
            numRomanoChar=numRomano.charAt(i);
            
            //casos particulares donde debemos restar
            if((numRomanoComp=='I') && (numRomanoChar=='V' || numRomanoChar=='X')){
                sum-=2;//le quitamos 2 en lugar de una por la existencia de la primera iteración que siempre nos da uno más
            }
            else if((numRomanoComp=='X') && (numRomanoChar=='L' || numRomanoChar=='C')){
                sum-=20;
            }
            else if((numRomanoComp=='C') && (numRomanoChar=='D' || numRomanoChar=='M')){
                sum-=200;
            }

            //todas las sumas
            switch(numRomanoChar){//segun cada caracter le suma uno u otro
                    //si hacemos así el switch no hay que poner break
                    case 'I' -> sum++;
                    case 'V' -> sum+=5;
                    case 'X' -> sum+=10;
                    case 'L' -> sum+=50;
                    case 'C' -> sum+=100;
                    case 'D' -> sum+=500;
                    case 'M' -> sum+=1000;
                }//fin del switch de la suma
            
            numRomanoComp=numRomanoChar;//le asignamos el valor al final porque numRomanoChar se actualiza arriba y el comparadaor no
            //asi podemos mirar el valor anterior y el nuevo sin problema
            
        }//fin del for
        
        //salida
        System.out.println(sum);


    }
}
