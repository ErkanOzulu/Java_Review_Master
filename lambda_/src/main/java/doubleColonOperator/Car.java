package doubleColonOperator;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {

    private String make;
    private int model;

    public Car() {
    }

    public Car(String make) {
        this.make = make;
    }
    public Car(int model) {
        this.model =model;
    }
    public Car(String make, int model) {
        this.make = make;
        this.model = model;
    }
}
