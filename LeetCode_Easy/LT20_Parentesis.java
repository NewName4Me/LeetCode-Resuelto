package LeetCode_Easy;

import java.util.ArrayList;
import java.util.HashMap;

public class LT20_Parentesis {
    public static void main(String[] args) {
        /*
        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.
        
        https://leetcode.com/problems/valid-parentheses/submissions/1160431333/
        */
        // Variables
        String s = "{}()";

        // Llamadas
        System.out.println(isValid(s));
    }

    // Método que comprueba si los paréntesis introducidos son correctos
    public static boolean isValid(String s) {
        // Mapa que almacena cada apertura con su cierre
        HashMap<Character, Character> parentheses = new HashMap<>();
        parentheses.put('{', '}');
        parentheses.put('[', ']');
        parentheses.put('(', ')');

        // Lista donde guardamos todas nuestras aperturas para compararlas más cómodamente
        ArrayList<Character> check = new ArrayList<>();

        // Programa
        for (char c : s.toCharArray()) {
            if (parentheses.containsKey(c)) { //en caso de que tengamos un llave, es decir una apertura lo añadimos a nuestro array de comparacion
                check.add(c); // Guardamos nuestras llaves de apertura temporalmente para compararlas
            } else { //claramente cuando no es un apertura o llave debe ser un cierre
                // Cuando recibimos un cierre, comprobamos si este está contenido anteriormente en nuestra lista
                if (check.isEmpty() || c != parentheses.get(check.remove(check.size() - 1))) {
                    // En caso de que nuestra lista esté vacía o no coincida con la llave correspondiente, está mal
                    return false;
                }
            }
        }

        // En caso de que no se ejecute en ningún momento el código de dentro, significa que está bien
        return check.isEmpty();
    }
}
