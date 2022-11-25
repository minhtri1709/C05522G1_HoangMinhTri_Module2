package case_study.model.person;

import case_study.model.person.Person;

public class Customer extends Person {
    private String customerCode;
    private String kindOfCustomer;
    private String address;


    public Customer() {
    }

    public Customer(String name, String dayOfBirth, String id, String phoneNumber, String email, String sex, String customerCode, String kindOfCustomer, String address) {
        super(name, dayOfBirth, id, phoneNumber, email, sex);
        this.customerCode = customerCode;
        this.kindOfCustomer = kindOfCustomer;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getKindOfCustomer() {
        return kindOfCustomer;
    }

    public void setKindOfCustomer(String kindOfCustomer) {
        this.kindOfCustomer = kindOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " customerCode='" + customerCode + '\'' +
                ", kindOfCustomer='" + kindOfCustomer + '\'' +
                ", address='" + address ;

    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",this.getName(),
                this.getDayOfBirth(),
                this.getId(),
                this.getPhoneNumber(),
                this.getEmail(),
                this.getSex(),this.getCustomerCode()
                ,this.getKindOfCustomer(),this.getAddress());
    }
}
