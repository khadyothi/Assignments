"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var Car_1 = require("./Car");
var Truck = /** @class */ (function (_super) {
    __extends(Truck, _super);
    function Truck(speed, regularPrice, color) {
        return _super.call(this, speed, regularPrice, color) || this;
    }
    Truck.prototype.getSalePrice = function (weight) {
        if (Math.max(weight, 2000)) {
            this.salePrice = this.regularPrice - (10 / 100 * this.regularPrice);
        }
        else {
            this.salePrice = this.regularPrice - (20 / 100 * this.regularPrice);
        }
    };
    return Truck;
}(Car_1.Car));
var t = new Truck(100, 200000, "Black");
t.getSalePrice(2000);
t.display();
