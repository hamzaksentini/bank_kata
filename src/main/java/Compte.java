
import java.util.Date;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Compte {

    private int balance = 0;
    private int amount ;

    public Compte(){
        this.balance = 0;
    }

    public int returnBalance(){
        return (balance);
    }

    public int deposit(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the amount of money to add");
        amount = reader.nextInt();
        balance = balance + amount ;
        reader.close();
        return balance ;
    }

    public int withdraw(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the amount of money to add");
        amount = reader.nextInt();
        balance = balance - amount ;
        reader.close();
        return balance ;
    }
    public static boolean isToday(Date date) {
        Date now = new Date();
        boolean result = true;
        result &= date.getDate() == now.getDate();
        return result;
    }



}
