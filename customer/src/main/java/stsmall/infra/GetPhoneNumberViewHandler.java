package stsmall.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import stsmall.config.kafka.KafkaProcessor;
import stsmall.domain.*;

@Service
public class GetPhoneNumberViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private GetPhoneNumberRepository getPhoneNumberRepository;
    //>>> DDD / CQRS
}
