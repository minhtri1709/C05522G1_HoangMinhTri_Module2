package mvc.model;

public abstract class BankAccount {
    private int ID;
    private String accountCode;
    private String accountName;
    private String createAccountDate;

    public BankAccount() {
    }

    public BankAccount(int ID, String accountCode, String accountName, String createAccountDate) {
        this.ID = ID;
        this.accountCode = accountCode;
        this.accountName = accountName;
        this.createAccountDate = createAccountDate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getCreateAccountDate() {
        return createAccountDate;
    }

    public void setCreateAccountDate(String createAccountDate) {
        this.createAccountDate = createAccountDate;
    }

    @Override
    public String toString() {
        return "bankAccount{" +
                "ID=" + ID +
                ", accountCode='" + accountCode + '\'' +
                ", accountName='" + accountName + '\'' +
                ", createAccountDate='" + createAccountDate + '\'' +
                '}';
    }

    public abstract String getInfo();
}
