import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PersonService {

  private uri = 'http://ec2-3-93-216-228.compute-1.amazonaws.com:8080/api/v1/person';

  header = {
    headers: {
      'Content-Type': 'application/json'
    }
  }

  constructor(private http: HttpClient) { }

  save(person: Person){
    return this.http.post(this.uri, JSON.stringify(person), this.header);
  }

  authenticate (auth: Authenticate){
    return this.http.post(this.uri + '/authenticate', JSON.stringify(auth), this.header);
  }

}
