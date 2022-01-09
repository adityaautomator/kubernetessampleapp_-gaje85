import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SiteService {

  constructor(private http: HttpClient) { }

  getSites(){
    const url ="https://devopstracker-api.herokuapp.com/api/v1/sites";
    return this.http.get(url);
  }
}
