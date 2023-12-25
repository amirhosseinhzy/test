package com.cando.uni.repository;

import com.cando.uni.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "person",path = "person")
public interface RestPersonRepository extends JpaRepository<Person,Long> {


}
