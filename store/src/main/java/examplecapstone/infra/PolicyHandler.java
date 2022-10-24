package examplecapstone.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import examplecapstone.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import examplecapstone.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired StoreRepository storeRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PaymentApproved'")
    public void wheneverPaymentApproved_UpdateOrderList(@Payload PaymentApproved paymentApproved){

        PaymentApproved event = paymentApproved;
        System.out.println("\n\n##### listener UpdateOrderList : " + paymentApproved + "\n\n");


        

        // Sample Logic //
        Store.updateOrderList(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Ordered'")
    public void wheneverOrdered_UpdateOrderList(@Payload Ordered ordered){

        Ordered event = ordered;
        System.out.println("\n\n##### listener UpdateOrderList : " + ordered + "\n\n");


        

        // Sample Logic //
        Store.updateOrderList(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PaymentCnaceled'")
    public void wheneverPaymentCnaceled_CancelDelivery(@Payload PaymentCnaceled paymentCnaceled){

        PaymentCnaceled event = paymentCnaceled;
        System.out.println("\n\n##### listener CancelDelivery : " + paymentCnaceled + "\n\n");


        

        // Sample Logic //
        Store.cancelDelivery(event);
        

        

    }

}


