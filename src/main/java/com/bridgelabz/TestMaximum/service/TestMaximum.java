package com.bridgelabz.TestMaximum.service;

public class TestMaximum {
      Integer firstInteger;
      Integer secondInteger;
      Integer thirdInteger;
      public TestMaximum(){

      }
      public TestMaximum(Integer firstInteger, Integer secondInteger, Integer thirdInteger){
      this.firstInteger = firstInteger;
      this.secondInteger = secondInteger;
      this.thirdInteger = thirdInteger;
      }
      public int findMaximum(){
          Integer maximum = firstInteger;
          if ( firstInteger.compareTo(maximum) > 0 ){
                maximum = secondInteger;
          }
          if ( thirdInteger.compareTo(maximum) > 0){
                maximum = thirdInteger;
          }
          return maximum;
      }
}
