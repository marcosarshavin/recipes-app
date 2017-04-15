import { Injectable } from '@angular/core';

@Injectable()
export class RecipesService {

  recipesURL = "http://127.0.0.1:8080/recipes-web/recipes/findAll"

  constructor() { }

  findAllRecipes()  {
    //Not yet implemented
  }
}
