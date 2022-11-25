package mvc.model;

public class SavingAccount extends BankAccount {
    private int money;
    private String dateBegin;
    private int percent;
    private String endOfSaving;

    public SavingAccount() {
    }

    public SavingAccount(int ID,
                         String accountCode,
                         String accountName,
                         String createAccountDate,
                         int money,
                         String dateBegin,
                         int percent,
                         String endOfSaving) {
        super(ID, accountCode, accountName, createAccountDate);
        this.money = money;
        this.dateBegin = dateBegin;
        this.percent = percent;
        this.endOfSaving = endOfSaving;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(String dateBegin) {
        this.dateBegin = dateBegin;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public String getEndOfSaving() {
        return endOfSaving;
    }

    public void setEndOfSaving(String endOfSaving) {
        this.endOfSaving = endOfSaving;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s" ,this.getID(),
                this.getAccountCode(),
                this.getAccountName(),
                this.getCreateAccountDate(),
                this.getMoney(),
                this.getDateBegin(),
                this.getPercent(),
                this.getEndOfSaving());
    }
}
