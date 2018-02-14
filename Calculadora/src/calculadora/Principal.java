/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    protected float x;
    private float y;
    private float z;

    void sumar() {

        z = x + y;
    }

    void restar() {
        if (x < y) {
            float a;
            a = x;
            x = y;
            y = a;

            z = x - y;
        }
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

}
