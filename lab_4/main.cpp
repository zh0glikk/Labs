#include <iostream>
#include "Circle.hpp"
#include "Ellipse.hpp"

int main(int argc, const char * argv[]) {
    Circle* c = new Circle();
    Ellipse* e = new Ellipse();
    
    c->view();
    e->view();
  
    std::cout << "Circle length = " << c->countLength() << std::endl;
    std::cout << "Circle square = " << c->countSquare() << std::endl;
    std::cout << "Ellipse length = " << e->countLength() << std::endl;
    std::cout << "Circle square = " << e->countSquare() << std::endl;
    
//    std::cout << c->flag << std::endl;
//    std::cout << e->flag << std::endl;
    
    delete c;
    delete e;

    return 0;
}
