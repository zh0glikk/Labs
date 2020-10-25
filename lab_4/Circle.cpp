#include "Circle.hpp"

Circle::Circle(double a) {
    this->a = a;
    std::cout << "Circle constructor" << std::endl;
}

Circle::~Circle() {
    std::cout << "Circle destructor" << std::endl;
}

double Circle::countLength() {
    return 2 * M_PI * this->a;
}

double Circle::countSquare() {
    return pow(this->a, 2) * M_PI;
}

void Circle::view() {
    std::cout << "Circle radius = " << this->a << std::endl;
}
