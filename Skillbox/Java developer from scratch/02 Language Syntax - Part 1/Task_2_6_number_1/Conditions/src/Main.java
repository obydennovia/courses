/*
public class Main {
    public static void main(String[] args) {
        int paperReserve = 600000;  //запас бумаги
        int inkReserve = 600000;    //запас чернил
        int coverReserve = 2000;    //количество листов для обложек

        double printRollerMinTemp = 80.5;   //минимальная температура печатающего вала (холодный режим)
        double printRollerMaxTemp = 120.75; //максимальная температура печатающего вала

        int pagesInBook = 530;  //количество страниц в одной книге
        int booksCount = 2000;  //количество книг, которые нужно напечатать

        boolean coldPrintingMode = false;    //режим холодной печати
        double printRollerTemp = 90;        //температура печатающего вала

        int papersCount = booksCount * pagesInBook / 2;     //количество необходимой бумаги
        int inkedPapersCount = papersCount + booksCount;    //общее количество листов, на которые тратятся чернила

        boolean paperIsEnough = papersCount <= paperReserve;
        boolean inkIhsEnough = inkedPapersCount <= inkReserve;
        boolean coversAreEnough = booksCount <= coverReserve;
        boolean rollerTempIsNormal = coldPrintingMode || ((printRollerTemp >= printRollerMinTemp) && (printRollerTemp <= printRollerMaxTemp));

        boolean errors = false;

        if (!paperIsEnough || !inkIhsEnough) {
            errors = true;
            System.out.println("Бумаги или чернил недостаточно");
        } else {
            if (coversAreEnough) {
                if (!coldPrintingMode && !rollerTempIsNormal) {
                    errors = true;
                    System.out.println("Неверный режим печати или температура печатающего ролла недопустимая");
                }
            } else {
                errors = true;
                System.out.println("Обложек недостаточно");
            }
        }
        if (!errors) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }
    }
}
*/

public class Main {
    public static void main(String[] args) {
        int paperReserve = 600000;  //запас бумаги
        int inkReserve = 600000;    //запас чернил
        int coverReserve = 2000;    //количество листов для обложек

        double printRollerMinTemp = 80.5;   //минимальная температура печатающего вала (холодный режим)
        double printRollerMaxTemp = 120.75; //максимальная температура печатающего вала

        int pagesInBook = 530;  //количество страниц в одной книге
        int booksCount = 2000;  //количество книг, которые нужно напечатать

        boolean coldPrintingMode = false;    //режим холодной печати
        double printRollerTemp = 50;        //температура печатающего вала

        int papersCount = booksCount * pagesInBook / 2;     //количество необходимой бумаги
        int inkedPapersCount = papersCount + booksCount;    //общее количество листов, на которые тратятся чернила

        boolean paperIsEnough = papersCount <= paperReserve;
        boolean inkIhsEnough = inkedPapersCount <= inkReserve;
        boolean coversAreEnough = booksCount <= coverReserve;
        boolean rollerTempIsNormal = coldPrintingMode || ((printRollerTemp >= printRollerMinTemp) && (printRollerTemp <= printRollerMaxTemp));

        boolean errors = false;

        if (!paperIsEnough) {
            errors = true;
            System.out.println("Бумаги недостаточно");
        }

        if (!inkIhsEnough) {
            errors = true;
            System.out.println("Чернил недостаточно");
        }

        if (!coversAreEnough) {
            errors = true;
            System.out.println("Обложек недостаточно");
        }

        if (!coldPrintingMode && !rollerTempIsNormal) {
            errors = true;
            System.out.println("Неверный режим печати или температура печатающего ролла недопустимая");
        }

        if (!errors) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }
    }
}