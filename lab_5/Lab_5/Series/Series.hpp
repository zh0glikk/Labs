#ifndef Series_hpp
#define Series_hpp

#include <iostream>

class Series {
protected:
    double first;
    double step;
    int size;
public:
    Series(double first = 1, double step = 2, int size = 5);
    virtual ~Series();
    
//    double getElement(int index);  //task1
//    double getSum();  //task1
    
//    virtual double getElement(int index);   //task2, task3
//    virtual double getSum();    //task2, task3
    
    virtual double getElement(int index) = 0;   //task4
    virtual double getSum() = 0;    //task4
    
    void getInfo();
};

#endif /* Series_hpp */
