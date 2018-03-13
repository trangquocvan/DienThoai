import { Route } from '@angular/router';
import { DetailComponent } from './detail.component';
export const productDetailRoute: Route = {
    path: 'product-detail',
    component: DetailComponent,
    data: {
        authorities: []
    }
};