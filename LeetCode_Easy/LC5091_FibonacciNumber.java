package LeetCode_Easy;

public class LC509_FibonnaciNumber {
    public static void main(String[]args){
        /*
        nos dicen piden que le demos todos los numeros de fibonnacci a partir de un numero dado,
        es decir por ejemplo nos piden que solo sumemos los 10 primeros o los que sean
        */

        //llamadas
        System.out.println(fib(5));
    }
    public static int fib(int n){
        //para el numero 0 y para el numero 1 la salida es 1
        if (n <= 1) {
            return n;
        } else {
            //recursividad
            return fib(n - 1) + fib(n - 2);
        }
    }
}
