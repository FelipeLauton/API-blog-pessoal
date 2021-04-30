package generation.org.blogPessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import generation.org.blogPessoal.model.ContatoModel; 


public interface ContatoRepository extends JpaRepository<ContatoModel, Long> { }

