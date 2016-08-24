       Scanner sc=new Scanner(System.in);
        String s;
        int count=0;
        s=sc.nextLine();
        for(int i='a';i<='z';i++)
        {
            for(int k=0;k<s.length();k++){
            if(i==s.charAt(k)){
                count++;}
        }}
  if(count<=26)
            {
                System.out.println("panagram");
            }
            else
                System.out.println("not panagram");
    
}