package case_study.model.person;

import case_study.model.person.Person;

public class Customer extends Person {

    private String voucher;


    public Customer() {
    }



    public Customer(String name, String dayOfBirth, String province, String id, String voucher) {
        super(name, dayOfBirth, province, id);
        this.voucher = voucher;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "voucher='" + voucher + '\'' +
                "} " + super.toString();
    }
}
