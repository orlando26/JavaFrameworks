import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { SongService } from 'src/app/services/song.service';

@Component({
  selector: 'app-songs',
  templateUrl: './songs.page.html',
  styleUrls: ['./songs.page.scss'],
})
export class SongsPage implements OnInit {

  private albumId;

  songs: Song[];

  // Router - para movernos entre pantallas y las rutas
  // ActivatedRoute - informacion de las rutas y pantallas
  constructor(private route: ActivatedRoute, private songApi: SongService) { }

  ngOnInit() {
  }

  ionViewWillEnter(){
   this.albumId = this.route.snapshot.paramMap.get('albumId');
   console.log(this.albumId);
   this.songApi.getSongsByAlbumId(this.albumId).subscribe(
     res => {
       console.log(res);
       this.songs = res;
     }
   );

  }
  update(id){
    console.log(id);
  }

  delete(id){
    console.log(id);
  }

}
