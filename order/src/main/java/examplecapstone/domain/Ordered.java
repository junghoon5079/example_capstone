package examplecapstone.domain;

import examplecapstone.domain.*;
import examplecapstone.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private String customerId;
    private String customerAddr;
    private String productName;
    private String projectPrice;
    private String orderStatus;

    public Ordered(Order aggregate){
        super(aggregate);
    }
    public Ordered(){
        super();
    }
}
