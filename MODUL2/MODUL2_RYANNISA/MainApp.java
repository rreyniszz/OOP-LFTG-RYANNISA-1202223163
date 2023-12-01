public class MainApp {
    public static void main(String[] args) {

        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi ekspedisi = new Ekspedisi();
        ekspedisi.information();
        // TO DO: Create teluexpress Object from TelUExpress Class
        TelUExpress teluexpress = new TelUExpress(20, "Sukabirus", 10000);
        teluexpress.ambil("Sukabirus");
        teluexpress.antar(1982753);
        teluexpress.antar(12765483, 7899263);
        // TO DO: Create friexpress Object from FRIExpress Class
        FRIExpress friExpress = new FRIExpress(30, "Sukapura", 15000);
        friExpress.terima(40);
        friExpress.kirim("Sukapura");
        friExpress.kirim("Bojongsoang", "Ciganitri");
    }
}
