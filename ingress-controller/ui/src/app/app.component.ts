import { Component } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private http: HttpClient){}
  title = 'ui';
  authResponse:any;
  mailResponse: any;
  trackerResponse:any;

  

  getAuth = () => {
    const url = "https://api.testleaftraining.com/api/v1/users";
    return this.http.get(url,{ responseType: 'text' }).subscribe(res => {
      console.log(res);
      this.authResponse = JSON.stringify(res);
    });
  }

  getNotifications = () => {
    const url = "https://api.testleaftraining.com/api/v1/mails";
    return this.http.get(url,{ responseType: 'text' }).subscribe(res => {
      console.log(res);
      this.mailResponse = res;
    });
  }

  getTracker = () => {
    const url = "https://api.testleaftraining.com/api/v1/sites";
    return this.http.get(url).subscribe(res => {
      console.log(res);
      this.trackerResponse = JSON.stringify(res);
    });
  }
}