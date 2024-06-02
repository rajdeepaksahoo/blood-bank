import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PagesRoutingModule } from './pages-routing.module';
import { PagesComponent } from './pages.component';
import { DonoarRegistrationComponent } from './donoar-registration/donoar-registration.component';
import { MaterialInputsModule } from 'src/app/material-inputs/material-inputs.module';


@NgModule({
  declarations: [
    PagesComponent,
    DonoarRegistrationComponent
  ],
  imports: [
    CommonModule,
    PagesRoutingModule,
    MaterialInputsModule
  ]
})
export class PagesModule { }
