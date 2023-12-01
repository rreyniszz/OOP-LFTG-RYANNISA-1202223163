public class Ekspedisi {
    // TO DO: Create Protected Attributes of Ekspedisi (jumlahCabang, pusat, tarif)
    protected int jumlahCabang;
    protected String pusat;
    protected float tarif;

    // TO DO: Create Constructor of Ekspedisi
    public Ekspedisi(int jumlahCabang, String pusat, float tarif) {
        this.jumlahCabang = jumlahCabang;
        this.pusat = pusat;
        this.tarif = tarif;
    }

    // TO DO: Create 'informasi' Method to show Information
    public void information() {
        System.out.println("Ekspedisi tidak diketahui dengan " + jumlahCabang + " dan berpusat di " + pusat
                + " mempunyai tarif sebesar" + tarif + "");
    }
}
