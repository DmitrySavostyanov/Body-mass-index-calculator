public class BmiService {
    public String calculate(double weight, int height) {
        String myBodyMassIndex;
        double bodyMassIndexDouble = 10_000 * (weight / Math.pow((int) height, 2));//Поскольку задаем рост в см,
        // то для приведения ЕИ значнеия ИМТ к [кг/м2]  * на 10_000, где увеличение нулей после пробела дает
        // нужную раазрядность (по факту имеем 0.125, если _00 -->то 1.25, если _000 --> то 12.5)
        // Это эквиввалентно если бы мы при ручном расчете умножили результат на 100.
        bodyMassIndexDouble = (double) ((int) (bodyMassIndexDouble * 10)) / 10; // Округление до одного знака чисел
        // после запятой
        myBodyMassIndex = String.valueOf(bodyMassIndexDouble); //перевод из double в String
        return myBodyMassIndex;
    }
}

