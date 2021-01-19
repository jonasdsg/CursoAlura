import { Photo } from './photo';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
const URL:string = 'http://localhost:3000';

@Injectable({
    providedIn: 'root'
})
export class PhotoService{

    constructor(private http:HttpClient){}

    listFromUser(userName:string):Observable<Photo[]>{
       return this.http.get<Photo[]>(`${URL}/${userName}/photos`);
    }

    listFromUserPaginated(userName:string,page:number):Observable<Photo[]>{
        const params = new HttpParams().append('page',page.toString());
        return this.http.get<Photo[]>(`${URL}/${userName}/photos`,{params});
     }
}