import java.util.Scanner;
class Student {
    int id;
    String name;
    String course;
    double javaScore;

}
   public class oops {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.id = sc.nextInt();
        s1.name = sc.next();
        s1.course = sc.next();
        s1.javaScore = sc.nextDouble() ;

        System.out.println("Student Profile");
        
        System.out.println("ID:" + s1.id);;
        
        System.out.println("Name: " + s1.name);
        
        System.out.println("Course:" + s1.course);
        System.out.println("java Score:" + s1.javaScore);
    
        
    
    }
}