package stsmall.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import stsmall.config.kafka.KafkaProcessor;
import stsmall.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    PointRepository pointRepository;

    @Autowired
    Repository Repository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderConfirmed'"
    )
    public void wheneverOrderConfirmed_AddPoint(
        @Payload OrderConfirmed orderConfirmed
    ) {
        OrderConfirmed event = orderConfirmed;
        System.out.println(
            "\n\n##### listener AddPoint : " + orderConfirmed + "\n\n"
        );

        // Sample Logic //
        Point.addPoint(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
