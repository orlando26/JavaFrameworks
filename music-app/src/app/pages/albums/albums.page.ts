import { AlbumService } from './../../services/album.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-albums',
  templateUrl: './albums.page.html',
  styleUrls: ['./albums.page.scss'],
})
export class AlbumsPage implements OnInit {

  public albumsList: any = [];

  constructor(private api: AlbumService) { }

  ngOnInit() {
  }

  ionViewWillEnter(){
   this.api.getAll().subscribe(
     res => {
       this.albumsList = res;
       console.log(this.albumsList);
     }
   );
  }

}
