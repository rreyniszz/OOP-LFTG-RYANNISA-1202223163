public class Cashier extends Bioskop {

    public void printTicket(User user) {
        boolean isbooked = false;
        try {
            System.out.println("Mencetak Tiket...");
            for (int i = 0; i < super.seats.length; i++) {
                for (int j = 0; j < super.seats[i].length; j++) {
                    if (!((i == 0 && j == 2) || (i == 1 && j == 5) || (i == 3 && j == 7))) {
                        if (super.seats[i][j] == 1) {
                            isbooked = true;
                            System.out.println("====================");
                            System.out.println("Nama :" + user.getName());
                            System.out.println("Phone :" + user.getnoHandPhone());
                            System.out.println("Seats :" + j + "," + i);
                            System.out.println("Selamat Menonton");
                            System.out.println();
                        }
                    }
                }
            }
            if (!isbooked) {
                throw new Exception("Anda Belum Memesan Tiket");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}