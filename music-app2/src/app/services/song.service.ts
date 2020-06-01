import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SongService {

  private uri = 'http://localhost:8080/api/v1/song';

  constructor(private http: HttpClient) { }

  getSongsByAlbumId(albumId){
    return this.http.get<Song[]>(this.uri + '/albumId/' + albumId);
  }
}
