package com.mohran.arrays;

public class MoveZeroesToEnd {
    public void moveZeroes(int [] arr)
    {
        int idx = 0 ;
        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i] != 0 && arr[idx] == 0 )
            {
                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
            }
            if (arr[idx] != 0)
            {
                idx++;
            }

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
    public void arrayDemo()
    {
        int[] arr = {8,1,0,2,1,0,3};
        print(arr);
        moveZeroes(arr);
        print(arr);
    }
    public static void main(String[] args) {

        MoveZeroesToEnd mvn = new MoveZeroesToEnd();
        mvn.arrayDemo();
    }
}
