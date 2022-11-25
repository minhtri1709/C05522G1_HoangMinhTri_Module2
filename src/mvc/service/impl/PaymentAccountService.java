package mvc.service.impl;

import mvc.exception.NotFoundBankAccountException;
import mvc.model.BankAccount;
import mvc.model.PaymentAccount;
import mvc.service.IPaymentService;
import mvc.utils.ReadWriteAccountUtils;

import java.util.List;
import java.util.Scanner;

public class PaymentAccountService implements IPaymentService {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "mvc/data/paymentAccount.csv";

    @Override
    public void add() {

    }

    @Override
    public void remove() {
        List<BankAccount> bankAccountList = ReadWriteAccountUtils.readCustomerFile(PATH);
        System.out.println("Mời bạn nhập vào mã thẻ: ");
        String numberCard = SCANNER.nextLine();
        boolean isExit = false;

        do {
            for (BankAccount bankAccount : bankAccountList){
                if(numberCard.equals(bankAccount.getAccountCode())){
                    System.out.println("Bạn có chắc muốn xoá số tài khoản này:\n" +
                            "1. Có\n" +
                            "2. Không ");
                    int choose = Integer.parseInt(SCANNER.nextLine());

                    if(choose == 1){
                        bankAccountList.remove(bankAccount);
                        isExit = true;
                        ReadWriteAccountUtils.writeCustomerFile(PATH,bankAccountList);
                        break;
                    }
                }
            }  try {
                if(!isExit){
                    throw new NotFoundBankAccountException("Tài khoản không tồn tai.");
                }
            }catch (NotFoundBankAccountException e){
                System.out.println(e.getMessage());
            }
        }while (!isExit);

    }

    @Override
    public void display() {
        List<BankAccount> bankAccountList = ReadWriteAccountUtils.readCustomerFile(PATH);
        for (BankAccount bankAccount : bankAccountList){
            System.out.println(bankAccount);
        }
    }

    @Override
    public void search() {
        System.out.println("Mời bạn nhập vào mã thẻ: ");
        String numberCard = SCANNER.nextLine();
        List<BankAccount> bankAccountList = ReadWriteAccountUtils.readCustomerFile(PATH);
        boolean isExit = false;
        for (BankAccount bankAccount : bankAccountList){
            if(bankAccount.getAccountCode().contains(numberCard) || bankAccount.getAccountName().contains(numberCard)){
                System.out.println(bankAccount);
                isExit =true;
            }
        }
        if(!isExit){
            System.out.println("Không tìm thấy trong danh sách.");
        }
    }

//    @Override
//    public void searchByName() {
////        System.out.println("Mời bạn nhập vào tên khách hàng: ");
////        String name = SCANNER.nextLine();
////        List<BankAccount> bankAccountList = ReadWriteAccountUtils.readCustomerFile(PATH);
////        boolean isExit = false;
////        for (BankAccount bankAccount : bankAccountList){
////            if(bankAccount.getAccountName().contains(name)){
////                System.out.println(bankAccount);
////                isExit =true;
////            }
////        }
//        if(!isExit){
//            System.out.println("Không tìm thấy trong danh sách.");
//        }
//    }
}
