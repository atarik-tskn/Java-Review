package org.cydeo.Task;

import lombok.*;

//@Getter
//@Setter
//@ToString
@Builder
@Data
public class Orange {

    private int weight;
    private color color;

}


//@Builder generates an @AllArgsConstructor unless there is another @XConstructor
