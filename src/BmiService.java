public class BmiService {
    public double calculate(double weight, double growth) {
        double Bmi;
        Bmi = weight/(growth*growth);
        return Bmi;
    }
}
