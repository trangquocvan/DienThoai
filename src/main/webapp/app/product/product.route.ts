import { Routes } from '@angular/router';

import {
    productDetailRoute
} from './';

const Product_Route = [
    productDetailRoute
];

export const ProductState: Routes = [{
    path: '',
    children: Product_Route
}];
