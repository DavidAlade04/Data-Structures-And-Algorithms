package Algorithms;

import java.util.Arrays;

public class SimpleMerge {

    //Merging Two Arrays
    public static int [] merge(int [] A, int [] B)
    {
        //Create Three Pointers
        int i = 0, j = 0, k = 0;

        int [] C = new int [A.length + B.length];

        while(i < A.length && j < B.length)
        {
            if(A[i] < B[j])
            {
                C[k++] =  A[i++];
            }
            else{
                C[k++] = B[j++];
            }
        }
        //Fill Array [C] with remaining elements in Array[A]
        for(; i <A.length; i++)
        {
            C[k++] = A[i];
        }
        //Fill Array[C] with remaining elements in Array[B]
        for(; j < B.length; j++)
        {
            C[k++] = B[j];
        }

        return C;
    }



    public static void main(String[] args) {

        int [] arrayOne = {2,3,7,9,10}; int [] arrayTwo = {5,6,8,11,13,14,19};
        System.out.println(Arrays.toString(merge(arrayOne,arrayTwo)));
    }
}
