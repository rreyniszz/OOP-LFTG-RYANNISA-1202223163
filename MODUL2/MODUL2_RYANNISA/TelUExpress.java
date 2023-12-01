public class TelUExpress extends Ekspedisi {
    // TO DO: Create Protected Atribute of TelUExpress(antarInter)
    protected boolean antarInter;

    // TO DO: Create Constructor of TelUExpress
    public TelUExpress(int jumlahCabang, String pusat, float tarif) {
        super(jumlahCabang, pusat, tarif);
        this.antarInter = antarInter;
    }

    // TO DO: Create 'informasi' Method to show Information
    public void information() {
        if (antarInter == true) {
            System.out.println("Ekspedisi TelUExpress dengan " + jumlahCabang + " dan berpusat di " + pusat
                    + "mempunyai tarif sebesar" + tarif
                    + "perkilometer.selain itu ekspedisi ini melayani pengantaran internasional");
        } else {
            System.out.println("Ekspedisi TelUExpress dengan " + jumlahCabang + " dan berpusat di " + pusat
                    + "mempunyai tarif sebesar" + tarif
                    + "perkilometer. Selain itu ekspedisi ini tidak melayani pengantaran internasional");
        }
    }

    // TO DO: Create 'ambil' Method to pick up a package
    public void ambil(String tempat) {
        System.out.println("TelUExpress berhasil mengambil paket di " + tempat);
    }

    // TO DO: Create 'antar' Method to send a package
    public void antar(int resi) {
        System.out.println("TelUExpress berhasil mengantar paket dengan " + resi);
    }

    // TO DO: Create 'antar' Method to send two packages
    public void antar(int resi_1, int resi_2) {
        System.out.println("TelUExpress berhasil mengantar paket dengan " + resi_1 + resi_2);
    }
}
