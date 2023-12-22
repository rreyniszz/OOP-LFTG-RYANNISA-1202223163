public class User {
   private String nama;
   private String phoneNumber;

   public User(String nama, String phoneNumber) {
      this.nama = nama;
      this.phoneNumber = phoneNumber;

   }

   // TO DO: Create register Method to show information about name and phone number
   public void register() {
      System.out.println("Name: " + nama);
      System.out.println("Phone Number: " + phoneNumber);
   }
   // TO DO: Create method to return name and phone number

   public String getName() {
      return nama;
   }

   public String getnoHandPhone() {
      return phoneNumber;
   }
}
