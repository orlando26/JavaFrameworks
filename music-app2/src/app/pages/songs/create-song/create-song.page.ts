import { ToastService } from './../../../services/toast.service';
import { ActivatedRoute, Router } from '@angular/router';
import { SongService } from 'src/app/services/song.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-create-song',
  templateUrl: './create-song.page.html',
  styleUrls: ['./create-song.page.scss'],
})
export class CreateSongPage implements OnInit {

  song: Song = {
    albumId: 0,
    title: '',
    time: ''
  }

  private response: any = {
    entity: {},
    responseText: '',
    status: ''
  }

  constructor(private songApi: SongService,private route: ActivatedRoute, private toastService: ToastService, private router: Router) { }

  ngOnInit() {
  }

  ionViewWillEnter(){
    this.song.albumId = +this.route.snapshot.paramMap.get('albumId');
  }

  save(){

    this.songApi.saveSong(this.song).subscribe(
      res => {
        this.response = res;

        if(this.response.status === 'SUCCESS'){
          this.toastService.successToast(this.response.responseText);
          this.router.navigateByUrl('/songs/' + this.song.albumId)
        }else{
          this.toastService.errorToast(this.response.responseText);
        }
      }
    );
  }

}
