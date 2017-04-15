import { Component, OnInit } from '@angular/core';
import { Recipe } from './model/Recipe/Recipe';
import { RecipesService } from './services/Recipes/recipes.service'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [RecipesService]
})
export class AppComponent {
  recipes: Recipe[];

  constructor(private recipeService: RecipesService) {

  }

  ngOnInit() {
    this.getRecipes();
  }

  getRecipes() {
    this.recipeService.findAllRecipes().then(
      recipes => this.recipes = recipes
    );
  }
}
