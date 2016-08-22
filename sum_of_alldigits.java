int num,tot=0,n,num1,n2,n3 = 0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        n3=num;
        while(num!=0)
        {  n=num%10;
        tot=tot+n;
           num=num/10;}
        while(n3!=0)
        {
           n2=n3/10;
            n3=n2;
            while(n2!=0)
            {
                num1=n2%10;
              tot=tot+num1;
                n2=n2/10;
            }} System.out.println(""+tot);