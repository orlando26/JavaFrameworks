import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { SongDeatilsPage } from './song-deatils.page';

const routes: Routes = [
  {
    path: '',
    component: SongDeatilsPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class SongDeatilsPageRoutingModule {}
