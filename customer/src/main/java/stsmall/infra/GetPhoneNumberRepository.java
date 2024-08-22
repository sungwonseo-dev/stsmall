package stsmall.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stsmall.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "getPhoneNumbers",
    path = "getPhoneNumbers"
)
public interface GetPhoneNumberRepository
    extends PagingAndSortingRepository<GetPhoneNumber, Long> {}
