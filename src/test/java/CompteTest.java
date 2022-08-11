import org.assertj.core.api.Assertions;
import org.junit.Test;


public class CompteTest{

    @Test
    public void should_balance_starts_0(){
        //Given
        Compte compte = new Compte();
        //When
        double balance = compte.getBalance();
        //Then
        Assertions.assertThat(balance).isEqualTo(0);
    }

    @Test
    public void should_deposit_amount(){
        //Given
        Compte compte = new Compte();
        //When
        compte.deposit(50d);
        //Then
        double balance = compte.getBalance();
        Assertions.assertThat(balance).isEqualTo(50);
    }

}