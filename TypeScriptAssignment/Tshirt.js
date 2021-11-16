var Tshirt = /** @class */ (function () {
    function Tshirt(color, material, design) {
        this.color = color;
        this.material = material;
        this.design = design;
    }
    Tshirt.prototype.small = function (size) {
        console.log(this.size);
    };
    Tshirt.prototype.large = function (size) {
        console.log(this.size);
    };
    Tshirt.prototype.XtraLarge = function (size) {
        console.log(this.size);
    };
    Tshirt.prototype.display = function () {
        console.log(this.color);
        console.log(this.material);
        console.log(this.design);
        //console.log(this.size);
    };
    return Tshirt;
}());
var t = new Tshirt("Black", "cotton", "dfl");
t.display();
t.small("small");
var t1 = new Tshirt("White", "cotton", "dfl");
t1.display();
t1.large("large");
var t2 = new Tshirt("Grey", "cotton", "dfl");
t.display();
t.XtraLarge("XtraLarge");
