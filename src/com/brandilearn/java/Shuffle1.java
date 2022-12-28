package com.brandilearn.java;

public class Shuffle1 {
  public static void main(String[] args){
    int x = 3;
    while (x > 0) {
      if(x > 2) {
        System.out.print("a");
        //System.out.print("-"); could possibly add this line instead of having it open in the while loop
      }

      x = x - 1;
      System.out.print("-");

      if (x == 2) {
        System.out.print("b c");
        //System.out.print("-"); same as above
      }

      if (x == 1) {
        System.out.print("d");
        x = x - 1;
      }
    }
  }

}