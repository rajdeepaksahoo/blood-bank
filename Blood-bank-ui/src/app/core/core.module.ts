import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CoreRoutingModule } from './core-routing.module';
import { CoreComponent } from './core.component';
import { HeaderComponent } from './header/header.component';
import { LandingpageComponent } from './landingpage/landingpage.component';
import { FooterComponent } from './footer/footer.component';
import { MaterialInputsModule } from '../material-inputs/material-inputs.module';


@NgModule({
  declarations: [
    CoreComponent,
    HeaderComponent,
    LandingpageComponent,
    FooterComponent
  ],
  imports: [
    CommonModule,
    CoreRoutingModule,
    MaterialInputsModule
  ]
})
export class CoreModule { }
