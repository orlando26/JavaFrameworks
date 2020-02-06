import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { SongDeatilsPageRoutingModule } from './song-deatils-routing.module';

import { SongDeatilsPage } from './song-deatils.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    SongDeatilsPageRoutingModule
  ],
  declarations: [SongDeatilsPage]
})
export class SongDeatilsPageModule {}
