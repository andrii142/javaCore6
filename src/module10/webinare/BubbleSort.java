package module10.webinare;

import java.util.Arrays;

/**
 * Created by citsym on 10.04.17.
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] intArray = {10 ,23, 132 ,2342 , 45 ,23, 345};

        int[] ints = bubbleSort(intArray);

        System.out.println(Arrays.toString(ints));


    }

    public static int[] bubbleSort(int [ ] num )
    {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while ( flag )
        {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                if ( num[ j ] < num[j+1] )   // change to > for ascending sort
                {
                    temp = num[ j ];                //swap elements
                    num[ j ] = num[ j+1 ];
                    num[ j+1 ] = temp;
                    flag = true;              //shows a swap occurred
                }
            }
        }
        return num;
    }
}
