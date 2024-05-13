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

    // https://www.mongodb.com/docs/manual/tutorial/query-arrays/
    // https://www.mongodb.com/docs/manual/reference/operator/query/elemMatch/#mongodb-query-op.-elemMatch
    // @Query("{ types: { $elemMatch: { 'name': { $regex: ?0 } }, $elemMatch: { 'name': { $regex: ?1 } } } }")
    @Query("{ $and: [{ 'types.name': { $regex: ?0 } }, { 'types.name': { $regex: ?1 } }] }")
    List<Pals> findPalsByTypesName(String typeName1, String typeName2);

    List<Pals> findPalsBySuitabilityType(String suitabilityName);
}
