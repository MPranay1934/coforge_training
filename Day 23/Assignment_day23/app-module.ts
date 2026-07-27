import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { MyChild } from './my-child/my-child';
import { MyChild1 } from './my-child1/my-child1';
import { FormsModule } from '@angular/forms';
import { EmployeeComponent } from './employee-component/employee-component';
import { StudentComponent } from './student-component/student-component';
import { ProductComponent } from './product-component/product-component';
import { CompanyComponent } from './company-component/company-component';
import { EventRegistrationForm } from './event-registration-form/event-registration-form';
import { Counter } from './counter/counter';
import { StructuralDirectives } from './structural-directives/structural-directives';
//main congfiguration file for the angular project
@NgModule({
  //to specify the configuration of the angular project
  declarations: [
    //registering the components that are part of this module
    App,
    MyChild,
    MyChild1,
    EmployeeComponent,
    StudentComponent,
    ProductComponent,
    CompanyComponent,
    EventRegistrationForm,
    Counter,
    StructuralDirectives,
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule], //to specify the external modules that are required by this module
  providers: [provideBrowserGlobalErrorListeners()],
  bootstrap: [App], //to specify the root component that will be bootstrapped when the application starts
})
export class AppModule {}
