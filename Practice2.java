import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=50; i<=n; i++){
            if(i%7==0){
                System.out.println(i);
            }
        }
    }
}
