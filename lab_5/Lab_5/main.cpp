#include <iostream>
#include "Series/Series.hpp"
#include "Series/AriProg.hpp"
#include "Series/GeoProg.hpp"

//void foo(Series series) { //task3
//    series.getInfo();
//}

//void foo(Series* series) { //task3
//    series->getInfo();
//}

//void foo(Series& series) { //task3
//    series.getInfo();
//}

//void task1() {
//    Series series;
//    AriProg ariProg;
//    GeoProg geoProg;
//
//    series.getInfo();
//    ariProg.getInfo();
//    geoProg.getInfo();
//}
//
//void task2() {
//    Series* series = new Series();
//    Series* ariProg = new AriProg();
//    Series* geoProg = new GeoProg();
//
//    series->getInfo();
//    ariProg->getInfo();
//    geoProg->getInfo();
//}

//void task3() {
//    Series* series = new Series();
//    Series* geoProg = new GeoProg();
//
//    Series ser;
//    GeoProg geo;
//
//    foo(series); // полиморфизм работает только с указателями\ссылками
//    foo(geoProg);
//
//    foo(ser);   //с объектом не сработает ( будет вызываться только родительский метод)
//    foo(geo);
//}

void task4_5() {
//    Series* ser = new Series(); // нельзя ибо класс теперь абстрактный(ибо есть чисто виртуальная функция)
    AriProg* ariProg = new AriProg();
    GeoProg* geoProg = new GeoProg();
    int length = 2;
    
    Series* arr[2] = { ariProg, geoProg };
    
    for ( int i = 0; i < length; i++ ) {
        arr[i]->getInfo(); //все сработает, 
    }
    
    delete geoProg;
}

int main(int argc, const char * argv[]) {

    
//    task1();
    //task2();
//    task3();
    task4_5();
    
    return 0;
}
