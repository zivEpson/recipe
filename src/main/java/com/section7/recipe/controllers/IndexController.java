package com.section7.recipe.controllers;

import com.section7.recipe.model.Category;
import com.section7.recipe.model.UnitOfMeasure;
import com.section7.recipe.repositories.CategoryRepository;
import com.section7.recipe.repositories.UnitOfMeasureRepository;
import com.section7.recipe.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    /*when we go to one of the urls*/
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting index page");

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
