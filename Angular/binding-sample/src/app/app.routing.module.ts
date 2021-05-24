import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ComponentOne } from './components/component-1/component-1.component';
import { ComponentTwo } from './components/component-2/component-2.component';

const routes:Routes = [
    {
        path: 'component-one',
        component: ComponentOne
    },
    {
        path: 'component-two',
        component: ComponentTwo
    }
];

@NgModule({
    imports:[
        RouterModule.forRoot(routes)
    ],
    exports:[RouterModule]
})
export class AppRoutingModule{}