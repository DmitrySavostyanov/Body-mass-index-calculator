public class BmiService {
    public String calculate(double weight, int height) {
        String myBodyMassIndex;
        double bodyMassIndexDouble = 0;
        if (weight < 0 || weight > 250) {
            myBodyMassIndex = "Неверный ввод";
        } else if (height < 0 || height > 250) {
            myBodyMassIndex = "Неверный ввод";
        } else {
            bodyMassIndexDouble = 10_000 * (weight / Math.pow((int) height, 2));//Поскольку задаем рост в см,
            // то для приведения ЕИ значнеия ИМТ к [кг/м2]  * на 10_000, где увеличение нулей после пробела дает
            // нужную раазрядность (по факту имеем 0.125, если _00 -->то 1.25, если _000 --> то 12.5)
            // Это эквиввалентно если бы мы при ручном расчете умножили результат на 100.
            bodyMassIndexDouble = (double) ((int) (bodyMassIndexDouble * 10)) / 10; // Округление до одного знака чисел
            // после запятой
            myBodyMassIndex = String.valueOf(bodyMassIndexDouble); //перевод из double в String
        }
        if (bodyMassIndexDouble < 16) {
            myBodyMassIndex = "Ваш индекс массы тела: " + myBodyMassIndex +
                    ". Данное значение ИМТ соотвествует: Выраженному дефициту массы тела.";
        } else if (bodyMassIndexDouble >= 16 && bodyMassIndexDouble < 18.5) {
            myBodyMassIndex = "Ваш индекс массы тела: " + myBodyMassIndex +
                    ". Данное значение ИМТ соотвествует: Недостаточная масса тела.";
        }
        if (bodyMassIndexDouble >= 18.5 && bodyMassIndexDouble < 25) {
            myBodyMassIndex = "Ваш индекс массы тела: " + myBodyMassIndex +
                    ". Данное значение ИМТ соотвествует: Нормальная масса тела.";
        } else if (bodyMassIndexDouble >= 25 && bodyMassIndexDouble < 30) {
            myBodyMassIndex = "Ваш индекс массы тела: " + myBodyMassIndex +
                    ". Данное значение ИМТ соотвествует: Избыточная масса тела (предожирение).";
        }
        if (bodyMassIndexDouble >= 30 && bodyMassIndexDouble < 35) {
            myBodyMassIndex = "Ваш индекс массы тела: " + myBodyMassIndex +
                    ". Данное значение ИМТ соотвествует: Ожирение 1-ой степени.";
        } else if (bodyMassIndexDouble >= 35 && bodyMassIndexDouble < 40) {
            myBodyMassIndex = "Ваш индекс массы тела: " + myBodyMassIndex +
                    ". Данное значение ИМТ соотвествует: Ожирение 2-ой степени.";
        }
        if (bodyMassIndexDouble >= 40) {
            myBodyMassIndex = "Ваш индекс массы тела: " + myBodyMassIndex +
                    ". Данное значение ИМТ соотвествует: Ожирение 3-ой степени.";
        }
        return myBodyMassIndex;
    }
}
