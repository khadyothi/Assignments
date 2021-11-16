var Product = /** @class */ (function () {
    function Product(proId, proName, proPrice) {
        this.ProId = proId;
        this.ProName = proName;
        this.ProPrice = proPrice;
    }
    Product.prototype.gst = function (a) {
        this.ProPrice = this.ProPrice + (a / 100 * this.ProPrice);
    };
    Product.prototype.display = function () {
        console.log(this.ProId);
        console.log(this.ProName);
        console.log(this.ProPrice);
    };
    return Product;
}());
var p = new Product(1, "Mobile", 20000);
p.gst(10);
p.display();
