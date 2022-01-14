import java.util.*;

public class decimaltobinary {
    public static void main (String[] args){
        Scanner scn= new Scanner (System.in);
        int n=scn.nextInt();
        
        int ans=0,pow=1;
        while(n!=0){
            int rem=n%2;
            n /=2;
            ans +=rem*pow;
            pow= pow*10;
        }
        System.out.print(ans);
    }
}
