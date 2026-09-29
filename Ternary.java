public class Ternary{
    public static void main(String [] args){
        int m1 = 89;
        int m2 =55;
        int m3 = 67;
        int m4 =60;
        int m5 = 80;
        int total = m1 + m2 + m3 + m4 + m5 ;
        double  percentage = (total/500.0) * 100; // or total / 5

        String result = (percentage < 40) ? "Fail"
                      : (percentage <= 59) ? "Pass"
                      : (percentage <= 74) ? "First Class"
                      : "Distinction";

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
    }
}