package Tasks.Trader;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Transaction {
    private Trader trader;
    private int year;
    private int value;

}
