public class test{
    public static void main(String[] arg){
        int n1=0,n2=0,i=0,max=0; 
        char c;
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.printf("=====6、7章練習：輸入兩個正整數，找出最大公因數=====\n");
        
        do
        {
            System.out.printf("請輸入第一個數：");
            n1=scan.nextInt();
            System.out.printf("請輸入第二個數：");
            n2=scan.nextInt();
            if(n1==0 || n2==0)
            {
                System.out.println("兩者沒有最大公因數");
            }
            else if(n1<0 || n2<0)
            {
                System.out.println("輸入的數必須是正整數！");
            }
            else if(n1>n2)
            {
                for(i=1;i<=n2;i++)
                {
                    if(n2 % i==0)
                    {
                        if(n1 % i==0)
                        {
                            max=i;
                        }
                    }
                }
            }
            else if(n1<n2)
            {
                for(i=1;i<=n1;i++)
                {
                    if(n1 % i==0)
                    {
                        if(n2 % i==0)
                        {
                            max=i;
                        }
                    }
                }
            }
            System.out.printf("%d和%d的最大公因數為%d\n",n1,n2,max);
            System.out.printf("是否繼續執行?(y/n)：");
            c=scan.next().charAt(0);
        }while(c=='y' || c=='Y');
    }
}
