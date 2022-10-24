package examplecapstone.infra;

import examplecapstone.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="orderInfos", path="orderInfos")
public interface OrderInfoRepository extends PagingAndSortingRepository<OrderInfo, Long> {

    

    
}
