package com.example.demo;

public class Demo {
    public static void main(String [] args){
        int nums[][] = new int [3][]; // jagged array - not sure if it will have certain amount of rows and columns

        nums[0] = new int[3]; //number of columns in first row
        nums[1] = new int[4];
        nums[2] = new int[5];

//        int nums[][][] = new int[3][4][3]; // 3D array

        for(int i=0; i < 3; i++){
            for(int j=0; j < 4; j++){
                nums[i][j] = (int)(Math.random() * 100);
            }
        }
//        for(int i=0; i < 3; i++){ // i - rows
//            for(int j=0; j < 4; j++){ // j - columns
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
