import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AlbumService {

  private uri = 'http://localhost:8080/api/v1/album';

  header = {
    headers: {
      'Content-Type': 'application/json'
    }
  };

  constructor(private http: HttpClient) { }

  getAll() {
    return this.http.get(this.uri); 
  }  

  saveAlbum(album){
    return this.http.post(this.uri, JSON.stringify(album), this.header);
  }


}