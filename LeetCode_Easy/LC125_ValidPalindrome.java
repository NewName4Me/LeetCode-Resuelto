package LeetCode_Easy;

public class LC125_ValidPalindrome {
    public static void main(String[]args){
        /*
        dado un string comprobar si es palindromo o no
        
        platenamiento: muy simple, para resolverlo tenemos que darle la vuelta a nuestra palabra es decir
        ponerla del reves y compararla con la original, pero para ello se nos presentan un problemilla, 
        el primero de todos los espacios y simbolos y luego las mayuculas, por simplemente antes de revertir la 
        palabra o frase, convertimos todo a minuscula y luego con un bucle guardamos nuestro texto en otra
        variable donde solo alamcenemos nuestras letras, una vez girada, comparamos y listo
        
        https://leetcode.com/problems/valid-palindrome/submissions/1159532119/
        */
        String s="A man, a plan, a canal: Panama";
        
        System.out.println(isPalindrome(s));
        
    }
    public static boolean isPalindrome(String s){
        s=s.toLowerCase(); //antes de hacer nada convertimos todos los caracteres a minuscual apra asegurarnos de que no tengamos errores al compararlso
        //variables
        String sSinEspacios="";
        
        //programa
        for(int i=0;i<s.length();i++){ //bucle que elimina todos los espacios de nuestro String 
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){ //de esta forma nos aseguramos de no tener en cuenta los espacios ni simbolos , solo palabras
                sSinEspacios+=s.charAt(i);
            }
        }
        s=""; //reseamos nuestra variable para ahora volver a rellenarla pero del reves
        for(int i=sSinEspacios.length()-1;i>=0;i--){//bucle que nos revierte el texto y lo guarda en la variable s de vuelta
            s+=sSinEspacios.charAt(i);
        }
        //llamada
        return sSinEspacios.equals(s);
    }
}
