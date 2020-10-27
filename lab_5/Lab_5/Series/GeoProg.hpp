#ifndef GeoProg_hpp
#define GeoProg_hpp

#include "Series.hpp"
#include "cmath"

class GeoProg : public Series {
public:
    GeoProg(double first = 1, double step = 2, int size = 5);
    ~GeoProg();
    
    virtual double getElement(int index);   //task2,3,4
    virtual double getSum();    //task2,3,4
    
//    double getElement(int index); //task1
//    double getSum();  //task1
};

#endif /* GeoProg_hpp */
