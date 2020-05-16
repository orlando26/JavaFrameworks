import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SongService {

  //private uri = 'http://localhost:8080/api/v1/song';
  private uri = 'http://ec2-3-94-109-229.compute-1.amazonaws.com:8080/api/v1/song';

  header = {
    headers: {
      'Content-Type': 'application/json'
    }
  };

  constructor(private http: HttpClient) { }

  getAllsongsByAlbum(albumId) {
    return this.http.get(this.uri + '/album/' + albumId);
  }

  saveSong(song){
    return this.http.post(this.uri, JSON.stringify(song), this.header);
  }

  deleteSongById(songId){
    return this.http.delete(this.uri + '/' + songId);
  }

  findById(songId) {
    return this.http.get(this.uri + '/' + songId);
  }

  update(song) {
    return this.http.put(this.uri, JSON.stringify(song), this.header);
  }
}
