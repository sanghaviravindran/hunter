 int n,n1,i,j,dig,count=0,pow,sum=0;
        n=sc.nextInt();
        n1=n;
        while(n!=0)
        {
            dig=n%10;
            n=n/10;
            count++;
        }
        pow=count;
        int dig1=1;
        while(n1!=0)
        {dig1=1;
        dig=n1%10;
     for(i=1;i<=pow;i++){
         dig1=(dig1*dig);}
         sum= sum+dig1;
          n1=n1/10;  
        }
        System.out.println(""+sum);