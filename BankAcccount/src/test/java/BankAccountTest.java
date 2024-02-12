import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("Tim", "Smith", "6-12-2002", 12345678, 100.00);
    }
//Testing Getters and Setters

    @Test
    public void hasFirstName(){
        assertThat(bankAccount.getFirstName()).isEqualTo("Tim");
    }

    @Test
    public void canSetFirstName(){
        bankAccount.setFirstName("Toby");
        assertThat(bankAccount.getFirstName()).isEqualTo("Toby");
    }

    @Test
    public void hasLastName(){
        assertThat(bankAccount.getLastName()).isEqualTo("Smith");
    }

    @Test
    public void canSetLastName(){
        bankAccount.setLastName("Adams");
        assertThat(bankAccount.getLastName()).isEqualTo("Adams");
    }

    @Test
    public void hasDateOfBirth(){
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("6-12-2002");
    }

    @Test
    public void canSetDateOfBirth(){
        bankAccount.setDateOfBirth("20-11-2005");
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("20-11-2005");
    }

    @Test
    public void hasAccountNumber(){
        assertThat(bankAccount.getAccountNumber()).isEqualTo(12345678);
    }

    @Test
    public void canSetAccountNumber(){
        bankAccount.setAccountNumber(87654321);
        assertThat(bankAccount.getAccountNumber()).isEqualTo(87654321);
    }

    @Test
    public void canGetBalance(){
        assertThat(bankAccount.getBalance()).isEqualTo(100);
    }

    @Test
    public void canSetBalance(){
        bankAccount.setBalance(200);
        assertThat(bankAccount.getBalance()).isEqualTo(200);
    }
//Testing Methods

    @Test
    public void canDepositFunds() {
        bankAccount.deposit(30);
        assertThat(bankAccount.getBalance()).isEqualTo(130);

    }

    @Test
    public void canWithdrawFunds(){
        bankAccount.withdrawal(10);
        assertThat(bankAccount.getBalance()).isEqualTo(90);
    }

    @Test
    public void canPayInterest(){
        bankAccount.payInterest(2);
        assertThat(bankAccount.getBalance()).isEqualTo(102);
    }



}
