import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import { ComponentTwo } from './component-2.component';

@NgModule({
    declarations:[ComponentTwo],
    imports:[CommonModule],
    exports:[ComponentTwo]
})
export class ComponentTwoModule {}