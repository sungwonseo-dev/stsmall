package stsmall.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "customer", url = "${api.url.customer}")
public interface GetPhoneNumberService {
    @GetMapping(path = "/getPhoneNumbers")
    public List<GetPhoneNumber> getGetPhoneNumber();

    @GetMapping(path = "/getPhoneNumbers/{id}")
    public GetPhoneNumber getGetPhoneNumber(@PathVariable("id") Long id);
}
