import { Component } from "@angular/core";
import { CompoenentsService } from "../components-service";

@Component({
    templateUrl: 'component-2.component.html'
})
export class ComponentTwo{
    constructor(private componentsService:CompoenentsService){}
    
    finish(id:string){
        console.log(id)
        this.componentsService.setIdNumber(Number(id));
    }
}