package LeetCode_Easy;

public class LC35_SearchInsertPosition {
    public static void main(String[]args){
        /*
        dado una array ORDENADO con numeros y un numero target, indicar la posicion en la que se encuentra
        ese numero
        en caso de no encontrarse indicar en que posicion deberia encontrarse
        
        voy a intenar hacerlo con metodos a ver que tal me sale
        
        https://leetcode.com/problems/search-insert-position/submissions/1106938091/
        
        0ms se ejecucion nice job
        */
        
        //variables
        int[] nums={1,3,5,6};
        int target=7;//ejemplo donde se encuentra en la lista
        int target2=2;//ejemplo donde no esta en la lista
        
        //salida
        System.out.println(searchInsert(nums,target));
        System.out.println(searchInsert(nums, target2));
    }
    
    //metodo en el cual vamos a averiguar en que posicion se encuentra nuestro target
    public static int searchInsert(int[] nums,int target){
        
        //variables
        int salida=0;
        
        //programa
        if(target>nums[nums.length-1]){//comprobamos si nuestro numero es mas grande que el ultimo de la lista
            salida=nums.length;//en caso de que nuestro numero sea el ultimo de la lista le damos esa posicion
        }
        else{
            for(int i=0;i<nums.length;i++){//mriamos todos los elementos de nuestro array
                if(nums[i]==target){//si alguno coincide con el target imprimimo esa posicion
                    salida=i;
                    break;
                }
                else if(nums[i]>target){//en caso de que ninguno coincida y llegemos a un caso en el que algun numero es mayor que target, esa es nuestra posicion deseada si estuviera
                    salida=i;
                    break;
                }       
            }
        }  
        
        //salida
        return salida;
        
        
    }
}
