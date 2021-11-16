class Students{

    stdId:number;
    stdName:string;
    stdClass:number;

    constructor(stdId:number , stdName:string , stdClass:number){
        this.stdId=stdId;
        this.stdName=stdName;
        this.stdClass=stdClass;
    }

    display(){
        console.log(this.stdId);
        console.log(this.stdName);
        console.log(this.stdClass);
    }

}

var s=new Students(1,"Khadyothi",10);
s.display();

var s1=new Students(2,"Manichandana",10);
s1.display();
