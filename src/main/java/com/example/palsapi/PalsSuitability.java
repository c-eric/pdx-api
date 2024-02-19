package com.example.palsapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PalsSuitability {
    private String type;
    private String image;
    private Integer level;
}
