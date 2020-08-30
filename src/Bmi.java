public class Bmi {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        double bmi = bmiService.calculate( 1.65, 57);

        System.out.printf("Индекс массы тела: %.2f", bmi);
    }
}
