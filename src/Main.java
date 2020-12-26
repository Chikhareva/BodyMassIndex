public class Main {
    public static void main(String[] args) {
        BmiService service=new BmiService();
        double Bmi=service.calculate(79,1.76);
        System.out.println(Bmi);
    }
}
