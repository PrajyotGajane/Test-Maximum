package com.bridgelabz.TestMaximum.service;
import java.util.Arrays;
public class TestMaximum <E extends Comparable<E>>{
      E[] moreParameters;
      public TestMaximum(E... moreParameters){
            this.moreParameters = moreParameters;
      }
      /**
       * to sort in ascending order to find maximum value off the passed values
       * @return maximum value found
       */
      public E findMaximum(){
            Arrays.sort(moreParameters);
            printMax(moreParameters[moreParameters.length - 1]);
            return moreParameters[moreParameters.length - 1];
      }
      /**
       * to print the maximum value found
       * @param maximum
       * @param <E>
       */
      public static <E> void printMax(E maximum){
            System.out.println("Maximum value is :"+maximum);
      }
}