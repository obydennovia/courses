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

        if (paperIsEnough && inkIhsEnough && coversAreEnough && rollerTempIsNormal) {
            System.out.println("Печать разрешена");
        } else {
            System.out.println("Печать запрещена");
        }
    }
}