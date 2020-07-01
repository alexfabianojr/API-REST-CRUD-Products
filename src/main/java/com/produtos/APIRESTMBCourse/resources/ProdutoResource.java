package com.produtos.APIRESTMBCourse.resources;

import com.produtos.APIRESTMBCourse.models.Produto;
import com.produtos.APIRESTMBCourse.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")/*URI padrão*/
@Api(value = "API REST Produtos") /*swagger*/
@CrossOrigin(origins = "*") /*qualquer dominio pode acessar a api*/
public class ProdutoResource {

    /*Ponto de injeção do repository no controller*/
    @Autowired
    ProdutoRepository produtoRepository;

    /*### Métodos getters/GET ao database ###*/

    @GetMapping("/produtos")/*URI*/
    @ApiOperation(value = "Retorna uma lista com todos os produtos do banco")
    public List<Produto> listaProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/produto/{id}")
    @ApiOperation(value = "Retorna um unico produto buscado no banco pelo id")
    public Produto listaProdutoUnico(@PathVariable(value = "id") long id) {
        return produtoRepository.findById(id);
    }

    /*### Métodos setters/POST ao database ###*/
    @PostMapping("/produto")    /*O produto em JSON vem no corpo da requisição http*/
    @ApiOperation(value = "Salva um novo produto no banco")
    public Produto salvaProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/produto")
    @ApiOperation(value = "Deleta um produto no banco")
    public void deletaProduto(@RequestBody Produto produto) {
        produtoRepository.delete(produto);
    }

    @PutMapping("/produto")
    @ApiOperation(value = "Atualiza um produto no banco")
    public Produto atualizaProduto(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

}

/* Links
* http://localhost:8080/api/produtos/
* http://localhost:8080/api/produto/{id}
*/