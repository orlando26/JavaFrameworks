(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["pages-songs-songs-module"],{

/***/ "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/songs/songs.page.html":
/*!***********************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/pages/songs/songs.page.html ***!
  \***********************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<ion-header>\r\n  <ion-toolbar color=\"dark\">\r\n    <ion-buttons slot=\"start\">\r\n      <ion-back-button></ion-back-button>\r\n    </ion-buttons>\r\n    <ion-title>Songs</ion-title>\r\n  </ion-toolbar>\r\n</ion-header>\r\n\r\n<ion-content>\r\n  <ion-list>\r\n\r\n    <ion-item-sliding *ngFor=\"let song of songs\">\r\n      <ion-item>\r\n        <ion-label>\r\n          {{song.title}}\r\n        </ion-label>\r\n      </ion-item>\r\n      <ion-item-options side=\"start\">\r\n        <ion-item-option (click)=\"updateSong(song.id)\" color=\"primary\">\r\n          <ion-icon slot=\"start\" name=\"pencil-outline\"></ion-icon>\r\n          Edit\r\n        </ion-item-option>\r\n        <ion-item-option (click)=\"deleteSong(song.id)\" color=\"danger\">\r\n          <ion-icon slot=\"start\" name=\"trash-outline\"></ion-icon>\r\n          Delete\r\n        </ion-item-option>\r\n      </ion-item-options>\r\n    </ion-item-sliding>\r\n  \r\n  </ion-list>\r\n\r\n  <!-- fab placed to the bottom end -->\r\n  <ion-fab vertical=\"bottom\" horizontal=\"end\" slot=\"fixed\">\r\n    <ion-fab-button color=\"danger\" (click)=\"openCreateSongsPage()\">\r\n      <ion-icon name=\"add-outline\"></ion-icon>\r\n    </ion-fab-button>\r\n  </ion-fab>\r\n</ion-content>\r\n");

/***/ }),

/***/ "./src/app/pages/songs/songs-routing.module.ts":
/*!*****************************************************!*\
  !*** ./src/app/pages/songs/songs-routing.module.ts ***!
  \*****************************************************/
/*! exports provided: SongsPageRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SongsPageRoutingModule", function() { return SongsPageRoutingModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm2015/router.js");
/* harmony import */ var _songs_page__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./songs.page */ "./src/app/pages/songs/songs.page.ts");




const routes = [
    {
        path: '',
        component: _songs_page__WEBPACK_IMPORTED_MODULE_3__["SongsPage"]
    },
    {
        path: 'create-song',
        loadChildren: () => __webpack_require__.e(/*! import() | create-song-create-song-module */ "create-song-create-song-module").then(__webpack_require__.bind(null, /*! ./create-song/create-song.module */ "./src/app/pages/songs/create-song/create-song.module.ts")).then(m => m.CreateSongPageModule)
    },
    {
        path: 'create-song/:albumId',
        loadChildren: () => __webpack_require__.e(/*! import() | create-song-create-song-module */ "create-song-create-song-module").then(__webpack_require__.bind(null, /*! ./create-song/create-song.module */ "./src/app/pages/songs/create-song/create-song.module.ts")).then(m => m.CreateSongPageModule)
    },
    {
        path: 'edit-song',
        loadChildren: () => __webpack_require__.e(/*! import() | edit-song-edit-song-module */ "edit-song-edit-song-module").then(__webpack_require__.bind(null, /*! ./edit-song/edit-song.module */ "./src/app/pages/songs/edit-song/edit-song.module.ts")).then(m => m.EditSongPageModule)
    },
    {
        path: 'edit-song/:songId',
        loadChildren: () => __webpack_require__.e(/*! import() | edit-song-edit-song-module */ "edit-song-edit-song-module").then(__webpack_require__.bind(null, /*! ./edit-song/edit-song.module */ "./src/app/pages/songs/edit-song/edit-song.module.ts")).then(m => m.EditSongPageModule)
    }
];
let SongsPageRoutingModule = class SongsPageRoutingModule {
};
SongsPageRoutingModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
        imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forChild(routes)],
        exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]],
    })
], SongsPageRoutingModule);



/***/ }),

/***/ "./src/app/pages/songs/songs.module.ts":
/*!*********************************************!*\
  !*** ./src/app/pages/songs/songs.module.ts ***!
  \*********************************************/
/*! exports provided: SongsPageModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SongsPageModule", function() { return SongsPageModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/fesm2015/common.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm2015/forms.js");
/* harmony import */ var _ionic_angular__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @ionic/angular */ "./node_modules/@ionic/angular/fesm2015/ionic-angular.js");
/* harmony import */ var _songs_routing_module__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./songs-routing.module */ "./src/app/pages/songs/songs-routing.module.ts");
/* harmony import */ var _songs_page__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./songs.page */ "./src/app/pages/songs/songs.page.ts");







let SongsPageModule = class SongsPageModule {
};
SongsPageModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
        imports: [
            _angular_common__WEBPACK_IMPORTED_MODULE_2__["CommonModule"],
            _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"],
            _ionic_angular__WEBPACK_IMPORTED_MODULE_4__["IonicModule"],
            _songs_routing_module__WEBPACK_IMPORTED_MODULE_5__["SongsPageRoutingModule"]
        ],
        declarations: [_songs_page__WEBPACK_IMPORTED_MODULE_6__["SongsPage"]]
    })
], SongsPageModule);



/***/ }),

/***/ "./src/app/pages/songs/songs.page.scss":
/*!*********************************************!*\
  !*** ./src/app/pages/songs/songs.page.scss ***!
  \*********************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL3BhZ2VzL3NvbmdzL3NvbmdzLnBhZ2Uuc2NzcyJ9 */");

/***/ }),

/***/ "./src/app/pages/songs/songs.page.ts":
/*!*******************************************!*\
  !*** ./src/app/pages/songs/songs.page.ts ***!
  \*******************************************/
/*! exports provided: SongsPage */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SongsPage", function() { return SongsPage; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _ionic_angular__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @ionic/angular */ "./node_modules/@ionic/angular/fesm2015/ionic-angular.js");
/* harmony import */ var _services_song_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./../../services/song.service */ "./src/app/services/song.service.ts");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm2015/router.js");





let SongsPage = class SongsPage {
    constructor(route, songApi, router, toastCtrl) {
        this.route = route;
        this.songApi = songApi;
        this.router = router;
        this.toastCtrl = toastCtrl;
        this.response = {
            entity: {},
            status: '',
            responseText: ''
        };
        this.songs = []; // lint
    }
    ngOnInit() {
    }
    ionViewWillEnter() {
        this.albumId = this.route.snapshot.paramMap.get('albumId');
        this.songApi.getAllsongsByAlbum(this.albumId).subscribe(res => {
            this.songs = res;
            console.log(this.songs);
        });
    }
    openCreateSongsPage() {
        this.router.navigateByUrl('/songs/create-song/' + this.albumId);
    }
    updateSong(songId) {
        this.router.navigateByUrl('/songs/edit-song/' + songId);
    }
    deleteSong(songId) {
        this.songApi.deleteSongById(songId).subscribe(res => {
            this.response = res;
            console.log(this.response);
            if (this.response.status == "SUCCESS") {
                this.successToast(this.response.responseText);
                this.ionViewWillEnter();
            }
            else {
                this.errorToast(this.response.responseText);
            }
        });
    }
    successToast(msg) {
        this.toast = this.toastCtrl.create({
            message: msg,
            duration: 2000,
            color: 'success'
        }).then(toastData => {
            toastData.present();
        });
    }
    errorToast(msg) {
        this.toast = this.toastCtrl.create({
            message: msg,
            duration: 2000,
            color: 'danger'
        }).then(toastData => {
            toastData.present();
        });
    }
};
SongsPage.ctorParameters = () => [
    { type: _angular_router__WEBPACK_IMPORTED_MODULE_4__["ActivatedRoute"] },
    { type: _services_song_service__WEBPACK_IMPORTED_MODULE_2__["SongService"] },
    { type: _angular_router__WEBPACK_IMPORTED_MODULE_4__["Router"] },
    { type: _ionic_angular__WEBPACK_IMPORTED_MODULE_1__["ToastController"] }
];
SongsPage = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["Component"])({
        selector: 'app-songs',
        template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(/*! raw-loader!./songs.page.html */ "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/songs/songs.page.html")).default,
        styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(/*! ./songs.page.scss */ "./src/app/pages/songs/songs.page.scss")).default]
    }),
    tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_4__["ActivatedRoute"], _services_song_service__WEBPACK_IMPORTED_MODULE_2__["SongService"], _angular_router__WEBPACK_IMPORTED_MODULE_4__["Router"], _ionic_angular__WEBPACK_IMPORTED_MODULE_1__["ToastController"]])
], SongsPage);



/***/ }),

/***/ "./src/app/services/song.service.ts":
/*!******************************************!*\
  !*** ./src/app/services/song.service.ts ***!
  \******************************************/
/*! exports provided: SongService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SongService", function() { return SongService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm2015/http.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");



let SongService = class SongService {
    constructor(http) {
        this.http = http;
        //private uri = 'http://localhost:8080/api/v1/song';
        this.uri = 'http://ec2-3-94-109-229.compute-1.amazonaws.com:8080/api/v1/song';
        this.header = {
            headers: {
                'Content-Type': 'application/json'
            }
        };
    }
    getAllsongsByAlbum(albumId) {
        return this.http.get(this.uri + '/album/' + albumId);
    }
    saveSong(song) {
        return this.http.post(this.uri, JSON.stringify(song), this.header);
    }
    deleteSongById(songId) {
        return this.http.delete(this.uri + '/' + songId);
    }
    findById(songId) {
        return this.http.get(this.uri + '/' + songId);
    }
    update(song) {
        return this.http.put(this.uri, JSON.stringify(song), this.header);
    }
};
SongService.ctorParameters = () => [
    { type: _angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"] }
];
SongService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_2__["Injectable"])({
        providedIn: 'root'
    }),
    tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]])
], SongService);



/***/ })

}]);
//# sourceMappingURL=pages-songs-songs-module-es2015.js.map