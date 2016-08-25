 Scanner sc=new Scanner(System.in);
      String s;
      s=sc.nextLine();
    char[] a=new char[s.length()];
    a=s.toCharArray();
    char c=s.charAt(0);
    for(int i=1;i<a.length;i++)
    {
        System.out.print(" "+c+a[i]);
    }