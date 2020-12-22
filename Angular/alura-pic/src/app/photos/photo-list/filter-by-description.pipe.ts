import { Pipe, PipeTransform } from '@angular/core';

@Pipe({ name: 'filterByDescription'})
export class FilterByDescription implements PipeTransform {
    transform(value: any, ...args: any[]) {
        throw new Error('Method not implemented.');
    }
}