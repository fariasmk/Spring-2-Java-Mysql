package com.maikon.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.maikon.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

}
