import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Month and Year:");
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.println("31 Days");

        else if (month == 4 || month == 6|| month == 9|| month == 11) {
            System.out.println("30 Days");
            
        }
        else if (month == 2){
            if (java.time.Year.of(year).isLeap()){
                System.out.println("29 Days");
            } else{
            System.out.println("28 Days");
            }
        }
        

    }
}
