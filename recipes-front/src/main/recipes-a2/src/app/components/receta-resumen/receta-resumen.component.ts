import { Component, OnInit, Input  } from '@angular/core';
import { Recipe } from '../../model/Recipe/Recipe';

@Component({
  selector: 'app-receta-resumen',
  templateUrl: './receta-resumen.component.html',
  styleUrls: ['./receta-resumen.component.css']
})
export class RecetaResumenComponent implements OnInit {

  @Input() recipe: Recipe;

  constructor() { }

  ngOnInit() {
  }

}
