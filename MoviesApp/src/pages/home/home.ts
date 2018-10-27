import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { MovieApiProvider } from '../../providers/movie-api/movie-api';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
  private movies: any = [];


  constructor(public navCtrl: NavController, private movieApi: MovieApiProvider) {

  }

  ionViewDidLoad(){
    this.movieApi.getMovies().then(data => {
      this.movies = data;
      console.log(this.movies);
    });
  }

  helloWorld(){
    console.log('Hello World!!');
  }

  itemSelected(item){
    console.log(item.title);
  }

}
