import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            int marks = sc.nextInt();
        if(marks>=90){
            System.out.println("This is good");}
        }else if(89>=marks>=60){
            System.out.println("This is also good");}
        else{
            System.out.println("this is good as well");
        }

        if(n==0){
        System.out.println("Stop Code");
        }
    }
}
