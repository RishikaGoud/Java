package matrixadditionandmultiplication;

import java.util.Scanner;

public class MatrixAdditionandMultiplication {

    public static void main(String[] args) {
     int [][] a = {{1,3,4},{2,4,3},{3,4,5}};
     int [][] b = {{1,3,4},{2,4,3},{1,2,4}};
   
     System.out.println("\nAdd\tMul");
     
     for(int i = 0; i < a.length; i++)
     {
         for(int j = 0; j < a[0].length; j++)
         {
             System.out.format("%d \t", (a[i][j] + b[i][j]));
             System.out.format("%d \t", (a[i][j] * b[i][j]));
             System.out.println("");
         }
         System.out.println("");
     }
    }
    
}
