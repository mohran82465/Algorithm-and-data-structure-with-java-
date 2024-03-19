package com.mohran.arrays;

public class ReverseArray {
    public static void reverse(int[] numbers, int start , int end)
    {
        while(start<end)
        {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static void print(int [] arr)
    {
        for(int i = 0 ; i< arr.length; i++ )
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int [] numbers = {16,2,23,39,438,7,6,41,3,651,516,654};
        print(numbers);
        reverse(numbers,0,numbers.length-1);
        print(numbers);
    }
}
