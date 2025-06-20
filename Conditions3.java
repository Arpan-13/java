import java.util.*;

public class Conditions3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Both numbers are equal");
        }else{
            if(a>b){
                System.out.println("a is grater then b");
            }else{
                System.out.println("a is leser then b"); 
            }
        }

      
    }
}