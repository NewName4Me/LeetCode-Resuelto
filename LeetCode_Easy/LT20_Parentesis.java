package LeetCode_Easy;

import java.util.HashMap;
import java.util.Stack;

public class LT20_Parentesis {
    public static void main(String[] args) {
        /*
        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.
        */
        //variables
        String s = "{}()";
        
        //llamadas
        System.out.println(isValid(s));
    }
    //metodo que comprueba si los parentesis introducidos son corretos
    public static boolean isValid(String s) {
        //salida
        HashMap<Character, Character> parentheses = new HashMap<>(); //almacenamos cada apertura con su cierra
        parentheses.put('{', '}');
        parentheses.put('[', ']');
        parentheses.put('(', ')');

        Stack<Character> stack = new Stack<>(); //donde guardamos todas nuestras aperturas para comparaslas mas comodamente

        //programa
        for (char c : s.toCharArray()) { //recorremos todos los valores de nuestro String y lo convertimos a array 
            if (parentheses.containsKey(c)) { 
                stack.push(c); //guardamos nuestras llaves de apertura temporalmente para compararlas
            } else if (parentheses.containsValue(c)) { //cuando recibimo un cierre debemos comprobar si este esta contenido anteriormente en nuestro arraya
                if (stack.isEmpty() || c != parentheses.get(stack.pop())) {//en caso de que nuestro array este vacio o no coincida con la llave correspondiente esta mal
                    return false;
                }
            }
        }//en caso de que no se ejecute en ningun momento el codigo de dentro quiere decir que esta bien

        //salida
        return stack.isEmpty();
    }
}
