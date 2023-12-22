import java.util.Scanner;

public class Bioskop {
    private int rows = 5;
    private int seatsPerRow = 10;
    public int[][] seats = new int[rows][seatsPerRow];

    public Bioskop() {
        seats[0][2] = 1;
        seats[1][5] = 1;
        seats[3][7] = 1;
    }

    public void displaySeating() {
        System.out.println("Booking Tiket Bioskop : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void bookSeat(int row, int seat) {
        seats[row][seat] = 1;
        System.out.println("Kursi berhasil dipesan " + (row + 1) + "," + (seat + 1));
    }
}