public class test{
    public static void main(String[] arg){
        int n1=0,n2=0,i=0,max=0; 
        char c;
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.printf("=====6�B7���m�ߡG��J��ӥ���ơA��X�̤j���]��=====\n");
        
        do
        {
            System.out.printf("�п�J�Ĥ@�ӼơG");
            n1=scan.nextInt();
            System.out.printf("�п�J�ĤG�ӼơG");
            n2=scan.nextInt();
            if(n1==0 || n2==0)
            {
                System.out.println("��̨S���̤j���]��");
            }
            else if(n1<0 || n2<0)
            {
                System.out.println("��J���ƥ����O����ơI");
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
            System.out.printf("%d�M%d���̤j���]�Ƭ�%d\n",n1,n2,max);
            System.out.printf("�O�_�~�����?(y/n)�G");
            c=scan.next().charAt(0);
        }while(c=='y' || c=='Y');
    }
}
