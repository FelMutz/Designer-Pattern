package designers.proxy.repository;

import designers.proxy.domain.PessoaDomain;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends MongoRepository<PessoaDomain,String> {
}
