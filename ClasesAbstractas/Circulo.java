package ClasesAbstractas;

public class Circulo extends Figura{
    private float radio;
    final private float PI= (float) 3.14;

    public Circulo (String color, float radio) {
        super (color);
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }
    @Override
    public float area() {
        return PI*radio*radio;
    }

    @Override
    public float perimetro() {
        return 2*PI*radio;
    }





}
