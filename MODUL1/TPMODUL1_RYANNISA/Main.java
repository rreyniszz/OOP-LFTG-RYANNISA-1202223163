import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu Bank EAD:");
            System.out.println("1. Membuat Akun Baru");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Informasi Akun");
            System.out.println("5. Hapus Akun");
            System.out.println("6. List Keseluruhan Akun");
            System.out.println("7. Keluar");
            System.out.print("Masukkan Pilihanmu: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount(bank);
                    break;
                case 2:
                    bank.deposit();
                    break;
                case 3:
                    bank.withdraw();
                    break;
                case 4:
                    bank.getAccountInfo();
                    break;
                case 5:
                    bank.removeAccount();
                    break;
                case 6:
                    bank.getAllAccounts();
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    break;
            }
        } while (choice != 7);

        scanner.close();
    }

    private static void createAccount(Bank bank) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan Nomor Akun: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Masukkan Jumlah Saldo: ");
        double balance = scanner.nextDouble();

        Account account = new Account(name, accountNumber, balance);
        bank.addAccount(account);
    }
}
