import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { RegistrationComponent } from './components/registration/registration.component';


const routes: Routes = [
  {path: "login"  , component: LoginComponent},
  {path: "registration",component :RegistrationComponent},
  {path: ''  , component: LoginComponent}

];

@NgModule({
  // forRoot(routes) -->  the name of above array
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
