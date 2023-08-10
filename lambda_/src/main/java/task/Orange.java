package task;

import lombok.*;

//@Getter
//@Setter
//@ToString

@Builder  //generates an @AllArgsConstructor unless there is another @XConstructor
@Data

public class Orange {

    private int weight;
    private Color color;
}
