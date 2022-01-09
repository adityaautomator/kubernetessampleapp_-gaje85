import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  login(){
    const user = { id: 1, name:"Gaje", email:"gajen@gmail.com"};
    localStorage.setItem("LOGGED_IN_USER", JSON.stringify(user));
  }

}
