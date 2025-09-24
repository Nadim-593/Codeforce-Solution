
import java.util.HashSet;
import java.util.Scanner;
public class BoyorGirl {
   static  int forDisting(String name){
     HashSet<Character> hs = new HashSet<>();
     for(int i=0; i<name.length(); i++){
            hs.add(name.charAt(i));
     }
     return  hs.size();
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
       int uniqueCount =  forDisting(name);
       if(uniqueCount % 2 == 0){
        System.out.println("CHAT WITH HER!");
       } else{
        System.out.println("IGNORE HIM!");
       }
        
    }
}


