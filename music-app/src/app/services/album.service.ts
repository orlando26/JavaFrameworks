import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AlbumService {

  private uri = 'http://localhost:8080/api/v1/album';

  constructor(private http: HttpClient) { }

  getAll() {
    return this.http.get(this.uri);
  }  


}
