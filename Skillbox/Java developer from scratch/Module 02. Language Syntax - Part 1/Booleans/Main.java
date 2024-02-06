//В готовом проекте напишите код, который будет проверять,
//достаточно ли ингредиентов для приготовления того или
//иного блюда.

//Откройте проект Booleans (скачайте прикреплённый архив
//с проектом).

// Ознакомьтесь с кодом, который написан в классе Main. В
//нём заданы шесть переменных с количествами разных
//ингредиентов, а затем показан пример проверки — хватает
//ли яблок для приготовления яблочного сока.

//Допишите в коде проекта условные операторы if так, чтобы
//они проверяли количество ингредиентов для каждого
//рецепта. Если ингредиентов достаточно для приготовления
//конкретного блюда, в консоль должно выводиться название
//этого блюда.

//Запустите программу и убедитесь, что печатаются названия
//блюд, которые можно приготовить из заданного количества
//ингредиентов.

//Попробуйте изменить количество ингредиентов (значения
//переменных) так, чтобы выдавались разные блюда. Перед
//отправкой на проверку убедитесь, что ваш код работает
//верно.

public class Main {
    public static void main(String[] args) {
        int milkAmount = 100; // ml
        int powderAmount = 300; // g
        int eggsCount = 4; // items
        int sugarAmount = 10; // g
        int oilAmount = 30; // ml
        int appleCount = 5; // items

        // Example
        // apples - 5
        if (appleCount >= 5) {
            System.out.println("Apple juice");
        }

        // powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1 && oilAmount >= 30) {
            System.out.println("Pancakes");
        }

        // milk - 300 ml, powder - 5 g, eggs - 5
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            System.out.println("Omelette");
        }

        // apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            System.out.println("Apple pie");
        }
    }
}