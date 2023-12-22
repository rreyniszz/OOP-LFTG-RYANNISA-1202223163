import java.util.Scanner;
import java.util.InputMismatchException;

public class MainApp {
    public static void main(String[] args) {
        // TO DO : Create a Scanner object to receive input from the user
        Scanner scanner = new Scanner(System.in);

        // TO DO : Create Bioskop and Cashier objects
        Bioskop bioskop = new Bioskop();
        Cashier cashier = new Cashier();
        User user = new User("Mike", 1);
        boolean order = false;

        try {
            String name = "";
            long number = 0;
            System.out.println("=====Silahkan Register=====");

            // TO DO : Take the name from the user, make sure it is not empty
            System.out.print("Masukkan Nama : ");
            name = scanner.nextLine();
            if (name == "") {
                throw new Exception("Nama tidak boleh kosong");
            }

            // TO DO : Take the phone number from the user, make sure it is valid
            System.out.print("Masukkan nomor telepon : ");
            try {
                number = scanner.nextInt();
                if (number < 0 || number > 1000000000) {
                    throw new Exception("Nomor telepon tidak valid");
                }
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Nomor telepon tidak valid");
            }

            user = new User(name, number);

            // TO DO : Create a code for ticket

            System.out.println("==========================");
            System.out.println("Register berhasil");
            user.register();
            System.out.println("Selamat datang di bioskop EAD!");

            bioskop.displaySeating();

            // TO DO : Call the method to reserve seats in the cinema
            while (true) {
                System.out.println("Apakah anda ingin memesan kursi? (y/n)");
                String choice = scanner.next();
                if (!choice.equals("y")) {
                    throw new Exception("");
                }

                System.out.println("Pilih baris kursi: ");
                int x, y;
                try {
                    x = scanner.nextInt();
                    if (x < 0 || x > 10) {
                        throw new Exception("Input angka harus di dalam range seat!");
                    }
                } catch (InputMismatchException e) {
                    throw new InputMismatchException("Input harus berupa angka!");
                }

                System.out.println("Pilih posisi kursi: ");
                try {
                    y = scanner.nextInt();
                    if (y < 0 || y > 10) {
                        throw new Exception("Input angka harus di dalam range seat!");
                    }
                } catch (InputMismatchException e) {
                    throw new InputMismatchException("Input harus berupa angka!");
                }
                if (bioskop.seats[x - 1][y - 1] == 1) {
                    throw new Exception("Error" + x + "," + y + " sudah dipesan");
                }
                bioskop.bookSeat(y - 1, x - 1);
            }

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // TO DO : Create a exception if user enter number is out of range
            System.out.println(e.getMessage());
        } finally {
            // TO DO : Close the Scanner object when the user is finished
            scanner.close();
        }
        cashier.printTicket(user);
    }
}