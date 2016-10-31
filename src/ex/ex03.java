package ex;
import java.util.Scanner;
/*
 * Topic: 輸入一串數字，寫出一數字拆解函數decomp(n)，將其個別數字用空白分開。例如:輸入128917178, 則輸出1 2 8 9 1 7 1 7 8
 * Date: 2016/10/31
 * Author: 105021007 陳麒安
 */

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入數字");
int n=scn.nextInt();

fun1(n);
	}
public static void fun1(int n){
	long sum=n;
	while(n>0){
	sum=n%10;
	n=n/10;
	System.out.print(sum+"\t");	
	}
	

	}
	
}
