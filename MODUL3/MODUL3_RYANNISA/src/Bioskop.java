public class Bioskop {
    private int rows;
    private int seatsPerRow;
    int[][] seats = new int[rows][seatsPerRow];

    public Bioskop() {
        seats[1][3] = 1;
        seats[2][6] = 1;
        seats[4][8] = 1;
    }

    public void displaySeating() {
        System.out.println("Booking Tiket Bioskop : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<seatsPerRow; j++){
                System.out.println(seats[i][j]);
        }
    }

    public void bookSeat(int row, int seat){
        if (seats[row][seat] == 0) {
            seats[row][seat] = 1;
            System.out.println("Kursi Berhasil di Update");
        } else {
            System.out.println("Error, Silahkan coba lagi");
        }
    }
}
}