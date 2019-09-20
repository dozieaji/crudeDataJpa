package com.exercise.crudProject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.exercise.crudProject.model.Stock;

@RepositoryRestResource(collectionResourceRel="stock",path="stock")
public interface StockRepo extends JpaRepository<Stock, Integer> {


}
