public class Cashier extends Bioskop {

    public void printTicket(User user) {
        boolean isbooked = false;
        for(int i = 0; i<super.seats.length; i++) {
            for(int j = 0; j <super.seats[i].length; j++) {
                if (!(i==0 && j== 2)|| (i==2 && j==6)|| (i==4 && j==8)){
                if(super.seats[i][j]==1){
                    isbooked == true;
                    System.out.println("Mencetak Tiket...");
                    System.out.println("====================");
                    System.out.println("Nama :"+user.getName());
                    System.out.println("Phone :"+user.getPhone());
                    System.out.println("Seats :"+ (i+1) +","+(j+1));
                    System.out.println("Selamat Menonton");
                    System.out.println("====================");
                } else {
                    System.out.println("Anda Belum Memesan Tiket");
                }
                }
            }

}
}
}