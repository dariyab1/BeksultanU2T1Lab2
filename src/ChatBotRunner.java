import java.util.Scanner;
public class ChatBotRunner {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int debNum=7;
        ChatBot debbie=new ChatBot("Debbie",debNum);
        debbie.greeting("Dariya");
        debbie.weather();
        int numFeet=31;
        System.out.println("Did you know there are "+debbie.convertFeetToMeters(numFeet)+ " meters in "+numFeet+" feet?");
        System.out.println("What is your favorite number?");
        int favNum=input.nextInt();
        debbie.favoriteNumber(favNum);
        System.out.println("What's another number that you like:");
        int num3=input.nextInt();
        System.out.println("The sum of your two favorite numbers and my favorite number is "+debbie.addNumbers(debNum, favNum, num3));
        System.out.println(debbie.goodbye());

        debbie.funFact();
        System.out.println("How many minutes does it take for you to get to school?");
        int minutes=input.nextInt();
        System.out.println(debbie.commute(minutes));




    }
}
