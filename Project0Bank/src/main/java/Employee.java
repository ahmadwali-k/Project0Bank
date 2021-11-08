
public class Employee {
    private int id;
    private String name;
    private String email;

    public Employee(String name, String email, int id){
        this.name = name;
        this.email = email;
        this.id = id;
    }
    public Employee() {}

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {

        return "Employee ==> |" +
                "Name = " + name + '\'' +
                "| |ID = '" + id + '\'' +
                "| |Email = '" + email + '\'' +
                '|' ;
    }
}