package course1.lesson2;

public class MethodApp {

    //шаблон для форматирования, в который можно подставлять данные:
    public static final String TEMPLATE = "int = %d string = %s";
    //final - переменная, которая не может быть переопределена после создания, т.е. TEMPLATE - это константа

    public static void main(String[] args) {

        int v1 = multiplication(4, 10);
        int v2 = multiplication(5, 6.0);


        PrintUtil.printFormatted("v1 = " + v1 + " v2 = " + v2 + " v3 = " + multiplication(v1, v2));

        PrintUtil.printFormatted("string to format");


        System.out.printf(TEMPLATE, 10, "str");
        System.out.println();
        System.out.printf(TEMPLATE, 113, "st12313r");

        //TEMPLATE = "abc"; // нельзя, TEMPLATE - это константа

    }
    //методы по названию не конфликтуют
    //тип вызываемого метода проверяется по сигнатуре - по принимаемым и возвращаемым параметрам (их типам)
    //если метод что-то возвращает, то return обязателен - должен вернуть значение этого же типа

    public static int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    public static int multiplication(int n1, double n2) {
        return (int) (n1 * n2);
    }

    public static int multiplication(double n1, int n2) {
        return (int) (n1 * n2);
    }

    //модификатор доступа + тип значения + имя + Набор параметров


    //naming - ClassName MyClassName (CamelCase)
    //methods, variables - loaerCaseUperCase -> methodName, variableName

    //CONSTANTS  - UPPER_CASE (snake_case)_

    //method type - void (метод не возвращает ничего) / real type (либо ничего либо переменную)

    //Модификаторы доступа:
    // 1. public (метод доступен из любого пакета)
    // 2. protected (метод доступен классам своего пакета и последующим классам)
    // 3. (no modifier) default (доступен только классам из одного пакета)
    // 4. private (снаружи не доступен никому, только внутри данного класса)

}