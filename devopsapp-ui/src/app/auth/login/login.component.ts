import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private authService:AuthService, private router:Router) { }

  ngOnInit(): void {
  }

  user:any = {
    username: null, password: null
  }

  login(){
    this.authService.login(this.user).subscribe( res=>{
      let user = res;
      if(res != null){
        localStorage.setItem("LOGGED_IN_USER", JSON.stringify(user));
        alert("Successfully LoggedIn.");
        this.router.navigateByUrl("/sites");
      }
      else{
        alert("Invalid Login Credentials");
      }
    })
  }

}
