int i,j,k=0,tot = 0,num,c=0,k1=0;
        int[] ar=new int[100];
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
         for(i=10;i<=99;i++)
        {for(j=2;j<i;j++){
             if(i%j==0)
                 break;
            }if(i==j){
                ar[k]=i;k++;}
 }  
         for(i=0;i<k;i++)
        { c = 0;
            for(j=i;j<k;j++)
            {c++;
                tot=tot+ar[j];
                if(tot==num){
                 System.out.println(c);
                 break;
                }
                
            }
        }
    }