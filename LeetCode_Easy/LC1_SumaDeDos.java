package LeetCode_Easy;

public class LC1_SumaDeDos {
    public static void main(String[]args){
        /*
        Dado un array de numeros entereo y un numero objetivo
        tenemos que encontrar dos numeros dentro del array que sumados den nuestro numero objetivo
        
        Ej:
        Array=[1,3,6,11] objetivo=9
        Salida=[1,2] porque [1]=3 y [2]=6 y 3+6=9
        */
        
        /*
        paso a paso, primero aprender a como mostrar una posicion especifica de una lista
        
        int[] numList={2,7,11,15};
        
        int num=7;
        
        for(int i=0;i<numList.length;i++){
           if(numList[i]==num){
               System.out.println(num);
               System.out.println(numList[i]);
           } 
        }
        */
            
        //variables
        int[]numList={1,2,4};
        int target=6;
        int num;
          
        //programa
        for(int i=0;i<numList.length;i++){//chequea todos los numeros
            for(int j=i+1;j<numList.length;j++){//chequea una por delante siempre para comprobar todos los casos sin que se repita
                num=numList[i]+numList[j];
                if(num==target){//de esta forma ya averiguo los dos números que sumados dan mi target y su posicion
                    System.out.println("Numeros que sumados dan nuestro target "+numList[j]+"-"+numList[i]);
                    System.out.println("Posición: "+j+","+i);
                }
            }
        }//fin del bucle
    }
}
