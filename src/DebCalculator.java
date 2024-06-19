import java.util.ArrayList;
import java.util.List;

public class DebCalculator {
    public double calculate(BankOperation bankOperation, int years) {
        double debitRate = bankOperation.calculateDebitRate();
        double jear = bankOperation.getYear();
        for (int i = 0; i < years; i++) {
            jear *= debitRate * bankOperation.getAmount(); //колличество денег за год
        }

        return bankOperation.getAmount();
    }

    private List<Integer> amount;

    public DebCalculator() {
        amount = new ArrayList<>();
    }

    public OperationDebit invest(double debitRate) {// выгодный вклад
        double max = 0.0;
        for (int i = 0; i < amount.size(); i++) {
            double bestInvest = amount * debitRate;
            if (bestInvest > max) {
                max = bestInvest;
            }
            return bestInvest;
        }

        double midIncoming = 0; // среднее значение
        for (int i = 0; i < amount.size(); i++) {
            midIncoming += amount.get(i);
        }
        return midIncoming;
    }
}


//    1. Посчитать, сколько пользователь заработает с каждого вклада
//2. Найти самый выгодный вклад (по наибольшему доходу от вклада)
//3. Найти среднюю прибыль с каждого вклада