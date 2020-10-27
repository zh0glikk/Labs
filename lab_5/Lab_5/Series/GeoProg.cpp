#include "GeoProg.hpp"

GeoProg::GeoProg(double first, double step, int size) : Series(first, step, size) {}

GeoProg::~GeoProg() {
        std::cout << "GeoProg::~GeoProg()" << std::endl;
}

double GeoProg::getElement(int index) {
    double element = this->first * pow(this->step, index-1);
    return element;
}

double GeoProg::getSum() {
    return this->first * ( 1 - pow(this->step, this->size) / (1 - this->step));
}
