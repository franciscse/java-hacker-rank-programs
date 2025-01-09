import java.util.Scanner;

public class Solution2 {

public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

            String newX = String.format("%03d", x);

            System.out.print(s1);
            for(int j = 15 - s1.length(); j > 0; j--){
                System.out.print(" ");
            }
            System.out.println(newX);
        }
        System.out.println("================================");

}
}
