package ss15_io_binaryfile.excersice.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String idOfProduct;
    private String nameOfProduct;
    private String manufacturerName;
    private int price;
    private String description;

    public Product() {
    }

    public Product(String idOfProduct, String nameOfProduct, String manufacturerName, int price, String description) {
        this.idOfProduct = idOfProduct;
        this.nameOfProduct = nameOfProduct;
        this.manufacturerName = manufacturerName;
        this.price = price;
        this.description = description;
    }

    public String getIdOfProduct() {
        return idOfProduct;
    }

    public void setIdOfProduct(String idOfProduct) {
        this.idOfProduct = idOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Product{" +
                "idOfProduct='" + idOfProduct + '\'' +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
