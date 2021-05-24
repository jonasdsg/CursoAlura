import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { ComponentOne } from './component-1.component';

@NgModule({
    declarations:[ComponentOne],
    imports:[CommonModule],
    exports:[ComponentOne]
})
export class ComponentOneModule {}