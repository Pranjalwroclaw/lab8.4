package lab8t4;


public class Customer {
    
	int id;
    String name;
    String surname;
    double bankAccountBalance;
    
    public Customer(int id, String name, String surname, Double bankAccountBalance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.bankAccountBalance = bankAccountBalance;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getBankAccountBalance() {
        return bankAccountBalance;
    }

    public void setBankAccountBalance(double bankAccountBalance) {
        this.bankAccountBalance = bankAccountBalance;
    }
}