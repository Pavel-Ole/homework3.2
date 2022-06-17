public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        // масса считается в килограммах;
        // рост считается в метрах;

        double bmi = service.calculate(78, 1.7);
        System.out.println(bmi);

        System.out.println();
        System.out.println(service.calculate(80, 1.6));

        System.out.println();
        System.out.println(service.calculate(60, 1.8));

        System.out.println();
        System.out.println(service.calculate(100, 1.8));

        System.out.println();
        System.out.println(service.calculate(130, 1.9));
    }
}
