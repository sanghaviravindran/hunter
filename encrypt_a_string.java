String s,s1;
        char[] a=new char[50];
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        a=s.toCharArray();
        for(int i=0;i<s.length()-1;i++)
        {
            if(a[i]=='a')
                a[i]='z';
            else
                a[i]=(char) (a[i]-1);
        }
        s1=new String(a);
        System.out.println(""+s1);