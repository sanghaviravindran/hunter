int i,j,k=0,tot,num;
        int[] ar=new int[100];
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
         for(i=10;i<=99;i++)
        {for(j=2;j<i;j++){
             if(i%j==0)
                 break;
            }if(i==j)
                ar[k]=i;k++;}
                
        for(i=0;i<k;i++)
        {for(j=i+1;j<k;j++)
            {tot=ar[i]+ar[j];
                if(tot==num)
                 System.out.println(+ar[i]+" "+ar[j]);
                
            }
        }