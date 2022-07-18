package ss10.map.excersice.excersice2.controller;

import ss10.map.excersice.excersice2.service.IProductService;
import ss10.map.excersice.excersice2.service.impl.ProductService;

import java.util.Scanner;

public class ProductManagerController {
    public static void productController(){
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM\n" +
                    "1. Thêm sản phẩm.\n" +
                    "2. Sửa thông tin sản phẩm theo id.\n" +
                    "3. Xoá sản phẩm theo id.\n" +
                    "4. Hiển thị danh sách sản phẩm.\n" +
                    "5. Sắp xếp sản phẩm tăng dần, giảm dần theo giá.\n" +
                    "6. Thoát chương trình");

            System.out.println("Mời bạn nhập vào lựa chọn: ");
            int choose  = Integer.parseInt(scanner.nextLine());
            IProductService iProductService = new ProductService();

            switch (choose){
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.edit();
                    break;
                case 3:
                    iProductService.remove();
                    break;
                case 4:
                    iProductService.display();
                    break;
                case 5:
                    iProductService.sort();
                    break;
                case 6:{
                    System.exit(1);
                }
            }
        }while (true);
    }
}
