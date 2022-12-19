/*
public class Main {
    public static void main(String[] args) {
        for (int i = 15; i <= 40; i = i + 1) {
            System.out.println(i);

            if (i == 16) {
                System.out.println("Вы можете начинать обучаться вождению");
            }

            if (i == 18) {
                System.out.println("Вы можете получить водитльские права");
            }

            if (i == 35) {
                System.out.println("Вы можете баллотироваться на пост президента");
            }
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        for (int i = 50; i > 0; i = i - 1) {
            System.out.println(i);
        }
    }
}
*/

/*

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (;;) {
            System.out.println("Введите первое число");
            int value1 = new Scanner(System.in).nextInt();

            System.out.println("Введите второе число");
            int value2 = new Scanner(System.in).nextInt();

            int result= value1 * value2;
            System.out.println("Произведение чисел равно: " + result);
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        int i = 0;
        for (; i < 100; i = i + 3) {
            System.out.println(i);
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        for (int i = 0; ; i = i + 3) {
            System.out.println(i);
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100 ;) {
            System.out.println(i);
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100 ;) {
            System.out.println(i);
            i = i + 2;
        }
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Текст будет выводиться постоянно");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int value = -1;
        while (value != 0) {
            value = new Scanner(System.in).nextInt();
            sum = sum + value;
        }

        System.out.println("Сумма введённых числе равна " + sum);
    }
}
*/

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int value = -1; value != 0; ) {
            value = new Scanner(System.in).nextInt();
            sum = sum + value;
        }

        System.out.println("Сумма введённых числе равна " + sum);
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        int soughtYear = 1985;

        int firstYear = 1922;
        int lastYear = 2022;

        boolean yearExist = false;

        for (int year = firstYear; year <= lastYear; year = year + 1) {
            if (year == soughtYear) {
                yearExist = true;
                break;
            }
        }
        String found = "Год найден";
        String notFound = "Год не найден";
        System.out.println(yearExist ? found : notFound);
    }
}
*/

public class Main {
    public static void main(String[] args) {

        int firstYear = 1922;
        int lastYear = 2022;

        boolean yearExist = false;

        for (int year = firstYear; year <= lastYear; year = year + 1) {
            if (year % 4 != 0) {
                continue;
            }
            System.out.println(year);
            for (int month = 1; month <= 12; month = month + 1) {
                String zero = month < 10 ? "0" : "";
                System.out.println("29." + zero + month + "." + year);
            }
        }
    }
}