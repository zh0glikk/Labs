#ifndef Ellipse_hpp
#define Ellipse_hpp

#include "Circle.hpp"

class Ellipse : public Circle {
private:
    double b;
public:
    Ellipse(double a, double b);
    Ellipse();
    virtual ~Ellipse();
    
    double countLength();
    double countSquare();
    void view();
};

#endif /* Ellipse_hpp */
