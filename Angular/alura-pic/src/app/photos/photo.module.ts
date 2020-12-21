import { HttpClientModule } from '@angular/common/http';
import { PhotoComponent } from './photo/photo.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { PhotoListComponent } from './photo-list/photo-list.component';

@NgModule({
    declarations: [
        PhotoComponent,
        PhotoListComponent
    ],

    exports: [
        PhotoComponent
    ],
    
    imports:[
        CommonModule,
        FormsModule,
        HttpClientModule,

    ]
})
export class PhotosModule{}