public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create
    // Setter method for each attribute
    private String Name;
    private int Phone_Number;

    public void setName(String name) {
        this.Name = name;
    }

    public void setPhone_Number(int phone_Number) {
        this.Phone_Number = phone_Number;
    }

    public void regist() {
        System.out.println(Name + Phone_Number);
        System.out.println("Registrasi Berhasil Dilakukan");

    }

    // TODO: Create Method to Register User and Display User's Name and Phone Number
    // and success message

}
