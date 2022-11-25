package mvc.model;

public class PaymentAccount extends BankAccount {
    private String numberCard;
    private int moneyInCard;

    public PaymentAccount() {
    }


    public PaymentAccount(int ID,
                          String accountCode,
                          String accountName,
                          String createAccountDate,
                          String numberCard,
                          int moneyInCard) {
        super(ID, accountCode, accountName, createAccountDate);
        this.numberCard = numberCard;
        this.moneyInCard = moneyInCard;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public int getMoneyInCard() {
        return moneyInCard;
    }

    public void setMoneyInCard(int moneyInCard) {
        this.moneyInCard = moneyInCard;
    }

    @Override
    public String toString() {
        return "paymentAccount{" +
                "numberCard='" + numberCard + '\'' +
                ", moneyInCard=" + moneyInCard +
                '}';
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s", this.getID(),
                this.getAccountCode(),
                this.getAccountName(),
                this.getCreateAccountDate(),
                this.getNumberCard(),
                this.getMoneyInCard());
    }


}
