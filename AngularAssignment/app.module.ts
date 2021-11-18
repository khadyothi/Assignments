import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
//import { FormsModule } from "@angular/forms";

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
//import { CustomDirective} from './CustomDirective';
//import {ForExample } from './ForExample';
//import {Student} from './Student';
//import {Hero} from '../hero';
//import { ifExample } from './ifExample';
//import {Product} from './Product';
import {Listofproducts} from './Listofproducts'
//import {Productdetails} from './Productdetails';

@NgModule({
  declarations: [
    AppComponent,
    //  CustomDirective,
    //Product
    // Productdetails
    Listofproducts
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    //FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
