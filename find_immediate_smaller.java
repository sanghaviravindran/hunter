int[] a=new int[5];
     Scanner sc=new Scanner(System.in);
     int i,j=1;
     for(i=0;i<a.length;i++)
     {
         a[i]=sc.nextInt();
     }
     int k=0;
     for(i=0;i<a.length;i++)
     {
       for(j=i+1;j<a.length;j++){
         if(a[j]<a[i])
         {
             a[k]=a[j];
            
             k++;
             break;
         }else
            
         a[k]=-1;
         k++;
         break;
     }
      
}if(a[a.length-1]<a[0])
     {
         a[a.length-1]=a[a.length-1];
     }
     else
         a[a.length-1]=-1;
     for(i=0;i<a.length;i++)
     {
         System.out.println(""+a[i]);
     }