package hw;
import java.util.Scanner;
//�г]�p�@�Ө��fun(v1, type)�A���ϥΪ̿�J�@�ӷū׭Ȥέp��覡
//(type ��1 �� �ؤ�->���Atype��2�����->�ؤ�)�A��ƺ�X���G��n�^�ǦܥD�{���A�L�X���G�C
//(F=C*9/5+32), (C = (F-32) * (5/9)�A�Ҧp��J100 1 �h��X 37.77778; ��J 37.77778 2 �ɫh��X 100.0

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("�п�J�ū�");
float v1=scn.nextFloat();
System.out.print("�ؤ������(1)�άO�����ؤ�(2)");
int type=scn.nextInt();
fun1(v1,type);
}
public static void fun1(float v1,int type){
	if(type==1){
		System.out.print(v1*9/5+32);
	}else{
		System.out.print((v1-32)*(5/9));
	}
	
	}	
}

