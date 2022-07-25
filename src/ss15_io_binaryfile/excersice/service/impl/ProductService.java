package ss15_io_binaryfile.excersice.service.impl;

import ss15_io_binaryfile.excersice.model.Product;
import ss15_io_binaryfile.excersice.service.IProductService;
import ss15_io_binaryfile.excersice.utils.DataReadFromFile;
import ss15_io_binaryfile.excersice.utils.DataWriteFromFile;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static String path = "ss15_io_binaryfile/excersice/data/data.dat";


    @Override
    public void add() {
        List<Product> products = DataReadFromFile.readDataFromFile(path);
        Product product = getinfo();
        products.add(product);
        DataWriteFromFile.writeToFile(path, products);
        System.out.println("Thêm mới sản phẩm thành công.");
    }

    @Override
    public void display() {
        List<Product> products = DataReadFromFile.readDataFromFile(path);
        for (Product product :products ) {
            System.out.println(product);
        }
    }


    @Override
    public void search() {
        System.out.println("Mời bạn nhập tên sản phẩm:  ");
        String nameSearching = scanner.nextLine();
        List<Product> products = DataReadFromFile.readDataFromFile(path);
        boolean isExit = false;

        for (Product product : products) {
            if (product.getNameOfProduct().toLowerCase().contains(nameSearching)) {
                System.out.println(product);
                isExit = true;
            }
        }
        if (!isExit) {
            System.out.println("Không tìm thấy sản phẩm.");
        }

    }

    public static Product getinfo() {
        System.out.println("Nhập mã sản phẩm: ");
        String idProduct = scanner.nextLine();

        System.out.println("Nhập tên sản phẩm: ");
        String nameProduct = scanner.nextLine();

        System.out.println("Nhập tên hãng sản xuất: ");
        String manufacturerName = scanner.nextLine();

        System.out.println("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập mô tả sản phẩm: ");
        String description = scanner.nextLine();

        Product product = new Product(idProduct, nameProduct, manufacturerName, price, description);
        return product;
    }
}
