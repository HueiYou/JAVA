/******************************************
*		  JAVA                 *
*         4、5、6章整合練習           *
*              計算機	        	  *	
******************************************/
import java.util.Scanner;

public class test{
	public static void main(String[] arg){
		Scanner scan=new Scanner(System.in);	//宣告掃描變數
		char c;	//c:運算元
		int x,y,sum=0,flag=0; //flag:判斷使用者符號是否輸入正確
		
		System.out.println("=====整數計算機====="); //printfln:顯示完字會換行
		System.out.print("請輸入x:"); //print:顯示字，沒有換行
		x=scan.nextInt();
		System.out.print("請輸入y:");
		y=scan.nextInt();
		System.out.printf("請輸入+、-、*、/、%%其中一個：");  //要顯示%的話，一定要打%%
		c=scan.next().charAt(0);    //讀取字元的語法，讀取字串只要打scan.next()就好
			
		switch(c)
		{
			case '+':   //單一字元用單引號，字串用雙引號包住
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
			System.out.println("輸入錯誤！");
		}
		else
		{
			System.out.printf("結果=%d\n",sum);
		}
	}
}