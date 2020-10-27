#ifndef AriProg_hpp
#define AriProg_hpp

#include "Series.hpp"

class AriProg : public Series {
public:
    AriProg(double first = 1, double step = 2, int size = 5);
    ~AriProg();
    
    virtual double getElement(int index);   //task2,3,4
    virtual double getSum();    //task2,3,4
    
//    double getElement(int index); //task1
//    double getSum();  //task1
};

#endif /* AriProg_hpp */
