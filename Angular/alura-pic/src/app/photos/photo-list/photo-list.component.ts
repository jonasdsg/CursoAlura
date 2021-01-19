import { PhotoService } from './../photo/photo.service';
import { Photo } from './../photo/photo';
import { Component, OnDestroy, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subject } from 'rxjs';
import { debounceTime } from 'rxjs/operators';

@Component({
  selector: 'ap-photo-list',
  templateUrl: './photo-list.component.html',
  styleUrls: ['./photo-list.component.css']
})
export class PhotoListComponent implements OnInit, OnDestroy {

  public photos:Photo[] = [];
  public debounce:Subject<string> = new Subject<string>();
  public filtro:string = '';

  constructor(
    private activatedRoute:ActivatedRoute
    ){}

  ngOnDestroy(): void {
    this.debounce.unsubscribe();
  }
  
  ngOnInit(): void {
   this.photos = this.activatedRoute.snapshot.data['photos'];
   this.debounce
   .pipe(debounceTime(300))
   .subscribe(filtro => this.filtro = filtro)
   ;
  }

}
