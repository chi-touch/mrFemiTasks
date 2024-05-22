package africa.semicolon.Chapter15.classWork;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_EMPTY)

public class Transaction {

    private int id;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using  = LocalDateDeserializer.class)
    private LocalDate date;
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

    public Transaction(){}

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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
