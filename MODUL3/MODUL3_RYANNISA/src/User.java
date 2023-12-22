public class User {
   private String nama;
   private long phoneNumber;

   public User(String nama, long phoneNumber) {
      this.nama = nama;
      this.phoneNumber = phoneNumber;

   }

   // TO DO: Create register Method to show information about name and phone number
   public void register() {
      System.out.println("Nama: " + nama);
      System.out.println("No Handphone: " + phoneNumber);
   }
   // TO DO: Create method to return name and phone number

   public String getName() {
      return nama;
   }

   public long getnoHandPhone() {
      return phoneNumber;
   }
}
