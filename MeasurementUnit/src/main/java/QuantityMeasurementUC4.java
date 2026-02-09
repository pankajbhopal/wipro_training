import java.util.Scanner;

public class QuantityMeasurementUC4 {
    public enum LengthUnit{
    }
    public static class InputUtil{
        public static final Scanner scanner = new Scanner(System.in);
    }

    public static void InvalidNumericError(){
        System.out.println("Invalid input. Please enter a numeric value.");
        return;
    }
    public static void InputNumericValue(String unit){
        System.out.print("Enter "+ unit +" Value: ");
        if(!InputUtil.scanner.hasNextDouble()){
            InvalidNumericError();
        }
    }
    static void compareYardToFeet(){
        InputNumericValue("Yard");
        Double yard = InputUtil.scanner.nextDouble();
        InputNumericValue("Feet");
        Double feet = InputUtil.scanner.nextDouble();
    }
    public static void main(String[] args){
        compareYardToFeet();
        InputUtil.scanner.close();
    }

}
