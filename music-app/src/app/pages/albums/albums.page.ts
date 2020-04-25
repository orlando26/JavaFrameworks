import { AlbumService } from './../../services/album.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-albums',
  templateUrl: './albums.page.html',
  styleUrls: ['./albums.page.scss'],
})
export class AlbumsPage implements OnInit {

  public albumsList: any = [];

  constructor(private api: AlbumService, private router: Router) { }

  ngOnInit() {
  }

  ionViewWillEnter() { // listener
   this.api.getAll().subscribe(
     res => {
       this.albumsList = res;
       console.log(this.albumsList);
     }
   );
  }


  openSongsPage(albumId){
    this.router.navigateByUrl('/songs/' + albumId);
  }

}
