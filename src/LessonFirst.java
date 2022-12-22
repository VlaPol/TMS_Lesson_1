import java.util.Scanner;

public class LessonFirst {

    public static void main(String[] args) {

        System.out.println("******* WELCOME! *******");
        System.out.println("If you want to pass, please enter your name and age!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        String inputName = scanner.nextLine();

        System.out.print("Enter Your age: ");
        int age = scanner.nextInt();

        System.out.println("Thank you!");

        if(age < 18){
            System.out.println(inputName + ", in your "+ age + " you can't go to our club!!!");
        }else {
            System.out.println(inputName + ", WELCOME to our club!");
        }

    }

}
