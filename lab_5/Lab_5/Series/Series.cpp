#include "Series.hpp"

Series::Series(double first, double step, int size) :
    first(first),
    step(step),
    size(size)
    {}

Series::~Series() {
    std::cout << "Series::~Series()" << std::endl;
}

double Series::getElement(int index) {
    int element = this->first * index;
    return element;
}

double Series::getSum() {
    double last = (this->first + (this->size - 1) * this->step);
    return (this->first + last) / 2 * this->size;
}

void Series::getInfo() {
    std::cout << this->getElement(4) << std::endl;
    std::cout << this->getSum() << std::endl;
}
