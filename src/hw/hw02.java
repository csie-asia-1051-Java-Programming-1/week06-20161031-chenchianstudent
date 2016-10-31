package hw;
import java.util.Scanner;
//讓使用者輸入性別與身高，透過函數呼叫，依據男女不同, 幫她(他)計算並輸出其標準體重 
//((1)男：(身高-170)*0.6+62 , (2)女：(身高-158)*0.5+52)。
//函數算出結果後要回傳至主程式再印出結果。例如:輸入 1 170 則輸出 62.0, 輸入 2 165 則輸出 55.5 

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入性別(男1 女2)");
int s=scn.nextInt();
System.out.print("請輸入身高");
int h=scn.nextInt();
fun1(s,h);
	}
	public static void fun1(int s,int h){
if(s==1){
	System.out.print((h-170)*0.6+62);
}else{
	System.out.print((h-158)*0.5+52);
}	
}	
}

