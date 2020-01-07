package com.sai.microservices.currencyconvertionservice;

import org.bouncycastle.crypto.RuntimeCryptoException;

public class Test {

  /**
   * @param args
   */
  public static void main(String[] args) {

    System.out.println(get());

  }
  
  static int get() {
    try {
      throw new RuntimeCryptoException();
    }catch(Exception e) {
      
      return 2;
    }
    finally {
      return 3;
    }
  }

}
