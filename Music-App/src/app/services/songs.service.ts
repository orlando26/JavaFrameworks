import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SongsService {
  private songApiUrl:string = "http://localhost:8080/api/v1/songs/";
  constructor(private http:HttpClient) { }

  getAllByAlbumId(albumId){
    return this.http.get(this.songApiUrl + 'album/' + albumId);
  }

  createSong(song){
    let header = {
      "headers": {
        "Content-Type": "application/json"
      }
    }
    return this.http.post(this.songApiUrl, JSON.stringify(song), header);
  }

  updateSong(song){
    let header = {
      "headers": {
        "Content-Type": "application/json"
      }
    }
    return this.http.put(this.songApiUrl, JSON.stringify(song), header);
  }

  getSongById(songId){
    return this.http.get(this.songApiUrl + songId);
  }

  deleteSong(songId){
    return this.http.delete(this.songApiUrl + songId);
  }
}
