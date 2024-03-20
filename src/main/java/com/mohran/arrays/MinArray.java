package com.mohran.arrays;

public class MinArray {

    public int findMinimum(int [] arr)
    {
        if (arr == null || arr.length == 0  )
        {
            throw new IllegalArgumentException("Invalid input");
        }
        int min = arr[0];
        for(int i =1 ; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }

        }
        return min ;
    }


    public static void main(String[] args) {

        int [] arr = {5,9,13,15,1,2};

        MinArray mvn = new MinArray();
        System.out.println(mvn.findMinimum(arr));

    }
}
