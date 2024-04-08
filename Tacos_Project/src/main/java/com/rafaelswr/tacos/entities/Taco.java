package com.rafaelswr.tacos.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.charset.CodingErrorAction;
import java.util.List;

@Data
public class Taco {

    private String name;
    private List<Ingredient> ingredientsList;

}
