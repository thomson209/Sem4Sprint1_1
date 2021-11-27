package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@RepositoryRestResource(collectionResourceRel = "members", path = "members")
public interface MemberRepository extends PagingAndSortingRepository<Member, Integer> {

    //List<Member> findByName(@Param("name") String name);

}
