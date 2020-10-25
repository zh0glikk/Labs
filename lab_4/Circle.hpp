#ifndef Circle_hpp
#define Circle_hpp

#include <cmath>
#include <iostream>

class Circle {
protected:
    double a;
public:
    Circle(double a = 1);
    virtual ~Circle();
    
    
    virtual double countLength();
    virtual double countSquare();
    virtual void view();
    
//    bool flag = false;
};

#endif /* Circle_hpp */
