package com.test;

import java.util.Scanner;
public class Factorial2 {
	
	
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++)
         System.out.print(arr[i]);
    }
    public static void printArrRev(int[] arr){
        for(int i=arr.length-1;i>=0;i--)
         System.out.print(arr[i]);
    }
    public static int[] shift(int[] arr, int num){
        int[] result = new int[arr.length+num];
        for(int i=0;i<arr.length;i++){
            result[i+num] = arr[i];
        }
        return result;
    }
    public static int getDigit(int num){
        int result = 0;
        int number = num;
        while(number!=0){
            number = number/10;
            result++;
        }
        return result;
    }
     
public static int[] isopsephy(int[] arr){
    int iso_number = 0;
    int[] result;
    for(int i=0;i<arr.length;i++){              
        iso_number = (arr[i]+iso_number)/10;
    }
    int digit = getDigit(iso_number);
    result = new int[arr.length+digit];
    for(int i=0;i<digit;i++){
        result[i+arr.length] = iso_number%10;
        iso_number = iso_number/10;
    }
    iso_number = 0;
    for(int i=0;i<arr.length;i++){
        result[i] = (arr[i]+iso_number)%10;
        iso_number = (arr[i]+iso_number)/10;
    }
    return result;
}
public static int[] isopsephy(int arr){
    int temp= arr;
    int[] result;
    int digit = getDigit(arr);
    result = new int[digit];
    for(int i=0;i<digit;i++){
        result[i] = temp%10;
        temp = temp/10;
    }
    return result;
}
     
    public static int[] add(int[] arr, int[] addnum){
        int[] arr_short = isopsephy(arr);
        int[] arr_long = isopsephy(addnum);
        if(arr_short.length>arr_long.length){
            int[] temp;
            temp = arr_short;
            arr_short = arr_long;
            arr_long = temp;
        }
        for(int i=0;i<arr_short.length;i++){
            arr_long[i] +=arr_short[i];
        }
        return isopsephy(arr_long);
    }
    public static int[] multi(int[] arr, int multiplier){
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i] = arr[i]*multiplier;
        }
        return isopsephy(result);
    }
    public static int[] getMult(int[] arr, int[] multipliers){
        int[] result = new int[arr.length];
        int[] first = isopsephy(arr);
        int[] second = isopsephy(multipliers);
        for(int i=0;i<second.length;i++){
            result = add(result,shift(multi(first, second[i]),i));
            result = isopsephy(result);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        System.out.println("Please input n:");
        int n = sca.nextInt();
        
        int[] result = isopsephy(n);
        
        for(int i=n-1;i>0;i--){
            result = getMult(result, isopsephy(i));
        }
        
        printArrRev(result);
    }
}