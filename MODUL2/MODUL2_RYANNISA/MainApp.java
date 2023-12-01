public class MainApp {
    public static void main(String[] args) {

        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi ekspedisi = new Ekspedisi(5, "Bandung", 5000);
        ekspedisi.information();
        // TO DO: Create teluexpress Object from TelUExpress Class
        TelUExpress teluexpress = new TelUExpress(30, "Sukapura", 15000, true);
        teluexpress.information();
        teluexpress.ambil("Sukabirus");
        teluexpress.antar(1982753);
        teluexpress.antar(12765483, 7899263);
        System.out.println();
        // TO DO: Create friexpress Object from FRIExpress Class
        FRIExpress friExpress = new FRIExpress(20, "Sukabirus", 20000, false);
        friExpress.information();
        friExpress.terima(42);
        friExpress.kirim("Bojongsoang");
        friExpress.kirim("Ciganitri", "PBB");
        System.out.println();
    }
}
