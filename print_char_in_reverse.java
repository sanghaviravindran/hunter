   Scanner sc=new Scanner(System.in);
        String s;
        int k=0,m = 0,l;
        s=sc.nextLine();
        char[] c=new char[s.length()];
         char[] c1=new char[s.length()];
        c=s.toCharArray();
        for(int i=c.length-1;i>=0;i--)
        {
            if(c[i]=='\0')
                continue;
           for(int j=i-1;j>=0;j--)
           {
               
               if(c[i]==c[j])
               { 
                   c[j]='\0';
                
               }
           }
        
           c1[k]=c[i];
                   k++;
        }
        String s1=new String(c1);

        System.out.println(""+s1);
  }