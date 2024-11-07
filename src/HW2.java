import java.util.Random;

public class HW2 {

    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), 15)); // пример 1
        System.out.println(permission(generateRandomAge(), -5)); // пример 2
        System.out.println(permission(generateRandomAge(), 20)); // пример 3
        System.out.println(permission(generateRandomAge(), 30)); // пример 4
        System.out.println(permission(generateRandomAge(), -15)); // пример 5
    }

    // Метод для проверки, можно ли идти гулять
    public static String permission(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        return (int) (Math.random() * 100) + 1; // Генерация случайного возраста от 1 до 100
    }
}