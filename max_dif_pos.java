 Scanner sc=new Scanner(System.in);
         int j=0,diff,maxi=0,index = 0,n;
         n=sc.nextInt();
        int[] a=new int[n];
        for(j=0;j<n;j++){
            a[j]=sc.nextInt();
        }
 for(int i=1;i<5;i++){
	 diff=(a[i-1]-a[i]);
         if(maxi<diff)
         {
	maxi=diff;
	index=i-1;
	}}		
System.out.println(index);
        