import java.time.LocalDate;
import java.util.Scanner;

public class LessonFirst {

    public static void main(String[] args) {

        System.out.println("******* WELCOME! *******");
        System.out.println("If you want to pass, please enter your name and age!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        String inputName = scanner.nextLine();

        System.out.print("Enter your birth age: ");
        int inputAge = scanner.nextInt();

        System.out.println("Thank you!");

        try{
            int curAge = getAge(inputAge);
            if(curAge < 18){
                System.out.println(inputName + ", in your "+ curAge + " you can't go to our club!!!");
            }else {
                System.out.println(inputName + ", you have "+ curAge +" years, and you are WELCOME to our club!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    private static int getAge(int age) throws Exception{

        if(age < LocalDate.now().getYear()) {
            return LocalDate.now().getYear() - age;
        }else{
            throw new Exception("You are cheater!!!!");
        }
    }

}
