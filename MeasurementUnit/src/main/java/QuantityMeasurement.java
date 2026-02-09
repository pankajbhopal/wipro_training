import java.util.Scanner;

public class QuantityMeasurement {
    class InputUtil {
        public static final Scanner scanner = new Scanner(System.in);
    }
    public int addNumberForTestCase(int a, int b){
        return a + b;
    }
    class Feet{
//        Scanner scanner = new Scanner(System.in);
        void display(){
            System.out.print("Enter first value in feet: ");
            if (!InputUtil.scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                return;
            }
            Double feet1 = InputUtil.scanner.nextDouble();

            // Input second value in feet
            System.out.print("Enter second value in feet: ");
            if (!InputUtil.scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                return;
            }
            Double feet2 = InputUtil.scanner.nextDouble();
            if(feet1.equals(feet2)){
                System.out.println("Feet is Equal(True)");
            }else{
                System.out.println("Feet is not an Equal(False)");
            }

        }
    }
    class Inches{
//        Scanner scanner = new Scanner(System.in);
        void display(){
            System.out.print("Enter first value in Inches: ");
            if (!InputUtil.scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                return;
            }
            Double inches1 = InputUtil.scanner.nextDouble();

            // Input second value in feet
            System.out.print("Enter second value in Inches: ");
            if (!InputUtil.scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                return;
            }
            Double inches2 = InputUtil.scanner.nextDouble();
            if(inches1.equals(inches2)){
                System.out.println("Inches is Equal(True)");
            }else{
                System.out.println("Inches is not an Equal(False)");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello Feet Measurement!");
        QuantityMeasurement qm = new QuantityMeasurement();
        Feet feet = qm.new Feet();
        Inches inches = qm.new Inches();

        feet.display();
        inches.display();
        InputUtil.scanner.close();

    }
}
