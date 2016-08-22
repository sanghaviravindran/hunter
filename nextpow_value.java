int i,k,pow,num,num3,n,count=0,n1,tot=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        n1=num;
        while(num!=0)
        {  n=num%10;
           num=num/10;
          count++;
        }
        while(n1!=0)
        {num++;
             num3=n1%10;
            if(num==1)
        {
            tot+=num3;
            n1=n1/10;
        }else
            {pow=1;
                for(i=count;i>0;i--)
                {
                    pow*=num3;
               }
                tot+=pow;
                count--;
                n1=n1/10;
            }
         
        }
          System.out.println(""+tot);