for(i=0;i<=11;i++)
        {
            flag1=0;
            for(j=0;j<=11;j++)
            {
                if(i==j)
                    continue;
            if(a1[i]==a1[j]){
                flag1=1;
                break;
            }}
                if(flag1!=1)
                    System.out.println("the no"+a1[i]+"is unique in the array");
            
        }
