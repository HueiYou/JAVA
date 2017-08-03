/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test6;

/**
 *
 * @author z8517
 */
public class Test6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner scan= new java.util.Scanner(System.in);
        int[] num={0,0,0,0,0,0};    //num[5]:最佳銷售量
        String[] name={"","","","","",""};  //name[5]:最佳銷售員
        int i=0;
        
        System.out.printf("=====顯示銷售量最高的銷售員與銷售量。=====\n");
        for(i=0;i<=4;i++)
        {
            System.out.printf("請輸入第%d位銷售員姓名：",i+1);
            name[i]=scan.next();
            do{
                System.out.print("請輸入該銷售員銷售量：");
                num[i]=scan.nextInt();
                if(num[i]<0)
                {
                    System.out.print("銷售量不可為負！\n");
                }
            }while(num[i]<0);
        }
        num[5]=num[0];
        name[5]=name[0];
        
        for(i=1;i<=4;i++)
        {
            if(num[5]<num[i])
            {
                num[5]=num[i];
                name[5]=name[i];
            }
        }
        System.out.printf("最佳銷售員為%s，銷售量為%d\n", name[5],num[5]);
        
    }
    
}
