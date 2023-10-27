import java.util.List;
import java.util.ArrayList;

public class Database {

    // TODO: Create List of Konser Object to Store Konser from Konser Class
    List<Konser> listKonser = new ArrayList<>();

    // TODO: Create Method to insert Konser to Database
    public void insertKonser(Konser konser) {
        ListKonser.add(konser);
    }

    // TODO: Create Method to Show Konser from Database
    public void showKonser(Konser konser) {
        System.out.println("Daftar Acara Konser yang Tersedia :");
        System.out.println("1. Noah");
        System.out.println("Tanggal Konser : 15-11-2023");
        System.out.println("Lokasi = Sukabirus");
        System.out.println("Harga Tiket = 50000.0");
        System.out.println("2. Sheila no 7");
        System.out.println("Tanggal Konser = 16-11-2023");
        System.out.println("Lokasi = Sukapura");
        System.out.println("Harga Tiket = 70000.0");
    }

    // TODO: Create Method to Buy Ticket and Show the Total Price
    public void buyTicket(Konser konser) {

    }

}
