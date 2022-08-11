
import java.util.Date;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Compte {

    private double balance = 0;
    private int amount ;

    public Compte(){
        this.balance = 0;
    }

    public double getBalance(){
        return (balance);
    }

    public double deposit(double amount){
        balance = balance + amount ;
        return balance ;
    }




}
