package ss15_io_binaryfile.excersice.controller;

import ss15_io_binaryfile.excersice.service.IProductService;
import ss15_io_binaryfile.excersice.service.impl.ProductService;

import java.util.Scanner;

public class MenuProduct {
    private Scanner scanner = new Scanner(System.in);
    private IProductService iProductService = (IProductService) new ProductService();

    public void menuProduct() {

        do {
            System.out.println("Quản lý sản phẩm:\n" +
                    "1. Thêm sản phẩm.\n" +
                    "2. Hiển thị sản phẩm.\n" +
                    "3. Tìm kiếm thông tin sản phẩm.\n" +
                    "4. Thoát chương trình.");

            int choose = scanner.nextInt();

            switch (choose) {
                case 1: {
                    iProductService.add();
                    break;
                }
                case 2: {
                    iProductService.display();
                    break;
                }
                case 3: {
                    iProductService.search();
                    break;
                }
                case 4: {
                    System.exit(1);
                }
            }
        } while (true);
    }
}
