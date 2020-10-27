#include "AriProg.hpp"

AriProg::AriProg(double first, double step, int size) : Series(first, step, size) {}

AriProg::~AriProg() {
    std::cout << "AriProg::~AriProg()" << std::endl;
}

double AriProg::getElement(int index) {
    double element = this->first + (index - 1) * this->step;
    return element;
}

double AriProg::getSum() {
    double last = (this->first + (this->size - 1) * this->step);
    return (this->first + last) / 2 * this->size;
}
