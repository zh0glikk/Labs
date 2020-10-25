#include "Ellipse.hpp"

Ellipse::Ellipse(double a, double b) : Circle(a){
    this->b = b;
    std::cout << "Ellipse constructor with parametrs" << std::endl;
}

Ellipse::Ellipse() {
    this->a = 1;
    this->b = 2;
    std::cout << "Ellipse constructor default" << std::endl;
}

Ellipse::~Ellipse() {
    std::cout << "Ellipse destructor" << std::endl;
}

double Ellipse::countLength() {
    return M_PI * (this->a + this->b);
}

double Ellipse::countSquare() {
    return M_PI * this->a * this->b;
}

void Ellipse::view() {
    std::cout << "Ellipse minor semiaxis = " << this->a << std::endl;
    std::cout << "Ellipse major semiaxis = " << this->b << std::endl;
}
