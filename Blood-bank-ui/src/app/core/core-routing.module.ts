import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CoreComponent } from './core.component';
import { HeaderComponent } from './header/header.component';
import { LandingpageComponent } from './landingpage/landingpage.component';
import { FooterComponent } from './footer/footer.component';

const routes: Routes = [
  { path: '', component: CoreComponent,

    children:[
      {path:'',component:HeaderComponent},
      {path:'landing-page',component:LandingpageComponent},
      {path:'footer',component:FooterComponent}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CoreRoutingModule { }
