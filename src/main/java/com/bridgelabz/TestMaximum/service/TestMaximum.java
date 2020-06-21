package com.bridgelabz.TestMaximum.service;

public class TestMaximum {
      Integer firstInteger;
      Integer secondInteger;
      Integer thirdInteger;
      Float firstFloat;
      Float secondFloat;
      Float thirdFloat;
      String firstString;
      String secondString;
      String thirdString;

      /**
       * parameterised constructor to initialize the instance variables
       * firstInteger,secondInteger and thirdInteger
       * @param firstInteger
       * @param secondInteger
       * @param thirdInteger
       */
      public TestMaximum(Integer firstInteger, Integer secondInteger, Integer thirdInteger){
      this.firstInteger = firstInteger;
      this.secondInteger = secondInteger;
      this.thirdInteger = thirdInteger;
      }

      /**
       * parameterised constructor to initialize the instance variables
       * firstFloat,secondFloat and thirdFloat
       * @param firstFloat
       * @param secondFloat
       * @param thirdFloat
       */
      public TestMaximum(Float firstFloat, Float secondFloat, Float thirdFloat) {
            this.firstFloat = firstFloat;
            this.secondFloat = secondFloat;
            this.thirdFloat = thirdFloat;
      }

      /**
       * parameterised constructor for string values initialization
       * @param firstString
       * @param secondString
       * @param thirdString
       */
      public TestMaximum(String firstString, String secondString, String thirdString) {
            this.firstString = firstString;
            this.secondString = secondString;
            this.thirdString = thirdString;
      }

      /**
       * to find the max integer out of given 3 integers
       * @return maximum
       */
      public int findMaximum(){
          Integer maximum = firstInteger;
          if ( secondInteger.compareTo(maximum) > 0 ){
                maximum = secondInteger;
          }
          if ( thirdInteger.compareTo(maximum) > 0){
                maximum = thirdInteger;
          }
          return maximum;
      }
      public float findMaximumFloat(){
            Float maximum = firstFloat;
            if ( secondFloat.compareTo(maximum) > 0.0f ){
                  maximum = secondFloat;
            }
            if ( thirdFloat.compareTo(maximum) > 0.0f ){
                  maximum = thirdFloat;
            }
            return maximum;
      }
      public String findMaximumString(){
            String maximum = firstString;
            if ( secondString.compareTo(maximum) > 0.0f ){
                  maximum = secondString;
            }
            if ( thirdString.compareTo(maximum) > 0.0f ){
                  maximum = thirdString;
            }
            return maximum;

      }
}
