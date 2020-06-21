package com.bridgelabz.TestMaximum.service;
public class TestMaximum <E extends Comparable<E>>{
      E firstValue;
      E secondValue;
      E thirdValue;
      E[] moreParameters;
      /**
       * parameterised constructor to initialize generic values
       * @param firstValue
       * @param secondValue
       * @param thirdValue
       * @param moreParameters
       */
      public TestMaximum(E firstValue, E secondValue, E thirdValue, E... moreParameters){
            this.firstValue = firstValue;
            this.secondValue = secondValue;
            this.thirdValue = thirdValue;
            this.moreParameters= moreParameters;
      }
      /**
       * to call parametrised method findMaximum
       * @return maximum value
       */
      public E findMaximum(){
            return TestMaximum.findMaximum(firstValue,secondValue,thirdValue,moreParameters);
      }
      /**
       * to check maximum value of Integer, String, Float with one generic method
       * @param firstValue
       * @param secondValue
       * @param thirdValue
       * @param moreParameters
       * @param <E>
       * @return maximum value
       */
      public static  < E extends Comparable<E> > E findMaximum(E firstValue, E secondValue, E thirdValue,E... moreParameters){
            E maximum = firstValue;
            if ( secondValue.compareTo(maximum) > 0 ){
                  maximum = secondValue;
            }
            if ( thirdValue.compareTo(maximum) > 0 ){
                  maximum = thirdValue;
            }
            if (moreParameters.length != 0 ){
                  for (E parameter: moreParameters){
                        if ( parameter.compareTo(maximum) > 0 ){
                              maximum = parameter;
                        }
                  }
            }
            printMax(maximum);
            return maximum;
      }
      /**
       * to print maximum value passed by findMaximum
       * @param maximum
       * @param <E>
       */
      public static <E extends Comparable<E>> void printMax(E maximum){
            System.out.println("Maximum value is :"+maximum);
      }
}