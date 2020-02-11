import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { SongsService } from 'src/app/services/songs.service';
import { AlbumServiceService } from 'src/app/services/album-service.service';

@Component({
  selector: 'app-song-deatils',
  templateUrl: './song-deatils.page.html',
  styleUrls: ['./song-deatils.page.scss'],
})
export class SongDeatilsPage implements OnInit {
  private song:any = {
    "albumId": 0,
    "id": 0,
    "time": "string",
    "title": "string"
  }
  private album:any = {};
  constructor(private route:ActivatedRoute, private api:SongsService,
              private albumApi:AlbumServiceService) { }

  ngOnInit() {
    let id = this.route.snapshot.paramMap.get("songId");
    console.log(id);
    this.api.getSongById(id).subscribe(res => {
      this.song = res;
      
      this.albumApi.getalbumById(this.song.albumId).subscribe(res =>{
        this.album = res;
      });

    });
  }

}
