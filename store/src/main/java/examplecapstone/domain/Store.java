package examplecapstone.domain;

import examplecapstone.domain.DeliveryStarted;
import examplecapstone.domain.DeliveryCanceled;
import examplecapstone.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Store_table")
@Data

public class Store  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String customerAddr;
    
    
    
    
    
    private String productName;
    
    
    
    
    
    private String productPrice;
    
    
    
    
    
    private String orderStatus;

    @PostPersist
    public void onPostPersist(){


        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();



        DeliveryCanceled deliveryCanceled = new DeliveryCanceled(this);
        deliveryCanceled.publishAfterCommit();

    }

    public static StoreRepository repository(){
        StoreRepository storeRepository = StoreApplication.applicationContext.getBean(StoreRepository.class);
        return storeRepository;
    }




    public static void updateOrderList(PaymentApproved paymentApproved){

        /** Example 1:  new item 
        Store store = new Store();
        repository().save(store);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentApproved.get???()).ifPresent(store->{
            
            store // do something
            repository().save(store);


         });
        */

        
    }
    public static void updateOrderList(Ordered ordered){

        /** Example 1:  new item 
        Store store = new Store();
        repository().save(store);

        */

        /** Example 2:  finding and process
        
        repository().findById(ordered.get???()).ifPresent(store->{
            
            store // do something
            repository().save(store);


         });
        */

        
    }
    public static void cancelDelivery(PaymentCnaceled paymentCnaceled){

        /** Example 1:  new item 
        Store store = new Store();
        repository().save(store);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentCnaceled.get???()).ifPresent(store->{
            
            store // do something
            repository().save(store);


         });
        */

        
    }


}
