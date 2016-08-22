 int i,k,pow,num,n3,n2,n,count=0,n1,tot=0;
        Scanner sc=new Scanner(System.in);
        int[] a=new int[50];
        num=sc.nextInt();n1=num;
        while(num!=0)
        {  n=num%10;
           num=num/10;
          a[count]=n; count++;
        }for(i=1;i<count;i++){
           pow=1;
           for(k=1;k<=a[i-1];k++){
            pow=pow*a[i];}
           tot=tot+pow;
       }
        tot=tot+1;
          System.out.println(""+tot);
    