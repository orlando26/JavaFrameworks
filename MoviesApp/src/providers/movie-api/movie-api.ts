import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

/*
  Generated class for the MovieApiProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class MovieApiProvider {

  private apiUrl = "http://localhost:9080/api/v1/";

  constructor(public http: HttpClient) {
    console.log('Hello MovieApiProvider Provider');
  }

  getMovies(){
    //promise, fat arrow functions
    return new Promise(resolve => {
      this.http.get(this.apiUrl + 'movie').subscribe(data => {
        resolve(data);
      }, err =>{
        console.log(err);
      });
    });
  }

}
