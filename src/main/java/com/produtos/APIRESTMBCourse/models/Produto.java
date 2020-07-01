package com.produtos.APIRESTMBCourse.models;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity /*mapeando a classe como uma tabela do banco de dados*/
@Table(name="TB_PRODUTO") /*nomeando a tabela*/
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id /*informa que a variável é um Id*/
    @GeneratedValue(strategy = GenerationType.AUTO) /*o banco de dados vai gerar automaticamente o id*/
    private long id;

    private String nome;
    private BigDecimal quantidade;
    private BigDecimal valor;

    public long getId()                 { return id; }
    public String getNome()             { return nome; }
    public BigDecimal getQuantidade()   { return quantidade; }
    public BigDecimal getValor()        { return valor; }

    public void setId(long id)                          { this.id = id; }
    public void setNome(String nome)                    { this.nome = nome; }
    public void setQuantidade(BigDecimal quantidade)    { this.quantidade = quantidade; }
    public void setValor(BigDecimal valor)              { this.valor = valor; }
}
