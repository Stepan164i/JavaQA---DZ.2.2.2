public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double Bmi = service.calculate (85,1.84);
        System.out.println(Bmi);
    }

}
