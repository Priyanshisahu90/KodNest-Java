public class Main {

    public static void main(String[] args){
        boolean isTicket = true;
        int age = 22;
        // if(isTicket == true && age >=18){
        //     System.out.println("Allow to watch movie");
        // }
        // else{
        //     System.out.println("Not allow too young");
        // }



        if(isTicket == true){
            if(age>=18){
                System.out.println("Allow to watch movie");
            }
            else{
                 System.out.println("Not allow to watch movie");
            }
        }
    }
}