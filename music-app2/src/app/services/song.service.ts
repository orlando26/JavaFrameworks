import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SongService {

  private uri = 'http://localhost:8080/api/v1/song';

  header = {
    headers: {
      'Content-Type': 'application/json'
    }
  }

  constructor(private http: HttpClient) { }

  getSongsByAlbumId(albumId){
    return this.http.get<Song[]>(this.uri + '/albumId/' + albumId);
  }

  saveSong(song){
    return this.http.post(this.uri, JSON.stringify(song), this.header);
  }

  deleteSongById(songId){
    return this.http.delete(this.uri + '/songId/' + songId);
  }

  findById(songId) {
    return this.http.get<Song>(this.uri + '/songId/' + songId);
  }

  update(song) {
    return this.http.put(this.uri, JSON.stringify(song), this.header);
  }
}
