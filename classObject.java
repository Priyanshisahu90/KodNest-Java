
import java.util.Scanner;

class Learner{
    int id;
    String name;
    int javaScore;
}







public class classObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Learner first = new Learner();
        first.id = sc.nextInt();
        first.name = sc.next();
        first.javaScore= sc.nextInt();

        Learner second= new Learner();
        second.id = sc.nextInt();
        second.name = sc.next();
        second.javaScore= sc.nextInt();

        System.out.print("Before Update"); 
        System.out.print(first.id + " - " + first.name + " - " + first.javaScore);

        System.out.print(second.id + " - " +second.name + " - " + second.javaScore);

        first.javaScore = sc.nextInt();
         System.out.print("After Update"); 
          System.out.print(first.id + " - " + first.name + " - " + first.javaScore);

        System.out.print(second.id + " - " +second.name + " - " + second.javaScore);



    }
    
}
