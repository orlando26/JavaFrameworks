(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["pages-albums-albums-module"],{

/***/ "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/albums/albums.page.html":
/*!*************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/pages/albums/albums.page.html ***!
  \*************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<ion-header>\r\n  <ion-toolbar color=\"dark\">\r\n    <ion-title>albums</ion-title>\r\n  </ion-toolbar>\r\n</ion-header>\r\n\r\n<ion-content>\r\n<ion-list>\r\n\r\n  <ion-item-sliding *ngFor=\"let album of albumsList\">\r\n    <ion-item detail>\r\n      <ion-label (click)=\"openSongsPage(album.id)\" >{{album.title}}</ion-label>\r\n    </ion-item>\r\n    <ion-item-options side=\"start\">\r\n      <ion-item-option (click)=\"editPage(album.id)\" color=\"primary\">\r\n        <ion-icon slot=\"start\" name=\"pencil-outline\"></ion-icon>\r\n        Edit\r\n      </ion-item-option>\r\n      <ion-item-option (click)=\"deleteAlbum(album.id)\" color=\"danger\">\r\n        <ion-icon slot=\"start\" name=\"trash-outline\"></ion-icon>\r\n        Delete\r\n      </ion-item-option>\r\n    </ion-item-options>\r\n  </ion-item-sliding>\r\n  \r\n</ion-list>\r\n\r\n\r\n<!-- fab placed to the bottom end -->\r\n<ion-fab vertical=\"bottom\" horizontal=\"end\" slot=\"fixed\">\r\n  <ion-fab-button color=\"danger\" routerLink=\"/albums/create\">\r\n    <ion-icon name=\"add-outline\"></ion-icon>\r\n  </ion-fab-button>\r\n</ion-fab>\r\n\r\n</ion-content>\r\n");

/***/ }),

/***/ "./src/app/pages/albums/albums-routing.module.ts":
/*!*******************************************************!*\
  !*** ./src/app/pages/albums/albums-routing.module.ts ***!
  \*******************************************************/
/*! exports provided: AlbumsPageRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AlbumsPageRoutingModule", function() { return AlbumsPageRoutingModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm2015/router.js");
/* harmony import */ var _albums_page__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./albums.page */ "./src/app/pages/albums/albums.page.ts");




const routes = [
    {
        path: '',
        component: _albums_page__WEBPACK_IMPORTED_MODULE_3__["AlbumsPage"]
    },
    {
        path: 'create',
        loadChildren: () => __webpack_require__.e(/*! import() | create-create-module */ "create-create-module").then(__webpack_require__.bind(null, /*! ./create/create.module */ "./src/app/pages/albums/create/create.module.ts")).then(m => m.CreatePageModule)
    },
    {
        path: 'edit',
        loadChildren: () => __webpack_require__.e(/*! import() | edit-edit-module */ "edit-edit-module").then(__webpack_require__.bind(null, /*! ./edit/edit.module */ "./src/app/pages/albums/edit/edit.module.ts")).then(m => m.EditPageModule)
    },
    {
        path: 'edit/:albumId',
        loadChildren: () => __webpack_require__.e(/*! import() | edit-edit-module */ "edit-edit-module").then(__webpack_require__.bind(null, /*! ./edit/edit.module */ "./src/app/pages/albums/edit/edit.module.ts")).then(m => m.EditPageModule)
    }
];
let AlbumsPageRoutingModule = class AlbumsPageRoutingModule {
};
AlbumsPageRoutingModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
        imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forChild(routes)],
        exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]],
    })
], AlbumsPageRoutingModule);



/***/ }),

/***/ "./src/app/pages/albums/albums.module.ts":
/*!***********************************************!*\
  !*** ./src/app/pages/albums/albums.module.ts ***!
  \***********************************************/
/*! exports provided: AlbumsPageModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AlbumsPageModule", function() { return AlbumsPageModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common */ "./node_modules/@angular/common/fesm2015/common.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm2015/forms.js");
/* harmony import */ var _ionic_angular__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @ionic/angular */ "./node_modules/@ionic/angular/fesm2015/ionic-angular.js");
/* harmony import */ var _albums_routing_module__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./albums-routing.module */ "./src/app/pages/albums/albums-routing.module.ts");
/* harmony import */ var _albums_page__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./albums.page */ "./src/app/pages/albums/albums.page.ts");







let AlbumsPageModule = class AlbumsPageModule {
};
AlbumsPageModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
        imports: [
            _angular_common__WEBPACK_IMPORTED_MODULE_2__["CommonModule"],
            _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"],
            _ionic_angular__WEBPACK_IMPORTED_MODULE_4__["IonicModule"],
            _albums_routing_module__WEBPACK_IMPORTED_MODULE_5__["AlbumsPageRoutingModule"]
        ],
        declarations: [_albums_page__WEBPACK_IMPORTED_MODULE_6__["AlbumsPage"]]
    })
], AlbumsPageModule);



/***/ }),

/***/ "./src/app/pages/albums/albums.page.scss":
/*!***********************************************!*\
  !*** ./src/app/pages/albums/albums.page.scss ***!
  \***********************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL3BhZ2VzL2FsYnVtcy9hbGJ1bXMucGFnZS5zY3NzIn0= */");

/***/ }),

/***/ "./src/app/pages/albums/albums.page.ts":
/*!*********************************************!*\
  !*** ./src/app/pages/albums/albums.page.ts ***!
  \*********************************************/
/*! exports provided: AlbumsPage */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AlbumsPage", function() { return AlbumsPage; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _ionic_angular__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @ionic/angular */ "./node_modules/@ionic/angular/fesm2015/ionic-angular.js");
/* harmony import */ var _services_album_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./../../services/album.service */ "./src/app/services/album.service.ts");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm2015/router.js");





let AlbumsPage = class AlbumsPage {
    constructor(api, router, toastCtrl) {
        this.api = api;
        this.router = router;
        this.toastCtrl = toastCtrl;
        this.albumsList = [];
        this.response = {
            entity: {},
            status: '',
            responseText: ''
        };
    }
    ngOnInit() {
    }
    ionViewWillEnter() {
        this.api.getAll().subscribe(res => {
            this.albumsList = res;
            console.log(this.albumsList);
        });
    }
    openSongsPage(albumId) {
        this.router.navigateByUrl('/songs/' + albumId);
    }
    deleteAlbum(albumId) {
        this.api.deleteById(albumId).subscribe(res => {
            this.response = res;
            if (this.response.status == 'SUCCESS') {
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
    editPage(albumId) {
        this.router.navigateByUrl('/albums/edit/' + albumId);
    }
};
AlbumsPage.ctorParameters = () => [
    { type: _services_album_service__WEBPACK_IMPORTED_MODULE_2__["AlbumService"] },
    { type: _angular_router__WEBPACK_IMPORTED_MODULE_4__["Router"] },
    { type: _ionic_angular__WEBPACK_IMPORTED_MODULE_1__["ToastController"] }
];
AlbumsPage = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["Component"])({
        selector: 'app-albums',
        template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(/*! raw-loader!./albums.page.html */ "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/albums/albums.page.html")).default,
        styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(/*! ./albums.page.scss */ "./src/app/pages/albums/albums.page.scss")).default]
    }),
    tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_services_album_service__WEBPACK_IMPORTED_MODULE_2__["AlbumService"], _angular_router__WEBPACK_IMPORTED_MODULE_4__["Router"], _ionic_angular__WEBPACK_IMPORTED_MODULE_1__["ToastController"]])
], AlbumsPage);



/***/ }),

/***/ "./src/app/services/album.service.ts":
/*!*******************************************!*\
  !*** ./src/app/services/album.service.ts ***!
  \*******************************************/
/*! exports provided: AlbumService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AlbumService", function() { return AlbumService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm2015/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm2015/http.js");



let AlbumService = class AlbumService {
    constructor(http) {
        this.http = http;
        //private uri = 'http://localhost:8080/api/v1/album';
        this.uri = 'http://ec2-3-94-109-229.compute-1.amazonaws.com:8080/api/v1/album';
        this.header = {
            headers: {
                'Content-Type': 'application/json'
            }
        };
    }
    getAll() {
        return this.http.get(this.uri);
    }
    saveAlbum(album) {
        return this.http.post(this.uri, JSON.stringify(album), this.header);
    }
    deleteById(albumId) {
        return this.http.delete(this.uri + '/' + albumId);
    }
    update(album) {
        return this.http.put(this.uri, JSON.stringify(album), this.header);
    }
    findById(albumId) {
        return this.http.get(this.uri + '/' + albumId);
    }
};
AlbumService.ctorParameters = () => [
    { type: _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"] }
];
AlbumService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
        providedIn: 'root'
    }),
    tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
], AlbumService);



/***/ })

}]);
//# sourceMappingURL=pages-albums-albums-module-es2015.js.map