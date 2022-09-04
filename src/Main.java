public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 55;//Вес в кг (входной параметр: weight типа double)
        int height = 160;//Рост в см (входной параметр: height типа int)
        String myBodyMassIndex = String.valueOf(service.calculate(weight, height));
        System.out.println(myBodyMassIndex);
    }
}
