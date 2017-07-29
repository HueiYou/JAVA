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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String s1="Java",s2="Java"; //s1和s2是同一物件
        String s3= new String("Hello"); 
        String s4= new String("Hello");
        int n1=0,n2=0;
        System.out.printf("=====字串比較=====\n");
        System.out.printf("1. s1=%s\n2. s2=%s\n3. s3=%s\n4. s4=%s\n(已知s1和s2是同一物件，s3和s4是不同物件)\n",s1,s2,s3,s4);
        System.out.print("s1==s2:"); //比較s1和s2是否為同一物件
        System.out.println(s1==s2);
     
        System.out.println("s1.equals(s2):" + s1.equals(s2));   //比較s1和s2內容值是否相同
        
        System.out.print("s3==s4:"); 
        System.out.println(s3==s4);
     
        System.out.println("s3.equals(s4):" + s3.equals(s4));
        
        System.out.println("s1+s3= " + s1 + s3);    //結合s1和s3字串
        
        System.out.printf("=====大小寫轉換=====\n");
        System.out.println("s1:" + s1);
        System.out.println("s1轉大寫:" + s1.toUpperCase());
        System.out.println("s1轉小寫:" + s1.toLowerCase());
        
        System.out.printf("=====搜尋字=====\n");
        System.out.printf("請輸入一字串(例如Helllllo)：");
        String s5=scan.next();
        System.out.printf("請輸入要找尋的字元或字串(例如l)：");
        String s6=scan.next();
        System.out.printf("字串長度：%d\n",s5.length());
        System.out.printf("第一個%s索引值(字串第一個字元從0開始算起):%d\n",s6,s5.indexOf(s6));
        System.out.printf("最後一個%s:%d\n",s6,s5.lastIndexOf(s6));
        System.out.printf("有沒有包括%s：",s6);
        System.out.println(s5.contains(s6));    //觀察s5中有沒有包括s6
        
//        System.out.printf("=====列印=====\n");
//        String s7="abcdefg";
//        //char ch;
//        int count=0,i=0;
//        System.out.printf("s7=%s\n", s7);
//        for(i=0;i<=s7.length();i++)
//        {
//            ch=s7.charAt(i);
//            System.out.println(ch);
//            System.out.println(s7.charAt(i));
//        }    
        
         
    }
    
}
