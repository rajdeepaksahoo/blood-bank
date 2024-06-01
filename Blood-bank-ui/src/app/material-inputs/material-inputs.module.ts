import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {MatIconModule} from '@angular/material/icon';

const materialInputs:any[]=[
  MatIconModule
]

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    materialInputs
  ],
  exports:[
    materialInputs
  ]
})
export class MaterialInputsModule { }
