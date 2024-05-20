package africa.semicolon.Chapter15.classWork;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {

    private int id;
    private String name;
    private BigDecimal amount;
    private Type type;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    private String accountNumber;

    public Transaction(String amount,String accountNumber){
        this.accountNumber = accountNumber;
        this.amount = new BigDecimal(amount);
    }
    private String date = String.valueOf(LocalDate.now());


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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", type=" + type +
                ", accountNumber='" + accountNumber + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public void readTransactionFile() {
        String location = "C:\\Users\\User\\Desktop\\Trasaction";
        try (PrintStream stream = new PrintStream(location)){
            System.out.println(stream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
