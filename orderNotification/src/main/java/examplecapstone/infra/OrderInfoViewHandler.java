package examplecapstone.infra;

import examplecapstone.domain.*;
import examplecapstone.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class OrderInfoViewHandler {


    @Autowired
    private OrderInfoRepository orderInfoRepository;




}

