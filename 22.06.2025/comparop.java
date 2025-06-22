import java.lang.System;
import java.util.Scanner;
class user{
  public static void main(String args[]){
    Scanner x = new Scanner(System.in);
    int a = x.nextInt();
    int b = x.nextInt();
    if(a<b){
      System.out.println("A is Lesser than B");
    }
    else{
      System.out.println("A is Greater than B");
    }
  }
}
