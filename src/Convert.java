public class Convert {
    private double valueTyped;
    private double valueRate;
    private String baseCode;
    private String targetCode;
//    public Convert(ConvertedCoin convertedCoin){
//        this.valueRate = Double.valueOf(convertedCoin.conversion_rate());
//    }

    public Convert() {

    }

    public void setValueTyped(double valueTyped) {
        this.valueTyped = valueTyped;
    }

    public void setValueRate(double valueRate) {
        this.valueRate = valueRate;
    }

    public double getValueTyped() {
        return valueTyped;
    }

    public double getValueRate() {
        return valueRate;
    }

    public double convertido(){
        return this.getValueRate() * this.getValueTyped();
    }
}