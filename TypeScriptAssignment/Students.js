var Students = /** @class */ (function () {
    function Students(stdId, stdName, stdClass) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdClass = stdClass;
    }
    Students.prototype.display = function () {
        console.log(this.stdId);
        console.log(this.stdName);
        console.log(this.stdClass);
    };
    return Students;
}());
var s = new Students(1, "Khadyothi", 10);
s.display();
var s1 = new Students(2, "Manichandana", 10);
s1.display();
