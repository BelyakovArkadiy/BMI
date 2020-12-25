public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(79,1.78f);
        System.out.println("Your body mass index is " + bmi);
    }
}
