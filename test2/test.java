/******************************************
*		  JAVA                 *
*         4�B5�B6����X�m��           *
*              �p���	        	  *	
******************************************/
import java.util.Scanner;

public class test{
	public static void main(String[] arg){
		Scanner scan=new Scanner(System.in);	//�ŧi���y�ܼ�
		char c;	//c:�B�⤸
		int x,y,sum=0,flag=0; //flag:�P�_�ϥΪ̲Ÿ��O�_��J���T
		
		System.out.println("=====��ƭp���====="); //printfln:��ܧ��r�|����
		System.out.print("�п�Jx:"); //print:��ܦr�A�S������
		x=scan.nextInt();
		System.out.print("�п�Jy:");
		y=scan.nextInt();
		System.out.printf("�п�J+�B-�B*�B/�B%%�䤤�@�ӡG");  //�n���%���ܡA�@�w�n��%%
		c=scan.next().charAt(0);    //Ū���r�����y�k�AŪ���r��u�n��scan.next()�N�n
			
		switch(c)
		{
			case '+':   //��@�r���γ�޸��A�r������޸��]��
				sum=x+y;
				break;
			case '-':
				sum=x-y;
				break;
			case '*':
				sum=x*y;
				break;
			case '/':
				sum=x/y;
				break;
			case '%':
				sum=x%y;
				break;
			default:
				flag=1;
				break;
		}
		
		if(flag==1)
		{
			System.out.println("��J���~�I");
		}
		else
		{
			System.out.printf("���G=%d\n",sum);
		}
	}
}