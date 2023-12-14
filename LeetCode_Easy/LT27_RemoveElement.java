package LeetCode_Easy;
import java.util.*;

public class LT27_RemoveElement {
    public static void main(String[]args){
        /*
        dado un array y un valor, eliminar todos los valroes del array que coincidan con el valor
        */
        int[]num={0,1,2,2,3,0,4,2};
        int val=2;
        
        System.out.println(Arrays.toString(ArrayRemoved(num, val)));
        System.out.println(removeElement(num, val));
    }
    
    //este metodo dado un array te elemina los elemntos indicados en nuestro target
    public static int[] ArrayRemoved(int[]nums,int val){
        
        int cont=nums.length;//para que el array que devolvemos tenga la longitud justa
        int j=0;
        
        for(int i=0;i<nums.length;i++){//miramos todos los elementos de nuetra lista
            if(nums[i]==val){//cada vez que sena iguales disminuimos su longitud
                cont--;
            }
        }
        
        int[] salida=new int[cont];//el array que vamos devolver ya con longitud justa para almacenar todos los valores
        
        for(int i=0;i<nums.length;i++){//mriamos todos los elementos de mi array dado
            if(nums[i]!=val){//cada vez que no coincida el valor se lo añadimos a nuestro nuevo array
                salida[j]=nums[i];
                j++;
            }
        }
        
        return salida;
    }
    
    //en este metodo simplemente indicamos la cantidad de valores que son diferentes de nuestro valor
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  
                k++;
            }
        }
        
        return k;
    }
}
