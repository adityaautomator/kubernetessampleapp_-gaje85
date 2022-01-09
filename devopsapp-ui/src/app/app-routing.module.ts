import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './auth.guard';
import { LoginComponent } from './auth/login/login.component';
import { RegisterComponent } from './auth/register/register.component';
import { CreateSiteComponent } from './create-site/create-site.component';
import { HomeComponent } from './home/home.component';
import { ListSitesComponent } from './list-sites/list-sites.component';
import { PricingComponent } from './pricing/pricing.component';
import { ViewSiteComponent } from './view-site/view-site.component';

const routes: Routes = [
  {path:'home', component: HomeComponent},
  {path:'login', component: LoginComponent},
  {path:'register', component: RegisterComponent},
  {path:'sites', component: ListSitesComponent, canActivate:[AuthGuard]},
  {path:'pricing', component: PricingComponent},
  {path:'sites/new', component: CreateSiteComponent},
  {path:'sites/:id', component: ViewSiteComponent},
  {path:'', redirectTo:'home', pathMatch:'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
