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
  }

  constructor(private http: HttpClient) { }


  findAll(){
    return this.http.get<Album[]>(this.uri);
  }

  save(album: Album){
    return this.http.post(this.uri, JSON.stringify(album), this.header);
  }

  delete(id: number){
    return this.http.delete(this.uri + '/id/' + id);
  }

  update(album: Album){
    return this.http.put(this.uri, JSON.stringify(album), this.header);
  }

  findById(albumId){
    return this.http.get<Album>(this.uri + '/id/' + albumId);
  }
}
