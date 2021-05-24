import { Injectable } from "@angular/core";
import { BehaviorSubject, of } from "rxjs";

@Injectable({
    providedIn: 'root'
})
export class CompoenentsService{
    private id:BehaviorSubject<number> = new BehaviorSubject<number>(-1);
    
    getIdNumber(){
        return this.id;
    }

    setIdNumber(id:number){
        this.id = new BehaviorSubject<number>(id);
    }
}