import { Component, OnInit} from "@angular/core";
import {Pro} from './pro';
@Component({
    selector:"app-Listofproducts",
    templateUrl:"./Listofproducts.html"
})

export class Listofproducts implements OnInit{
    ngOnInit(): void {
        throw new Error("Method not implemented.");
    }
    products=[
        new Pro(1,"Laptop",50000),
        new Pro(2,"Iphone",70000)
    ];
}