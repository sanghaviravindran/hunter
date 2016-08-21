 Scanner sc=new Scanner(System.in);
        String s,reversestring =" ";
        char[] a=new char[50];
        s=sc.nextLine();
     a=s.toCharArray();
        for(int i=0;i<a.length;i++)
        {
          if(a[i]>64&&a[i]<91){
            a[i]=Character.toLowerCase(a[i]);}
          else if(a[i]>97&&a[i]<123)
              a[i]=Character.toUpperCase(a[i]);
          
    }String b=new String(a);
        String[] s1= b.split(" ");  
       for (int i = 0; i < s1.length; i++) 
       {String word = s1[i];
            String reverseWord = "";
       for (int j = word.length()-1; j >= 0; j--) 
            {reverseWord = reverseWord + word.charAt(j);
            }
        reversestring = reversestring + reverseWord + " ";
        }
        System.out.println(""+reversestring);
    }
}
