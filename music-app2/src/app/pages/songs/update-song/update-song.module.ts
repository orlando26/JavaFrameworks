import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { UpdateSongPageRoutingModule } from './update-song-routing.module';

import { UpdateSongPage } from './update-song.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    UpdateSongPageRoutingModule
  ],
  declarations: [UpdateSongPage]
})
export class UpdateSongPageModule {}
