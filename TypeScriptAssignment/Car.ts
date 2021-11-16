export class Car{

    speed:number;
    regularPrice:number;
    color:string;
    salePrice:number;

    constructor(speed:number, regularPrice:number ,color:string ){
        this.speed=speed;
        this.regularPrice=regularPrice;
        this.color=color;
    }

    getSalePrice(gst:number){

        this.salePrice=this.regularPrice+(gst/100*this.regularPrice);
    }

    display(){
        console.log(this.speed);
        console.log(this.regularPrice);
        console.log(this.color);
        console.log(this.salePrice);

    }

}