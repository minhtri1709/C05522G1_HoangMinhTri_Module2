package case_study.model;

public class Booking {
    private String idBooking;
    private String owner;
    private String voucher;

    public Booking(String idBooking, String owner, String voucher) {
        this.idBooking = idBooking;
        this.owner = owner;
        this.voucher = voucher;
    }

    private Booking(){

    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", owner='" + owner + '\'' +
                ", voucher='" + voucher + '\'' +
                '}';
    }
}
