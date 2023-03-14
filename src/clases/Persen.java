package clases;

public class Persen {
    private String name;
    private long id;
    private String password;
    private int age;
    private BankAccount bankAccount;

    public Persen(String name, long id, String password, int age, BankAccount bankAccount) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Client- " +
                "\n name='" + name +
                "\n id: " + id +
                "\n password: " + password +
                "\n age: " + age +
                "\n bankAccount: " + bankAccount ;
    }
}
