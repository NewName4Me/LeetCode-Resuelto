package LeetCode_Easy;
import java.util.*;

public class LC26_DuplicatesFromArray {
    public static void main(String[]args){
        /*
        dado un array elimina los elementos duplicados
        no se si se refiere a arraylist o array normal asi que haré ambos
        
        se ve que mal interprete el enunciado porque no le da lo que quiere
        */
        ArrayList<Integer> salida=new ArrayList<>();
        
        //variables
        int[] arrayDado={0,0,1,1,1,2,2,3,3,4};

        //programa
        for(int i=0;i<arrayDado.length;i++){//miramos todos los elementos de nuestro array uno a uno
            if(!salida.contains(arrayDado[i])){//si no esta contenido ya lo añadimos
                salida.add(arrayDado[i]);
            }
        }
        
        //salida
        System.out.println(salida);
        System.out.printf("Tu nueva lista tiene %d elementos",salida.size());
        
        /*
            solucion publicada al final
            class Solution {
                public int removeDuplicates(int[] nums) {
                    int k = 1; // Initialize the counter for unique elements
                    for (int i = 1; i < nums.length; i++) {
                        if (nums[i] != nums[i - 1]) {
                            nums[k++] = nums[i];
                        }
                    }

                    return k;
                }
            }

        
        */
    }
}
