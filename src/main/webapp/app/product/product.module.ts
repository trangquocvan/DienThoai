import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { MofSharedModule } from '../shared';
import { DetailComponent } from './detail/detail.component';

import {
    ProductState
} from './';

@NgModule({
    imports: [
        MofSharedModule,
        RouterModule.forChild(ProductState)
    ],
    declarations: [
        DetailComponent
    ],
    providers: [
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class MofProductModule { }
