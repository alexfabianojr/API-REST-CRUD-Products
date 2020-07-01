package com.produtos.APIRESTMBCourse.repository;

import com.produtos.APIRESTMBCourse.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findById(long id);

}

/*O JpaRepository já possui vários métodos prontos para fazer persistências no banco de dados
* Como save,delete, etc...*/