class Product{

    ProId:number;
    ProName:string;
    ProPrice:number;

    constructor(proId:number , proName:string , proPrice:number){

        this.ProId=proId;
        this.ProName=proName;
        this.ProPrice=proPrice;

    }

    gst(a:number){

        this.ProPrice=this.ProPrice+(a/100*this.ProPrice);
    }

    display(){

        console.log(this.ProId);
        console.log(this.ProName);
        console.log(this.ProPrice);
    }
}

var p=new Product(1,"Mobile",20000);
p.gst(10);
p.display();