package com.example.demo.web;

import com.example.demo.Ingredient;
import com.example.demo.data.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
    private IngredientRepository ingredientRepo;

    @PostConstruct
    public void s(){
        System.out.println("XXXXXXXXXXXXXXXXXX");
    }
    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepo){
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Ingredient convert(String id){
        return ingredientRepo.findById(id);
    }
}
