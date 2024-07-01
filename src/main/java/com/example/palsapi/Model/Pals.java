package com.example.palsapi.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.util.Map;

@Document(collection = "pals")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pals {
    @Id
    private ObjectId id;
    @Field("id")
    private Integer palId;
    private String key;
    private String image;
    private String name;
    private String wiki;
    private List<PalsType> types;
    private String imageWiki;
    private List<PalsSuitability> suitability;
    private List<String> drops;
    private Map<String, Object> aura;
    private List<Map<String, String>> skills;
}
