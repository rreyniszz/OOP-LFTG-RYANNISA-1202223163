class Kendaraan {
    private String nomorIdentifikasi;
    private double kecepatanMaksimum;
    private int kapasitasPenumpang;

    public Kendaraan(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang) {
        this.nomorIdentifikasi = nomorIdentifikasi;
        this.kecepatanMaksimum = kecepatanMaksimum;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String toString() {
        return "Nomor Identifikasi: " + nomorIdentifikasi +
                "\nKecepatan Maksimum: " + kecepatanMaksimum + " km/jam" +
                "\nKapasitas Penumpang: " + kapasitasPenumpang + " orang";

    }

    public double hitungWaktuTempuh(double jarak) {
        return jarak / kecepatanMaksimum;
    }
}