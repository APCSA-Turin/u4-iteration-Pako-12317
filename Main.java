import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What number do you want to factorial? ");
    System.out.print("Enter a number between 0 and 170: ");
    int userNumber = scanner.nextInt();
    
    scanner.close();
  }
}
