/*
public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;

        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        if (coffeeAmount >= cappuchinoCoffeeRequired ||
        milkAmount >= cappuchinoMilkRequired) {
            System.out.println("Готовим капучино");
        } else  {
            System.out.println("Ингридиентов недостаточно :(");
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;

        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        if (milkAmount >= cappuchinoMilkRequired ||
        skimmedMilkAmount >= cappuchinoMilkRequired) {
            System.out.println("Молока достаточно");
        } else  {
            System.out.println("Молока недостаточно :(");
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;

        boolean isBlocked = true;
        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        if (!isBlocked) {
            System.out.println("Готовим кофе");
        } else  {
            System.out.println("Кофе-машина заблокирована");
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;

        boolean isBlocked = true;
        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        if (!isBlocked && milkAmount >= cappuchinoMilkRequired && coffeeAmount >= cappuchinoCoffeeRequired) {
            System.out.println("Готовим кофе");
        } else  {
            System.out.println("Что-то пошло не так");
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;
        int lowLactoseMilkAmount = 1000;

        boolean isBlocked = true;
        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        if (skimmedMilkAmount >= cappuchinoMilkRequired ||
                milkAmount >= cappuchinoMilkRequired ||
                lowLactoseMilkAmount >= cappuchinoMilkRequired) {
            System.out.println("Готовим кофе");
        } else  {
            System.out.println("Что-то пошло не так");
        }
    }
}

 */

/*
public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1;

        boolean isBlocked = true;
        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        if (!isBlocked && coffeeAmount >= cappuchinoCoffeeRequired &&
                (skimmedMilkAmount >= cappuchinoMilkRequired ||
                milkAmount >= cappuchinoMilkRequired)) {
            System.out.println("Готовим кофе");
        } else  {
            System.out.println("Что-то пошло не так");
        }
    }
}
 */

/*
public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1;

        boolean isBlocked = true;
        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        boolean milkSiEnough = skimmedMilkAmount >= cappuchinoMilkRequired ||
                milkAmount >= cappuchinoMilkRequired;

        boolean coffeeIsEnough = coffeeAmount >= cappuchinoCoffeeRequired;

        if (!isBlocked && coffeeIsEnough &&
                milkSiEnough) {
            System.out.println("Готовим кофе");
        } else  {
            System.out.println("Что-то пошло не так");
        }
    }
}
 */

/*
public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1;

        boolean isBlocked = true;
        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        boolean milkSiEnough = skimmedMilkAmount >= cappuchinoMilkRequired ||
                milkAmount >= cappuchinoMilkRequired;

        boolean coffeeIsEnough = coffeeAmount >= cappuchinoCoffeeRequired;

        if (isBlocked) {
            System.out.println("Кофе-машина заблокирована");
        } else {
            if (coffeeIsEnough && milkSiEnough) {
                System.out.println("Готовим кофе");
            } else {
                if (!coffeeIsEnough) {
                    System.out.println("Кофе недостаточно");
                }
                if (!milkSiEnough) {
                    System.out.println("Молока недостаточно");
                }
            }
        }
    }
}
*/

public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1;

        boolean isBlocked = true;
        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        boolean milkSiEnough = skimmedMilkAmount >= cappuchinoMilkRequired ||
                milkAmount >= cappuchinoMilkRequired;

        boolean coffeeIsEnough = coffeeAmount >= cappuchinoCoffeeRequired;

        boolean hasErrors = false;

        if (isBlocked) {
            System.out.println("Кофе-машина заблокирована");
            hasErrors = true;
        } else {

            if (coffeeIsEnough && milkSiEnough) {
                System.out.println("Готовим кофе");
                hasErrors = true;
            }

            if (!coffeeIsEnough) {
                System.out.println("Кофе недостаточно");
                hasErrors = true;
            }

            if (!milkSiEnough) {
                System.out.println("Молока недостаточно");
                hasErrors = true;
            }

            if (!hasErrors) {
                System.out.println("Готовим кофе");
            }
        }
    }
}