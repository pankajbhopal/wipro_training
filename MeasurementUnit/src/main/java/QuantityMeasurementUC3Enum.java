package measurement.src;

public class QuantityMeasurementUC3Enum {
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
    static void FeetAndInchesEquality(){
        LengthUnit f = LengthUnit.Feet;
        LengthUnit i = LengthUnit.Inches;
        if(f.getUnitValue().equals(i.getUnitValue()*12)){
            System.out.println("Feet and Inches Enum Value is Equal.");
        }else{
            System.out.println("Feet and Inches Enum Value is not Equal.");
        }
    }
    public static void main(String[] args){
        FeetAndInchesEquality();
    }
}
