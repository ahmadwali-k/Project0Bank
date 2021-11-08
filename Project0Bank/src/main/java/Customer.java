public class Customer {

    private String name;
    private int id;
    private String status;
    private int password;

    public Customer() {

    }
    public Customer(String name, int password) {
        this.name = name;
        this.password = password;
    }
    public Customer(String name, int id, int password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public int getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setPassword(int password) {
        this.password = password;
    }



    @Override
    public String toString() {

        return "Customer ==> |" +
                "Name = " + name + '\'' +
                "| |ID = '" + id + '\'' +
                "| |status = '" + status + '\'' +
                "| |password = '" + "****" + '\'' +
                '|' + "\n";

    }
}
