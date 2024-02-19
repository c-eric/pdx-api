package com.example.palsapi;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

// Repository Pattern
// - Abstract the data access layer
// - Separates the logic that retrieves data from MongoDB
@Repository
public interface PalsRepository extends MongoRepository<Pals, ObjectId> {
    // https://www.baeldung.com/queries-in-spring-data-mongodb
    // https://javatechonline.com/spring-boot-mongodb-query-examples/
    @Query("{ name: { $regex: ?0, $options: 'i' } }")
    List<Pals> findPalsByName(String name);

    List<Pals> findPalsByTypesName(String typeName);

    List<Pals> findPalsBySuitabilityType(String suitabilityName);
}
