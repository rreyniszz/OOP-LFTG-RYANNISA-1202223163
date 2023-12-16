class Teacher extends User {
    public Teacher(String name, int id) {
        super(name, id);
    }

    public void teachClass(String course) {
        // Implementation for teaching class
    }

    @Override
    public String getUserDetails() {
        return "Teacher - Name: " + name + ", ID: " + id;
    }
}