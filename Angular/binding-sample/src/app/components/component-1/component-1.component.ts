import { Component, OnInit } from "@angular/core";
import { Observable } from "rxjs";
import { CompoenentsService } from "../components-service";
@Component({
    templateUrl:'component-1.component.html'
})
export class ComponentOne implements OnInit{
    id$!:Observable<number>;
    constructor(private componentsService:CompoenentsService){}
    
    ngOnInit(): void {
        this.id$ = this.componentsService.getIdNumber();
    }
}