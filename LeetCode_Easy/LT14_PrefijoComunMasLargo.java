package LeetCode_Easy;

public class LT14_PrefijoComunMasLargo {
    public static void main(String[] args) {
        /*
        dada una serie de Strgins en un array, encontrar el prefijo de letras comunes a todos estos mas grande
        
        ej:
        ["flower","flow","flight"] el mas comun es "fl"
        en cambio para ["dog","racecar","car"] la salida será ""ç
        
        metodologia: creo que lo más sencillo sera la mirar la primera letra del primero de todos
        guardarla, y ver si coincide con todas las siguientes, en caso de ser así guardarla, luego mirar la segunda
        y ver que se repita en todos, cuando en alguna no se repita algo romper
        */
        
        // variables
        String[] palabras = {"flower","flow","flight"};
        char letraSave;
        StringBuilder prefijocomun = new StringBuilder(); //donde almacenamos los prefijos de forma chachi
        int j = 0; // para mirar los caracteres
        int i = 0; // para mirar las palabras

        // programa
        if(palabras.length!=0){//en caso de que la lista esta vacía no da error
            
            letraSave = palabras[0].charAt(0);//lo defino dentro y no fuera porque si lo hago fuera me dara error con los arrays vacios
            
            while (i < palabras.length) {//asegurarnos de revisar cada palabra
            
                if (j >= palabras[i].length() || letraSave != palabras[i].charAt(j)) {
                    //si j es más grande quiere decir que estamos fuera del array por tanto termina
                    //si los caracteres son diferentes se rompen
                    break;
                }

                letraSave = palabras[i].charAt(j);//actualizamos el valor de letraSave para que utilice el siguiente de la primera palabra

                if (i == palabras.length - 1) {//comprueba que hayamos llegado a la ultima palabra del array
                    i = 0;//volvemos a la siguiente palabra
                    j++;//miramos la siguiente letra
                    prefijocomun.append(letraSave);
                    letraSave = palabras[i].charAt(j);
                } 
                else {//en caso de no estar en la ultima palabra simplemente miramos la siguiente
                    i++;
                }
            }//fin del while
        } 
        
        //salida
        if(prefijocomun.length()==0){//comprueba si habia al menos 1 caracter como prefijo comun
            System.out.println("\"\"");
        }
        else{
            System.out.println("Tu prefijo común es: "+prefijocomun.toString());
        }
        
    }
}

