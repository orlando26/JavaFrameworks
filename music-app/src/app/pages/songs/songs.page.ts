import { ToastController } from '@ionic/angular';
import { SongService } from './../../services/song.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Key } from 'protractor';

@Component({
  selector: 'app-songs',
  templateUrl: './songs.page.html',
  styleUrls: ['./songs.page.scss'],
})
export class SongsPage implements OnInit {

  private albumId;

  toast: any;

  private response: any = {
    entity: {},
    status: '',
    responseText: ''
  }

  songs: any = []; // lint

  constructor(private route: ActivatedRoute, private songApi: SongService, private router: Router, private toastCtrl: ToastController) { }

  ngOnInit() {
  }

  ionViewWillEnter() {
   this.albumId = this.route.snapshot.paramMap.get('albumId');
   this.songApi.getAllsongsByAlbum(this.albumId).subscribe(
     res => {
       this.songs = res;
       console.log(this.songs);
     }
   );
  }

  openCreateSongsPage() {
    this.router.navigateByUrl('/songs/create-song/' + this.albumId);
  }

  updateSong(songId) {
    this.router.navigateByUrl('/songs/edit-song/' + songId);
  }

  deleteSong(songId){
    this.songApi.deleteSongById(songId).subscribe(
      res => {
        this.response = res;
        console.log(this.response);
        if(this.response.status == "SUCCESS"){ 
          this.successToast(this.response.responseText);
          this.ionViewWillEnter();
        }else{
          this.errorToast(this.response.responseText);
        }

      }
    );
  }

  successToast(msg) {
    this.toast = this.toastCtrl.create(
      {
        message: msg,
        duration: 2000,
        color: 'success'
      }
    ).then(toastData => {
      toastData.present();
    });
  }

  errorToast(msg) {
    this.toast = this.toastCtrl.create(
      {
        message: msg,
        duration: 2000,
        color: 'danger'
      }
    ).then(toastData => {
      toastData.present();
    });
  }



}
