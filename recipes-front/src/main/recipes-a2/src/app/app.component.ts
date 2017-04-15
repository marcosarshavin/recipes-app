import { Component, OnInit } from '@angular/core';
import { Receta } from './model/Receta';
import { RecipesService } from './services/recipes.service'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [RecipesService]
})
export class AppComponent {
  recetas: Receta[];

  constructor(private recipeService: RecipesService) {

  }

  ngOnInit() {
    this.getRecipes();
  }

  getRecipes() {
    this.recipeService.findAllRecipes().then(
      recetas => this.recetas = recetas
    );
  }
}
