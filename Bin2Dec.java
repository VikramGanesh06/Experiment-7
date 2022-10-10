
package Exercise7;

import java.util.Scanner;

public class Bin2Dec {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        char z[]=a.toCharArray();
        int len=a.length();
        int cal=0,flag=0;
        int m[] = new int[a.length()];
        for(int i=0; i < a.length(); i++)
        {
            
            m[i]=(int)z[i]%48;
            int s= m[i];
            if(s>1)
            {
                flag=1;
                break;
            }
            cal=(int) ((Math.pow(2,len-1)*s)+cal);
            len--;
        }
        if(flag==0)
        {
            System.out.println("The equivalent decimal number for binary '"+a+"' is: "+cal);
        }
        else
        {
            System.out.println("Error: invalid binary string "+"'"+a+"'");
        }
        
    }
    
}
