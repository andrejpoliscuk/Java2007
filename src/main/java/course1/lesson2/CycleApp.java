package course1.lesson2;

public class CycleApp {

    public static void main(String[] args) {

        //10 % 3 = 1
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {       //% - проверка десятичной части после деления:
                                    // если 0 - остаток равен 0, если 1 - остаток не нулевой
                continue;           // переход в начало цикла к следующему значению i
            }
            if (i > 6) {
                break;              //break - полностью разрывает цикл
            }
            PrintUtil.printFormatted("string " + i);
        }
        System.out.println(getDividedByThree());


     /*   for (int i=10; i > 0; i--){
            System.out.println(i);
        }*/

       /* for(;;){
        }*/

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i=" + i + " j=" + j);
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i=" + i + " j=" + j);
            }
        }
    }


    public static int getDividedByThree() {
        for (int i = 2; i < 10; i = i + 2) {
            if (i % 3 == 0) {
                return i; //цикл прерывается после того, как было найдено число кратное 3
            }
        }
        return 0; // return нужен, т.к. из метода нужно вернуть int, если не найдено ни одно число кратное 3
    }
}