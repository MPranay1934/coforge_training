import { Component } from '@angular/core';

@Component({
  selector: 'app-event-registration-form',
  standalone: false,
  templateUrl: './event-registration-form.html',
  styleUrl: './event-registration-form.css',
})
export class EventRegistrationForm {
  
  name: string = "";
  email: string = "";
  course: string = "";
  message: string = "";

  register() {
    this.message = "Registration Successful!";

    console.log("Name :", this.name);
    console.log("Email :", this.email);
    console.log("Course :", this.course);
    this.message = "registration successful!";
  }
  reset() {
    this.name = "";
    this.email = "";
    this.course = "";
    this.message = "";
  }
}
