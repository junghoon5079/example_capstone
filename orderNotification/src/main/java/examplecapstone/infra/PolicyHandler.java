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
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryStarted'")
    public void wheneverDeliveryStarted_SendKakaotalk(@Payload DeliveryStarted deliveryStarted){

        DeliveryStarted event = deliveryStarted;
        System.out.println("\n\n##### listener SendKakaotalk : " + deliveryStarted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryCanceled'")
    public void wheneverDeliveryCanceled_SendKakaotalk(@Payload DeliveryCanceled deliveryCanceled){

        DeliveryCanceled event = deliveryCanceled;
        System.out.println("\n\n##### listener SendKakaotalk : " + deliveryCanceled + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PaymentApproved'")
    public void wheneverPaymentApproved_SendKakaotalk(@Payload PaymentApproved paymentApproved){

        PaymentApproved event = paymentApproved;
        System.out.println("\n\n##### listener SendKakaotalk : " + paymentApproved + "\n\n");


        

        // Sample Logic //

        

    }

}


