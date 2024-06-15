import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        BankOperation bankOperationDebit = new BankOperation(1, 1, 1000, OperationDebit.DEBIT);
        DebCalculator calculator = new DebCalculator();
        bankOperationDebit.printInfo();

        double debit = calculator.calculate(bankOperationDebit, 1);
        System.out.println(debit);

        List<Integer> list = new ArrayList<>();

        while (true) {
            list.add(amount);//бесконечное считывание

            if (amount == -1) {
                break;
            }


        }


    }}


//1. Пользователь вводит в консоли число - количество данных, которые будет вводить
//2. Далее пользователь начинает ввод данных через консоль (кол-во данных = числу, введенному ранее)
////3. В каждой строке пользователь вводит:
//        3.1 Количество денег, которые он хочет положить на вклад
//3.2 Процент по вкладку
//3.3 Количество лет (длительность вклада)
//    1. Посчитать, сколько пользователь заработает с каждого вклада
//2. Найти самый выгодный вклад (по наибольшему доходу от вклада)
//3. Найти среднюю прибыль с каждого вклада

//!!!Решать с использованием листа (ArrayList или LinkedList)!!!
//
//        1. посчитать время работы в наносекундах с ArrayList и с LinkedList
//        1. вместо ввода из консоли - пользователь вводин данные из  ввод из файла
//2
//        1000 2 5                      (1000 евро на 2 года под 5%)
//        500 5 10                      (500 евро на 5 лет под 10%)