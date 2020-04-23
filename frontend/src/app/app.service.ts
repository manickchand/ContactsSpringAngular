import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { environment } from 'src/environments/environment';


const httpOptions = {
  headers: new HttpHeaders({
    'Access-Control-Allow-Origin':  '*',
    'Access-Control-Allow-Methods': 'GET,POST,OPTIONS,DELETE,PUT'
  })
}

@Injectable({
  providedIn: 'root'
})
export class AppService {

  private API_URL = environment.API;

  constructor(private http: HttpClient) {}

  getAll() {
    return this.http
    .get(this.API_URL+"/contact", httpOptions);
  }

}
