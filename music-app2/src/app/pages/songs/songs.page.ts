import { ToastService } from './../../services/toast.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { SongService } from 'src/app/services/song.service';

@Component({
  selector: 'app-songs',
  templateUrl: './songs.page.html',
  styleUrls: ['./songs.page.scss'],
})
export class SongsPage implements OnInit {

  private albumId;

  songs: Song[];

  response: any = {
    entity: {},
    status: '',
    responseText: ''
  }

  // Router - para movernos entre pantallas y las rutas
  // ActivatedRoute - informacion de las rutas y pantallas
  constructor(private route: ActivatedRoute, private songApi: SongService, private toastService: ToastService, private router: Router) { }

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
    this.router.navigateByUrl('/songs/update-song/' + id);
  }

  delete(id){
    this.songApi.deleteSongById(id).subscribe(
      res => {
        this.response = res;
        if(this.response.status === 'SUCCESS'){
          this.toastService.successToast(this.response.responseText);
          this.ionViewWillEnter();
        }else{
          this.toastService.errorToast(this.response.responseText);
        }

      }
    );
  }

  createSong(){
    this.router.navigateByUrl('/songs/create-song/' + this.albumId);
  }

}
