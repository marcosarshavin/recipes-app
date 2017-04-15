import { Component, OnInit, Input  } from '@angular/core';
import { Receta } from '../model/Receta';

@Component({
  selector: 'app-receta-resumen',
  templateUrl: './receta-resumen.component.html',
  styleUrls: ['./receta-resumen.component.css']
})
export class RecetaResumenComponent implements OnInit {

  @Input() receta: Receta;

  constructor() { }

  ngOnInit() {
  }

}
