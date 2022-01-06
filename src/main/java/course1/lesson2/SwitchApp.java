package course1.lesson2;

public class SwitchApp {
    public static void main(String[] args) {
        /*checkOrderStatus2("DELIVERED");
        checkOrderStatus2("IN_DELIVERY");*/

        checkOrderStatus2("SHIPPED");
        checkOrderStatus2("IN_DELIVERY");
        String month = "JAN";
        switch (month) {
            case "DEC":
            case "JAN":
            case "FEB": {
                System.out.println("Winter");
                break;
            }
        }
    }


    public static void checkOrderStatus(String orderStatus) {
        if (orderStatus.equals("ACCEPTED")) {
            System.out.println("Принят");
        } else if (orderStatus.equals("DELIVERED") ) {
            System.out.println("Доставлен");
        } else {
            System.out.println("Неизвестный статус заказа");
        }
    }


    public static void checkOrderStatus2(String orderStatus) {
        switch (orderStatus) {
            case "ACCEPTED": {
                System.out.println("Принят");
                break;
            }
            case "DELIVERED": {
                System.out.println("Доставлен");
                break;
            }
            case "SHIPPED":         // Перечисление несколько условий и, при выполнении одного из них,
            case "IN_DELIVERY": {   // последует одно и то же действие
                System.out.println("В доставке");
                break;
            }
            default: {
                System.out.println("Неизвестный статус заказа");
            }
        }
    }
}
