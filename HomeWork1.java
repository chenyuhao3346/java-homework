package homework;

import java.util.Scanner;

public class HomeWork1 {
	static int init; 
	static double flag = 2;
	 public static double getNum(int n) {
	  if(n<init){
	   return 0;
	  }
	  System.out.println(n);
	  if (n > 5000) {
	   flag = 0.5;
	   System.out.println(n);
	  }
	  int result = (int) (n * flag);
	  return getNum(result);
	 }

	public static void main(String[] args) {
	  int n = 1237;
	  init = n;
	  getNum(n);
	 }

}
