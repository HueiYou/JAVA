/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author z8517
 */
public class Test {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int num=0 , sum=0;  //num:四位數卡號 ， sum:四位數總和
        int n1=0,n2=0,n3=0,n4=0;    //由左至右為千百十個位數
        char c;
        
        System.out.println("=====練習=====");
        do{
            do{
                System.out.print("請輸入一個四位數的會員卡號：");
                num=scan.nextInt();
                if(num<1000 || num>10000)
                {
                    System.out.print("請輸入一個正確的四位數的會員卡號！\n");
                }
            }while(num<1000 || num>10000);
            
            n1=num/1000;
            n2= (num/100) % 10;
            n3= (num/10) % 10;
            n4=num%10;
            sum=n1+n2+n3+n4;
            System.out.printf("千位數：%d\n", n1);
            System.out.printf("百位數：%d\n", n2);
            System.out.printf("十位數：%d\n", n3);
            System.out.printf("個位數：%d\n", n4);
            System.out.printf("各個位數之和：%d\n",sum);
            
            if(sum>20)
            {
                System.out.println("您中奖了！奖品是MP3");
            }    
            else
            {
                System.out.println("可惜了，您没中奖！");
            }
            System.out.printf("是否要重新輸入?(是的話請輸入y)：");
            c=scan.next().charAt(0);
            
        }while( c=='y' || c== 'Y');    
    }
}
