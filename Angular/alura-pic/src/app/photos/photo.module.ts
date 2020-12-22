import { FilterByDescription } from './photo-list/filter-by-description.pipe';
import { HttpClientModule } from '@angular/common/http';
import { PhotoComponent } from './photo/photo.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { PhotoListComponent } from './photo-list/photo-list.component';
import { PhotoFormComponent } from './photo-form/photo-form.component';
import { PhotosComponent } from './photo-list/photos/photos.component';

@NgModule({
    declarations: [
        PhotoComponent,
        PhotoListComponent,
        PhotoFormComponent,
        PhotosComponent,
        FilterByDescription
    ],

    exports: [
        PhotoListComponent,
        FilterByDescription
    ],
    
    imports:[
        CommonModule,
        FormsModule,
        HttpClientModule,

    ]
})
export class PhotosModule{}