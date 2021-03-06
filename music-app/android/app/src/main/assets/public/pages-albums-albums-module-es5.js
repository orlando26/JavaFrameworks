function _defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } }

function _createClass(Constructor, protoProps, staticProps) { if (protoProps) _defineProperties(Constructor.prototype, protoProps); if (staticProps) _defineProperties(Constructor, staticProps); return Constructor; }

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["pages-albums-albums-module"], {
  /***/
  "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/albums/albums.page.html":
  /*!*************************************************************************************!*\
    !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/pages/albums/albums.page.html ***!
    \*************************************************************************************/

  /*! exports provided: default */

  /***/
  function node_modulesRawLoaderDistCjsJsSrcAppPagesAlbumsAlbumsPageHtml(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "<ion-header>\r\n  <ion-toolbar color=\"dark\">\r\n    <ion-title>albums</ion-title>\r\n  </ion-toolbar>\r\n</ion-header>\r\n\r\n<ion-content>\r\n<ion-list>\r\n\r\n  <ion-item-sliding *ngFor=\"let album of albumsList\">\r\n    <ion-item detail>\r\n      <ion-label (click)=\"openSongsPage(album.id)\" >{{album.title}}</ion-label>\r\n    </ion-item>\r\n    <ion-item-options side=\"start\">\r\n      <ion-item-option (click)=\"editPage(album.id)\" color=\"primary\">\r\n        <ion-icon slot=\"start\" name=\"pencil-outline\"></ion-icon>\r\n        Edit\r\n      </ion-item-option>\r\n      <ion-item-option (click)=\"deleteAlbum(album.id)\" color=\"danger\">\r\n        <ion-icon slot=\"start\" name=\"trash-outline\"></ion-icon>\r\n        Delete\r\n      </ion-item-option>\r\n    </ion-item-options>\r\n  </ion-item-sliding>\r\n  \r\n</ion-list>\r\n\r\n\r\n<!-- fab placed to the bottom end -->\r\n<ion-fab vertical=\"bottom\" horizontal=\"end\" slot=\"fixed\">\r\n  <ion-fab-button color=\"danger\" routerLink=\"/albums/create\">\r\n    <ion-icon name=\"add-outline\"></ion-icon>\r\n  </ion-fab-button>\r\n</ion-fab>\r\n\r\n</ion-content>\r\n";
    /***/
  },

  /***/
  "./src/app/pages/albums/albums-routing.module.ts":
  /*!*******************************************************!*\
    !*** ./src/app/pages/albums/albums-routing.module.ts ***!
    \*******************************************************/

  /*! exports provided: AlbumsPageRoutingModule */

  /***/
  function srcAppPagesAlbumsAlbumsRoutingModuleTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "AlbumsPageRoutingModule", function () {
      return AlbumsPageRoutingModule;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/router */
    "./node_modules/@angular/router/fesm2015/router.js");
    /* harmony import */


    var _albums_page__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! ./albums.page */
    "./src/app/pages/albums/albums.page.ts");

    var routes = [{
      path: '',
      component: _albums_page__WEBPACK_IMPORTED_MODULE_3__["AlbumsPage"]
    }, {
      path: 'create',
      loadChildren: function loadChildren() {
        return __webpack_require__.e(
        /*! import() | create-create-module */
        "create-create-module").then(__webpack_require__.bind(null,
        /*! ./create/create.module */
        "./src/app/pages/albums/create/create.module.ts")).then(function (m) {
          return m.CreatePageModule;
        });
      }
    }, {
      path: 'edit',
      loadChildren: function loadChildren() {
        return __webpack_require__.e(
        /*! import() | edit-edit-module */
        "edit-edit-module").then(__webpack_require__.bind(null,
        /*! ./edit/edit.module */
        "./src/app/pages/albums/edit/edit.module.ts")).then(function (m) {
          return m.EditPageModule;
        });
      }
    }, {
      path: 'edit/:albumId',
      loadChildren: function loadChildren() {
        return __webpack_require__.e(
        /*! import() | edit-edit-module */
        "edit-edit-module").then(__webpack_require__.bind(null,
        /*! ./edit/edit.module */
        "./src/app/pages/albums/edit/edit.module.ts")).then(function (m) {
          return m.EditPageModule;
        });
      }
    }];

    var AlbumsPageRoutingModule = function AlbumsPageRoutingModule() {
      _classCallCheck(this, AlbumsPageRoutingModule);
    };

    AlbumsPageRoutingModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
      imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forChild(routes)],
      exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]]
    })], AlbumsPageRoutingModule);
    /***/
  },

  /***/
  "./src/app/pages/albums/albums.module.ts":
  /*!***********************************************!*\
    !*** ./src/app/pages/albums/albums.module.ts ***!
    \***********************************************/

  /*! exports provided: AlbumsPageModule */

  /***/
  function srcAppPagesAlbumsAlbumsModuleTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "AlbumsPageModule", function () {
      return AlbumsPageModule;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_common__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/common */
    "./node_modules/@angular/common/fesm2015/common.js");
    /* harmony import */


    var _angular_forms__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! @angular/forms */
    "./node_modules/@angular/forms/fesm2015/forms.js");
    /* harmony import */


    var _ionic_angular__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! @ionic/angular */
    "./node_modules/@ionic/angular/fesm2015/ionic-angular.js");
    /* harmony import */


    var _albums_routing_module__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(
    /*! ./albums-routing.module */
    "./src/app/pages/albums/albums-routing.module.ts");
    /* harmony import */


    var _albums_page__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(
    /*! ./albums.page */
    "./src/app/pages/albums/albums.page.ts");

    var AlbumsPageModule = function AlbumsPageModule() {
      _classCallCheck(this, AlbumsPageModule);
    };

    AlbumsPageModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
      imports: [_angular_common__WEBPACK_IMPORTED_MODULE_2__["CommonModule"], _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"], _ionic_angular__WEBPACK_IMPORTED_MODULE_4__["IonicModule"], _albums_routing_module__WEBPACK_IMPORTED_MODULE_5__["AlbumsPageRoutingModule"]],
      declarations: [_albums_page__WEBPACK_IMPORTED_MODULE_6__["AlbumsPage"]]
    })], AlbumsPageModule);
    /***/
  },

  /***/
  "./src/app/pages/albums/albums.page.scss":
  /*!***********************************************!*\
    !*** ./src/app/pages/albums/albums.page.scss ***!
    \***********************************************/

  /*! exports provided: default */

  /***/
  function srcAppPagesAlbumsAlbumsPageScss(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony default export */


    __webpack_exports__["default"] = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL3BhZ2VzL2FsYnVtcy9hbGJ1bXMucGFnZS5zY3NzIn0= */";
    /***/
  },

  /***/
  "./src/app/pages/albums/albums.page.ts":
  /*!*********************************************!*\
    !*** ./src/app/pages/albums/albums.page.ts ***!
    \*********************************************/

  /*! exports provided: AlbumsPage */

  /***/
  function srcAppPagesAlbumsAlbumsPageTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "AlbumsPage", function () {
      return AlbumsPage;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _ionic_angular__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @ionic/angular */
    "./node_modules/@ionic/angular/fesm2015/ionic-angular.js");
    /* harmony import */


    var _services_album_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! ./../../services/album.service */
    "./src/app/services/album.service.ts");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_router__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(
    /*! @angular/router */
    "./node_modules/@angular/router/fesm2015/router.js");

    var AlbumsPage = /*#__PURE__*/function () {
      function AlbumsPage(api, router, toastCtrl) {
        _classCallCheck(this, AlbumsPage);

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

      _createClass(AlbumsPage, [{
        key: "ngOnInit",
        value: function ngOnInit() {}
      }, {
        key: "ionViewWillEnter",
        value: function ionViewWillEnter() {
          var _this = this;

          this.api.getAll().subscribe(function (res) {
            _this.albumsList = res;
            console.log(_this.albumsList);
          });
        }
      }, {
        key: "openSongsPage",
        value: function openSongsPage(albumId) {
          this.router.navigateByUrl('/songs/' + albumId);
        }
      }, {
        key: "deleteAlbum",
        value: function deleteAlbum(albumId) {
          var _this2 = this;

          this.api.deleteById(albumId).subscribe(function (res) {
            _this2.response = res;

            if (_this2.response.status == 'SUCCESS') {
              _this2.successToast(_this2.response.responseText);

              _this2.ionViewWillEnter();
            } else {
              _this2.errorToast(_this2.response.responseText);
            }
          });
        }
      }, {
        key: "successToast",
        value: function successToast(msg) {
          this.toast = this.toastCtrl.create({
            message: msg,
            duration: 2000,
            color: 'success'
          }).then(function (toastData) {
            toastData.present();
          });
        }
      }, {
        key: "errorToast",
        value: function errorToast(msg) {
          this.toast = this.toastCtrl.create({
            message: msg,
            duration: 2000,
            color: 'danger'
          }).then(function (toastData) {
            toastData.present();
          });
        }
      }, {
        key: "editPage",
        value: function editPage(albumId) {
          this.router.navigateByUrl('/albums/edit/' + albumId);
        }
      }]);

      return AlbumsPage;
    }();

    AlbumsPage.ctorParameters = function () {
      return [{
        type: _services_album_service__WEBPACK_IMPORTED_MODULE_2__["AlbumService"]
      }, {
        type: _angular_router__WEBPACK_IMPORTED_MODULE_4__["Router"]
      }, {
        type: _ionic_angular__WEBPACK_IMPORTED_MODULE_1__["ToastController"]
      }];
    };

    AlbumsPage = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["Component"])({
      selector: 'app-albums',
      template: tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! raw-loader!./albums.page.html */
      "./node_modules/raw-loader/dist/cjs.js!./src/app/pages/albums/albums.page.html"))["default"],
      styles: [tslib__WEBPACK_IMPORTED_MODULE_0__["__importDefault"](__webpack_require__(
      /*! ./albums.page.scss */
      "./src/app/pages/albums/albums.page.scss"))["default"]]
    }), tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_services_album_service__WEBPACK_IMPORTED_MODULE_2__["AlbumService"], _angular_router__WEBPACK_IMPORTED_MODULE_4__["Router"], _ionic_angular__WEBPACK_IMPORTED_MODULE_1__["ToastController"]])], AlbumsPage);
    /***/
  },

  /***/
  "./src/app/services/album.service.ts":
  /*!*******************************************!*\
    !*** ./src/app/services/album.service.ts ***!
    \*******************************************/

  /*! exports provided: AlbumService */

  /***/
  function srcAppServicesAlbumServiceTs(module, __webpack_exports__, __webpack_require__) {
    "use strict";

    __webpack_require__.r(__webpack_exports__);
    /* harmony export (binding) */


    __webpack_require__.d(__webpack_exports__, "AlbumService", function () {
      return AlbumService;
    });
    /* harmony import */


    var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(
    /*! tslib */
    "./node_modules/tslib/tslib.es6.js");
    /* harmony import */


    var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(
    /*! @angular/core */
    "./node_modules/@angular/core/fesm2015/core.js");
    /* harmony import */


    var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(
    /*! @angular/common/http */
    "./node_modules/@angular/common/fesm2015/http.js");

    var AlbumService = /*#__PURE__*/function () {
      function AlbumService(http) {
        _classCallCheck(this, AlbumService);

        this.http = http; //private uri = 'http://localhost:8080/api/v1/album';

        this.uri = 'http://ec2-3-94-109-229.compute-1.amazonaws.com:8080/api/v1/album';
        this.header = {
          headers: {
            'Content-Type': 'application/json'
          }
        };
      }

      _createClass(AlbumService, [{
        key: "getAll",
        value: function getAll() {
          return this.http.get(this.uri);
        }
      }, {
        key: "saveAlbum",
        value: function saveAlbum(album) {
          return this.http.post(this.uri, JSON.stringify(album), this.header);
        }
      }, {
        key: "deleteById",
        value: function deleteById(albumId) {
          return this.http["delete"](this.uri + '/' + albumId);
        }
      }, {
        key: "update",
        value: function update(album) {
          return this.http.put(this.uri, JSON.stringify(album), this.header);
        }
      }, {
        key: "findById",
        value: function findById(albumId) {
          return this.http.get(this.uri + '/' + albumId);
        }
      }]);

      return AlbumService;
    }();

    AlbumService.ctorParameters = function () {
      return [{
        type: _angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]
      }];
    };

    AlbumService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
      providedIn: 'root'
    }), tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])], AlbumService);
    /***/
  }
}]);
//# sourceMappingURL=pages-albums-albums-module-es5.js.map