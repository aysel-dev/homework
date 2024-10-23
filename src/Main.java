import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Please, enter the exam score: ");

        Scanner sc = new Scanner(System.in);
        int score1 = sc.nextInt();

        if (score1>=0 && score1<=100){
            if (score1 >= 91) {
                System.out.println("A");
            } else if (score1>=81) {
                System.out.println("B");
            } else if(score1>=71){
                System.out.println("C");
            } else if (score1>=61) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }

        else{
            System.out.println("Enter the number between 0 and 100");
        }

    }
}