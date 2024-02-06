//В новом проекте напишите программу, которая будет
//выводить заранее заданные возрасты трёх людей в порядке
//увеличения — от меньшего к большему.

public class Main {
    public static void main(String[] args) {
        int vasyaAge = 55;
        int katyaAge = 45;
        int mishaAge = 55;

        int min = -1;       // минимальный возраст
        int middle = -1;    // средний возраст
        int max = -1;       // максимальный возраст

        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
        } else if (katyaAge >= vasyaAge && katyaAge >= mishaAge) {
            max = katyaAge;
        } else if (mishaAge >= vasyaAge && mishaAge >= katyaAge) {
            max = mishaAge;
        }

        if (vasyaAge <= katyaAge && vasyaAge >= mishaAge) {
            middle = vasyaAge;
        } else if (vasyaAge <= mishaAge && vasyaAge >= katyaAge) {
            middle = vasyaAge;
        } else if (katyaAge <= vasyaAge && katyaAge >= mishaAge) {
            middle = katyaAge;
        } else if (katyaAge <= mishaAge && katyaAge >= vasyaAge) {
            middle = katyaAge;
        } else if (mishaAge < vasyaAge && mishaAge >= katyaAge) {
            middle = mishaAge;
        } else if (mishaAge <= katyaAge && mishaAge >= vasyaAge) {
            middle = mishaAge;
        }

        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
        } else if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
        } else if (mishaAge <= vasyaAge && mishaAge <= katyaAge) {
            min = mishaAge;
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);

        System.out.println(true && (false || (false || true)));
    }
}
