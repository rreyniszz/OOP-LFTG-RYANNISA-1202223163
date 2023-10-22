import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Akun Telah Ditambahkan : " + account.getAccountInfo());
    }

    public void removeAccount() {
        System.out.print("Masukkan Nomor Akun Yang Akan Dihapuskan : ");
        String accountNumber = scanner.next();

        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(account);
                System.out.println("Akun Telah Terhapus : " + account.getAccountInfo());
                return;
            }
        }
        System.out.println("Akun Bank Dengan Nomor Akun " + accountNumber + " Tidak Ditemukan.");
    }

    public void deposit() {
        System.out.print("Masukkan Nomor Akun Untuk Setor Saldo : ");
        String accountNumber = scanner.next();
        Account account = getAccount(accountNumber);

        if (account != null) {
            System.out.print("Masukkan Jumlah Yang Akan Disetorkan : ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
        }
    }

    public void withdraw() {
        System.out.print("Masukkan Nomor Akun Untuk Tarik Saldo : ");
        String accountNumber = scanner.next();
        Account account = getAccount(accountNumber);

        if (account != null) {
            System.out.print("Masukkan Jumlah Yang Akan Ditarik Saldo: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        }
    }

    public void getAccountInfo() {
        System.out.print("Masukkan Nomor Akun Untuk Mendapatkan Informasi : ");
        String accountNumber = scanner.next();
        Account account = getAccount(accountNumber);

        if (account != null) {
            System.out.println(account.getAccountInfo());
        }
    }

    public void getAllAccounts() {
        System.out.println("List Keseluruhan Akun:");
        for (Account account : accounts) {
            System.out.println(account.getAccountInfo());
        }
    }

    private Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        System.out.println("Akun Bank Dengan Nomor Akun " + accountNumber + " Tidak Ditemukan.");
        return null;
    }

}
