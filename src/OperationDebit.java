public enum OperationDebit {

    DEBIT(1.05,"Сберегательный");
    private double debitRate;

    private String name;

    public double getDebitRate() {
        return debitRate;
    }

    public String getName() {
        return name;
    }

    OperationDebit(double debitRate, String name) {
        this.debitRate = debitRate;
        this.name = name;
    }
}

