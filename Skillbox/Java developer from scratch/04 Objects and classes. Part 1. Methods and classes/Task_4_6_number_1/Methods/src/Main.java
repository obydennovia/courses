public class Main {
    public static void main(String[] args) {
        User dmitry = new User("Дмитрий", 45);
        User petya = new User("Петя", 21);
        User vasya = new User("Вася", 22);

        printUserInfo(dmitry);
        printUserInfo(petya);
        printUserInfo(vasya);
    }

    public static void printUserInfo(User user) {
        int age = user.getAge();
        String label = "";
        boolean isExclusion = (age % 100 >= 11) && (age % 100 <= 14);
        int ageLastDigit = age % 10;
        if (ageLastDigit == 1) {
            label = "год";
        } else if (ageLastDigit >= 5 && ageLastDigit <= 9) {
                label = "лет";
        } else if (ageLastDigit >= 2 && ageLastDigit <= 4) {
            label = "года";
        }
        if (isExclusion) {
            label = "лет";
        }

        System.out.println("Пользователь: " + user.getName() + ", " + user.getAge() + " " + label);
    }
}
