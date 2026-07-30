import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { App } from './app';
import { EmployeeComponent } from './components/employee-component/employee-component';
import { EmployeeService } from './services/employee.service';

@NgModule({
  declarations: [App, EmployeeComponent],
  imports: [BrowserModule, FormsModule, HttpClientModule],
  providers: [EmployeeService],
  bootstrap: [App],
})
export class AppModule {}
