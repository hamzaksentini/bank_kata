import junit.framework.TestCase;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static java.util.function.Predicate.isEqual;


public class CompteTest{

    @Test
    public void should_balance_starts_0(){
        //Given
        Compte compte = new Compte();
        //When
        int balance = compte.returnBalance();
        //Then
        Assertions.assertThat(balance).isEqualTo(0);
    }


}