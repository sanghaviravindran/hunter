char x=' ';
        int l = 0;
      char[] a=new char[s.length()];
       a=s.toCharArray();
   for(int i=0;i<s.length();i++){
           if(a[i]>=96&&a[i]<=123||a[i]>=64&&a[i]<=91)
           {
               x=a[i];
               System.out.println("dc"+x);
           }
while(Character.isDigit(a[(i+1)]))
{i=i+1;
l=(l*10)+Integer.parseInt(String.valueOf(s.charAt(i)));
if(i==s.length()-1)
break;
}if(l>=1&&l<=9){
          while(l>=1){
              s2=s2+x;
              l--;
                }}
   }
       System.out.print(""+s2);
        }