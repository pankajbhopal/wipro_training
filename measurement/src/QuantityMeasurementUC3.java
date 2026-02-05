package measurement.src;
import java.util.Scanner;

public class QuantityMeasurementUC3 {
    public enum LengthUnit {
        Feet(12.0),
        Inches(1.0);
        private Double unitValue;
        LengthUnit(Double unitValue){
            this.unitValue = unitValue;
        }
        public Double getUnitValue(){
            return  unitValue;
        }
    }
    class InputUtil {
        public static final Scanner scanner = new Scanner(System.in);
    }
    public static void InvalidNumericError(){
        System.out.println("Invalid input. Please enter a numeric value.");
        return;
    }
    class Feet{
        //        Scanner scanner = new Scanner(System.in);
        void display(){
            System.out.print("Enter first value in feet: ");
            if (!InputUtil.scanner.hasNextDouble()) {
                InvalidNumericError();
            }
            Double feet1 = InputUtil.scanner.nextDouble();
            // Input second value in feet
            System.out.print("Enter second value in feet: ");
            if (!InputUtil.scanner.hasNextDouble()) {
                InvalidNumericError();
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
            if (!measurement.src.InputUtil.scanner.hasNextDouble()) {
                InvalidNumericError();
            }
            Double inches1 = measurement.src.InputUtil.scanner.nextDouble();
            // Input second value in feet
            System.out.print("Enter second value in Inches: ");
            if (!measurement.src.InputUtil.scanner.hasNextDouble()) {
                InvalidNumericError();
            }
            Double inches2 = measurement.src.InputUtil.scanner.nextDouble();
            if(inches1.equals(inches2)){
                System.out.println("Inches is Equal(True)");
            }else{
                System.out.println("Inches is not an Equal(False)");
            }
        }
    }

   static void FeetAndInchesEquality(){
        LengthUnit f = LengthUnit.Feet;
        LengthUnit i = LengthUnit.Inches;
        if(f.getUnitValue().equals(i.getUnitValue()*12)){
            System.out.println("Feet and Inches Enum Value is Equal.");
        }else{
            System.out.println("Feet and Inches Enum Value is not Equal.");
        }

   }

   static void FeetInchesComparison(){
        System.out.print("Enter a Feet Value: ");
        if(!InputUtil.scanner.hasNextDouble()){
            InvalidNumericError();
        }
        Double feetValue = InputUtil.scanner.nextDouble();
       System.out.print("Enter a Inches Value: ");
       if(!InputUtil.scanner.hasNextDouble()){
           InvalidNumericError();
       }
       Double inchesValue = InputUtil.scanner.nextDouble();
       if(feetValue.equals(inchesValue/12)){
           System.out.println("Feet and Inches Input Value is Equal(True).");
       }else{
           System.out.println("Feet and Inches Input Value is not Equal(False).");
       }
   }

    public static void main(String[] args) {
        System.out.println("Hello Feet Measurement!");
        QuantityMeasurement qm = new QuantityMeasurement();
//        QuantityMeasurement.Feet feet = qm.new Feet();
        QuantityMeasurement.Inches inches = qm.new Inches();

        FeetAndInchesEquality();
//        feet.display();
        inches.display();
        FeetInchesComparison();
        measurement.src.InputUtil.scanner.close();
    }
}
