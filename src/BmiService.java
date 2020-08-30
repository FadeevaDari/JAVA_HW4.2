public class BmiService {
    public double calculate(double height, int weight) {

        double bmi = (double) weight / Math.pow((double)height, 2);

        return  bmi;
    }
}
