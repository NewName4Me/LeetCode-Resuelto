package LeetCode_Easy;

import java.util.Arrays;

public class LT66_PlusOne {
    public static void main(String[]args){
        /*
        nos dan un array que representan todos los digitos de un numero, le tenemos que sumar uno al ultimo siempre,
        en caso de que este sea 10 comoresultante, pues se dividira en todas partes [1,0] donde el uno se le sumara
        al siguiente y puede que asi hasta el final
        
        https://leetcode.com/problems/plus-one/submissions/1121327219/
        */
        int[]digits={9,9,9,9};//insertar array a analizar
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int i=1;
        int position=digits[digits.length-i];
        
        if(position!=9){//en caso de que la ultima posicion sea distinta de 9 le sumamos uno y listo
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
        }
        
        try{
            while(position==9){ //para analizar los casos donde comenzamos con un nueve
                digits[digits.length-i]=0;//convertimos a 0 todas las posiciones donde tengamos un nueve si estan continuas desde el final
                i++;
                position=digits[digits.length-i];//actualizamos nuestra posicion
            }
            digits[digits.length-i]+=1;//le sumamos 1 al valor que nos quedó al final

            return digits;
        }catch(ArrayIndexOutOfBoundsException e){
            //en el caso de que todos nuestros numeros sean 9 necesitamos un nuevo array de longitud aumentada como este
            int[] salida =new int[digits.length+1];
            salida[0]=1;//le damos uno a la primera posicion de todas el resto son ceros
            return salida;
        }
        
    }
}
