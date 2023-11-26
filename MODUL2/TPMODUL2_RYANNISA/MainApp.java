import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Data Mobil");
        System.out.print("Nomor Identifikasi: ");
        String nomorMobil = scanner.next();
        System.out.print("Kecepatan Maksimum: ");
        double kecepatanMobil = scanner.nextDouble();
        System.out.print("Kapasitas Penumpang: ");
        int kapasitasMobil = scanner.nextInt();
        System.out.print("Jumlah Pintu: ");
        int pintuMobil = scanner.nextInt();

        Mobil mobil = new Mobil(nomorMobil, kecepatanMobil, kapasitasMobil, pintuMobil);
        System.out.println("\nData Bus");
        System.out.print("Nomor Identifikasi: ");
        String nomorBus = scanner.next();
        System.out.print("Kecepatan Maksimum: ");
        double kecepatanBus = scanner.nextDouble();
        System.out.print("Kapasitas Penumpang: ");
        int kapasitasBus = scanner.nextInt();
        System.out.print("Jumlah Kursi: ");
        int kursiBus = scanner.nextInt();

        Bus bus = new Bus(nomorBus, kecepatanBus, kapasitasBus, kursiBus);

        System.out.println("\nInformasi Mobil:");
        System.out.println(mobil.toString());
        System.out.println("\nWaktu tempuh dengan Mobil: " + mobil.hitungWaktuTempuh(300) + " Jam");

        System.out.println("\nInformasi Bus:");
        System.out.println(bus.toString());
        System.out.println("\nWaktu tempuh dengan Bus: " + bus.hitungWaktuTempuh(300) + " Jam");

        scanner.close();
    }
}
