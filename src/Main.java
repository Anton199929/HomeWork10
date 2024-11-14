//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        String firstName = "Ivan";
        String midlleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + midlleName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);

        System.out.println("Задача 2");

        System.out.println("Данный Ф. И. О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

        System.out.println("Задача 3");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName);


    }
}