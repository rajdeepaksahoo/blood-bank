import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PagesComponent } from './pages.component';
import { DonoarRegistrationComponent } from './donoar-registration/donoar-registration.component';

const routes: Routes = [
  { path: '', component: PagesComponent ,
    children:[
      {path:'donar-registration',component:DonoarRegistrationComponent}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PagesRoutingModule { }
