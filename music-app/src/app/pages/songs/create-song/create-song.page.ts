import { ToastController } from '@ionic/angular';
import { ActivatedRoute, Router } from '@angular/router';
import { SongService } from './../../../services/song.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-create-song',
  templateUrl: './create-song.page.html',
  styleUrls: ['./create-song.page.scss'],
})
export class CreateSongPage implements OnInit {

  private toast: any;

  private response: any = {
    entity: {},
    responseText: '',
    status: ''
  }

  song: any = {
    albumId: '',
    title: '',
    time: ''
  }

  constructor(private songApi: SongService,
              private route: ActivatedRoute,
              private toastCtrl: ToastController,
              private router: Router) { }

  ngOnInit() {
  }

  ionViewWillEnter(){
   this.song.albumId = this.route.snapshot.paramMap.get('albumId');
  }

  cancel() {
    this.router.navigateByUrl('/songs/' + this.song.albumId);
  }

  saveSong(){

    this.songApi.saveSong(this.song).subscribe(
      res => {
        this.response = res;
        console.log(this.response);

        if(this.response.status == "SUCCESS"){
          this.successToast(this.response.responseText);
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
