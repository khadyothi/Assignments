import {Car} from './Car';
class Truck extends Car{

    weight:number;

    constructor(speed:number , regularPrice:number , color:string){
        super(speed,regularPrice,color);
    }

    getSalePrice(weight:number){
        if(Math.max(weight,2000)){
            this.salePrice=this.regularPrice-(10/100*this.regularPrice);
        }
        else{
            this.salePrice=this.regularPrice-(20/100*this.regularPrice);
        }

    }


}

var t=new Truck(100,200000,"Black");
t.getSalePrice(2000);
t.display();