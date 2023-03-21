import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

    System.out.println("podaj liczbe a:");
    double a = scan.nextDouble();
    System.out.println("podaj liczbe b:");
    double b = scan.nextDouble();
    double sum = a + b;
    System.out.println("suma wprowadzonych liczb to " + sum);
  }
}