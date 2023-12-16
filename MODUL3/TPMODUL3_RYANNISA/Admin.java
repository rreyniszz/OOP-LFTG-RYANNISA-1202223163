class Admin extends User {
    public Admin(String name, int id) {
        super(name, id);
    }

    public void manageSystem(String course) {
        // Implementation for managing system
    }

    @Override
    public String getUserDetails() {
        return "Admin - Name: " + name + ", ID: " + id;
    }
}