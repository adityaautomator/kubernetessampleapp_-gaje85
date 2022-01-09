import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/auth.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private authService:AuthService, private router:Router) { }

  ngOnInit(): void {

  }

  user:any = { name: null, email:'', password:''};

  register(){
    this.authService.register(this.user).subscribe(res=>{
      alert("Successfully Registered !!!. Redirecting to login page !!!");
      setTimeout( ()=>{        
        this.router.navigateByUrl("/login");
      },2000);
    });
  }

}
