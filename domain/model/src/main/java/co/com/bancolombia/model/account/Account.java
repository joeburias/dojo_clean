package co.com.bancolombia.model.account;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Account {
    private int accountNumber;
    private int accountType;
}
