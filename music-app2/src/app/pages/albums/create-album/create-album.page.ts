import { Component, OnInit } from '@angular/core';
import { AlbumService } from 'src/app/services/album.service';
import { ToastService } from 'src/app/services/toast.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-album',
  templateUrl: './create-album.page.html',
  styleUrls: ['./create-album.page.scss'],
})
export class CreateAlbumPage implements OnInit {

  album: Album = {
    title: '',
    releaseDate: '',
    price: '',
    genre: ''
  };

  response: any = {
    entity: {},
    status: '',
    responseText: ''
  }

  constructor(private albumApi: AlbumService,
              private toastService: ToastService,
              private router: Router) { }

  ngOnInit() {
  }

  save(){
    console.log(this.album);
    this.albumApi.save(this.album).subscribe(
      res => {
        this.response = res;
        if(this.response.status === 'SUCCESS'){
          this.toastService.successToast(this.response.responseText);
          this.router.navigateByUrl('/albums');
        } else {
          this.toastService.errorToast(this.response.responseText);
        }
      }
    );
  }

}
