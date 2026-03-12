class Student {

    int id;
    String name;
    double cgpa;

    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getCgpa() {
        return cgpa;
    }
}

class Account {

    int accountNumber;
    String accountHolderName;
    double balance;

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    String getAccountHolderName() {
        return accountHolderName;
    }

    double getBalance() {
        return balance;
    }

    void showDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {

    public static void main(String[] args) {

        // Student Object
        Student s = new Student();
        s.setId(1012);
        s.setName("Tanjum");
        s.setCgpa(3.80);

        System.out.println("Student Information");
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("CGPA: " + s.getCgpa());

        System.out.println("--------------------");

        // Account Object
        Account a = new Account();
        a.setAccountNumber(5001);
        a.setAccountHolderName("Tanjum Sarkar");
        a.setBalance(15000);

        System.out.println("Account Information");
        a.showDetails();
    }
}