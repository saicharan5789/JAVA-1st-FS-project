package dev.charan.app;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppRepository extends MongoRepository<AppItem, Integer> {


    List<AppItem> findAll();





}
