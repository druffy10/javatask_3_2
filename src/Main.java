public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM = 1.87;
        double weightKg = 98;
        int indexBmi = service.calculate(heightM, weightKg);
        System.out.println("Индекс тела: " + indexBmi);
    }
}