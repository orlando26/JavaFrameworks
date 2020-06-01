import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { UpdateAlbumPageRoutingModule } from './update-album-routing.module';

import { UpdateAlbumPage } from './update-album.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    UpdateAlbumPageRoutingModule
  ],
  declarations: [UpdateAlbumPage]
})
export class UpdateAlbumPageModule {}
