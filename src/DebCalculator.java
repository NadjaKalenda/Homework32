public class DebCalculator {
    public double calculate(BankOperation bankOperation, int years) {

        double debitRate = bankOperation.calculateDebitRate();
        double amount = bankOperation.getAmount();
        for (int i = 0; i < years; i++) {
            amount *= debitRate;}

return amount;
        }


    }


//    1. Посчитать, сколько пользователь заработает с каждого вклада
//2. Найти самый выгодный вклад (по наибольшему доходу от вклада)
//3. Найти среднюю прибыль с каждого вклада