package case_study.model;

public class Contract {

    private int idContract;
    private String nameOfContract;
    private int money;

    public Contract(int idContract, String nameOfContract, int money) {
        this.idContract = idContract;
        this.nameOfContract = nameOfContract;
        this.money = money;
    }

    private Contract(){

    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public String getNameOfContract() {
        return nameOfContract;
    }

    public void setNameOfContract(String nameOfContract) {
        this.nameOfContract = nameOfContract;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract=" + idContract +
                ", nameOfContract='" + nameOfContract + '\'' +
                ", money=" + money +
                '}';
    }
}
