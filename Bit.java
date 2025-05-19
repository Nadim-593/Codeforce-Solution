import java.util.*;
public class Bit{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a ;
            int x =0;
            a = sc.nextInt();
            for(int i=0; i<a;i++){
               String  s = sc.next();
                if(s.contains("++")){
                    x++;
                }else if(s.contains("--")) {
                    x--;
                }
            }
             System.out.println(x);
    }
}