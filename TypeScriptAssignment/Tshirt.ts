class Tshirt{

    color:string;
    material:string;
    design:string;
    size:string;

    constructor(color:string , material:string , design:string){

        this.color=color;
        this.material=material;
        this.design=design;
    }

    small(size:string){
        console.log(this.size);
    }

    large(size:string){
        console.log(this.size);
    }

    XtraLarge(size:string){
        console.log(this.size);
    }

    display(){
        console.log(this.color);
        console.log(this.material);
        console.log(this.design);
        //console.log(this.size);
    }

}

var t=new Tshirt("Black","cotton","dfl");
t.display();
t.small("small");

var t1=new Tshirt("White","cotton","dfl");
t1.display();
t1.large("large");

var t2=new Tshirt("Grey","cotton","dfl");
t.display();
t.XtraLarge("XtraLarge");
