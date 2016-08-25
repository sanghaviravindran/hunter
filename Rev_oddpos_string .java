      Scanner sc=new Scanner(System.in);
      String str;
       str=sc.nextLine();
       int i;
     String[] s1 = str.split("\\s+");
       for(i=0;i<s1.length;i++)
       {if(i%2==0){
        s1[i]=new StringBuffer(s1[i]).reverse().toString();}
       }
   for(i=0;i<s1.length;i++)
   {System.out.print(" "+s1[i]);
       }
    }