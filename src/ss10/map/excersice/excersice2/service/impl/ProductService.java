package ss10.map.excersice.excersice2.service.impl;

import ss10.map.excersice.excersice2.model.Product;
import ss10.map.excersice.excersice2.service.IProductService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product("abc", "1", 1));
        productList.add(new Product("bánh", "2", 100));
        productList.add(new Product("kẹo", "3", 40));
        productList.add(new Product("cam", "4", 30));
    }

    @Override
    public void add() {
        Product product = infoProduct();
        productList.add(product);
        System.out.println("Thêm mới thành công. ");
    }

    @Override
    public void display() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void edit() {
        System.out.println("Mời bạn nhập vào ID của sản phẩm cần chỉnh sửa: ");
        String input = scanner.nextLine();

        for (int i = 0; i < productList.size(); i++) {
            if (input.equals(productList.get(i).getId())) {
                System.out.println("Nhập vào tên mới sản phẩm: ");
                String name = scanner.nextLine();
                System.out.println("Nhập vào giá mới sản phẩm:  ");
                double price = Double.parseDouble(scanner.nextLine());
                Product product = new Product(name, productList.get(i).getId(), price);
                productList.set(i, product);
            }
        }
    }

    @Override
    public void sort() {
        System.out.println("Bạn muốn sắp xếp theo thứ tự:\n" +
                "1. Tăng dần\n" +
                "2. Giảm dần");
        int choose = Integer.parseInt(scanner.nextLine());

        if (choose == 1) {
            productList.sort(new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return (int) ((int) o1.getPrice() - o2.getPrice());

                }
            });
        }else {
            productList.sort(new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return (int) (o2.getPrice() - o1.getPrice());
                }
            });
        }
    }
        @Override
        public void remove () {
            System.out.println("Nhập vào ID sản phẩm cần xoá:  ");
            String id = scanner.nextLine();
            boolean isExit = false;

            for (Product product : productList) {
                if (id.equals(product.getId())) {
                    System.out.println("Bạn có chắc muốn xoá sản phẩm: \n" +
                            "1. Có\n" +
                            "2. Không");

                    int choose = Integer.parseInt(scanner.nextLine());

                    if (choose == 1) {
                        productList.remove(product);
                        System.out.println("Đã xoá thành công");
                    }
                    isExit = true;
                    break;
                }
            }
            if (!isExit) {
                System.out.println("Không tìm thấy!");
            }
        }

        public static Product infoProduct () {
            System.out.println("Nhập vào ID sản phẩm: ");
            String id = scanner.nextLine();

            System.out.println("Nhập vào tên sản phẩm: ");
            String name = scanner.nextLine();

            System.out.println("Nhập vào giá của sản phẩm:  ");
            double price = Double.parseDouble(scanner.nextLine());

            Product product = new Product(name, id, price);
            return product;
        }
    }
