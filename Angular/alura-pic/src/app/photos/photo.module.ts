import { PhotoComponent } from './photo/photo.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@NgModule({
    declarations: [
        PhotoComponent
    ],

    exports: [
        PhotoComponent
    ],
    
    imports:[
        CommonModule,
        FormsModule
    ]
})
export class PhotosModule{}