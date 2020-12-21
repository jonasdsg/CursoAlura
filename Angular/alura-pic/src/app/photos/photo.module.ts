import { HttpClientModule } from '@angular/common/http';
import { PhotoComponent } from './photo/photo.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { PhotoListComponent } from './photo-list/photo-list.component';
import { PhotoFormComponent } from './photo-form/photo-form.component';

@NgModule({
    declarations: [
        PhotoComponent,
        PhotoListComponent,
        PhotoFormComponent
    ],

    exports: [
        PhotoListComponent
    ],
    
    imports:[
        CommonModule,
        FormsModule,
        HttpClientModule,

    ]
})
export class PhotosModule{}