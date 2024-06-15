import java.util.Objects;

public class BankOperation {

    private double year;
    private OperationDebit debitNumber;
    private double amount;

    private static final double DEBIT_RATE = 1.0;


    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public OperationDebit getDebitNumber() {
        return debitNumber;
    }

    public void setDebitNumber(OperationDebit debitNumber) {
        this.debitNumber = debitNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankOperation that = (BankOperation) o;
        return Double.compare(year, that.year) == 0 && Double.compare(amount, that.amount) == 0 && debitNumber == that.debitNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, debitNumber, amount);
    }

    @Override
    public String toString() {
        return "BankOperation{" +
                "year=" + year +
                ", debitNumber=" + debitNumber +
                ", amount=" + amount +
                '}';
    }

    public BankOperation(double year, OperationDebit debitNumber, double amount) {
        this.year = year;
        this.debitNumber = debitNumber;
        this.amount = amount;
    }

    public double calculateDebitRate() {
        if ( debitNumber!= null ) {
            return debitNumber.getDebitRate();
        }
        return DEBIT_RATE;

    }
public void printInfo(){
        switch (debitNumber){
            case DEBIT -> System.out.println("Ok");

        }
}
}


