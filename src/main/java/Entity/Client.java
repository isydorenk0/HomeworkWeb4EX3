package Entity;

public class Client {
    private long id;
    private String name;
    private int age;
    private String phoneNo;

    public Client(long id, String name, int age, String phoneNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
