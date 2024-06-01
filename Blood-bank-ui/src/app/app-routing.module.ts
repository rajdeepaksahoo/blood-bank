import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [


  { path: 'pages', loadChildren: () => import('./pages/pages/pages.module').then(m => m.PagesModule) },
  { path: '', loadChildren: () => import('./core/core.module').then(m => m.CoreModule) }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
