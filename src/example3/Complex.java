package example3;

public final class Complex {
  private final double re;
  private final double im;

  public Complex(double re, double im) {
    this.re = re;
    this.im = im;
  }

  public double realPart() {
    return re;
  }

  public double imaginaryPart() {
    return im;
  }

  //  Обратите внимание, что имена методов
  // являются предлогами (такими, как plus (плюс)), а не командами (такими, как
  // add (сложить))
  public Complex plus(Complex c) {
    return new Complex(re + c.re, im + c.im);
  }

  public Complex minus(Complex c) {
    return new Complex(re - c.re, im - c.im);
  }

  public Complex times(Complex c) {
    return new Complex(re * c.re - im * c.im,
        re * c.im + im * c.re);
  }

  public Complex dividedBy(Complex c) {
    double tmp = c.re * c.re + c.im * c.im;
    return new Complex((re * c.re + im * c.im) / tmp,
        (im * c.re - re * c.im) / tmp);
  }

  public Complex power(int x) {
    Complex result = new Complex(re, im);
    for (int i = 0; i <= x; i++) {
      result = result.times(this);
    }
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof Complex)) {
      return false;
    }
    Complex с = (Complex) o;
    return Double.compare(с.re, re) == 0
        && Double.compare(с.im, im) == 0;
  }

  @Override
  public int hashCode() {
    return 31 * Double.hashCode(re) + Double.hashCode(im);
  }

  @Override
  public String toString() {
    return "(" + re + " + " + im + "i)";
  }
}