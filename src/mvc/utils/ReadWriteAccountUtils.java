package mvc.utils;

import case_study.utils.ReadWriteFIleUtils;
import mvc.model.BankAccount;
import mvc.model.PaymentAccount;
import mvc.model.SavingAccount;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteAccountUtils {
    public static List<BankAccount> readCustomerFile(String path) {
        List<BankAccount> bankAccountList = new LinkedList<>();

        List<String> stringList = ReadWriteFileUtils.readFile(path);
        String[] info;

        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 6) {
                bankAccountList.add(new PaymentAccount(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4], Integer.parseInt(info[5])));
            } else if (info.length == 8) {
                bankAccountList.add(new SavingAccount(Integer.parseInt(info[0]), info[1], info[2], info[3], Integer.parseInt(info[4]), info[5], Integer.parseInt(info[6]), info[7]));

            }
        }
        return bankAccountList;
    }

    public static void writeCustomerFile(String path, List<BankAccount> bankAccountList) {
        StringBuilder data = new StringBuilder();
        for (BankAccount bankAccount : bankAccountList) {
            data.append(bankAccount.getInfo()).append("\n");
        }
        try {
            ReadWriteFIleUtils.writeFile(path, data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
