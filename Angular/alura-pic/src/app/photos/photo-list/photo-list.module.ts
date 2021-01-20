import { CommonModule } from '@angular/common';
import { LoadButtonComponent } from './load-button/load-button.component';
import { FilterByDescription } from './filter-by-description.pipe';
import { PhotosComponent } from './photos/photos.component';
import { PhotoListComponent } from './photo-list.component';
import { NgModule } from '@angular/core';

@NgModule({
    declarations:[
        PhotoListComponent,
        PhotosComponent,
        FilterByDescription,
        LoadButtonComponent,
    ],

    exports:[
        PhotosComponent,
        FilterByDescription
    ],

    imports:[
        CommonModule
    ]
})
export class PhotoListModule{}