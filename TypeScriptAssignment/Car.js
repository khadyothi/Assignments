"use strict";
exports.__esModule = true;
exports.Car = void 0;
var Car = /** @class */ (function () {
    function Car(speed, regularPrice, color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    Car.prototype.getSalePrice = function (gst) {
        this.salePrice = this.regularPrice + (gst / 100 * this.regularPrice);
    };
    Car.prototype.display = function () {
        console.log(this.speed);
        console.log(this.regularPrice);
        console.log(this.color);
        console.log(this.salePrice);
    };
    return Car;
}());
exports.Car = Car;
