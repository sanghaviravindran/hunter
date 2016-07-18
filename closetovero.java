  for(i=0;i<4;i++)
        {
            for(j=i+1;j<5;j++){
                tot=a[i]+a[j];
            if(tot>0)
                {
            if(min1>=tot&&tot!=0){
                min1=tot;
                i1=a[i];
                i2=a[j];
                f1=1;
            }} else
            {
            if(tot>=min2&&tot!=0)
                {
                    min2=tot;
                    i3=a[i];
                    i4=a[j];
                    f2=1;
                }
            }
        }
    }
    
if(f1==1)
        System.out.println(""+i1+" "+i2);
if(f2==1)
        System.out.println(""+i3+" "+i4);
    