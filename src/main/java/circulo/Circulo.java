package circulo;

import exceptionsPersonalizadas.DataException;

/**
 * Crea objetos "Círculo" que almacena el radio de este y posibilita varias operaciones.
 * Para su construccion requiere del atributo "radio"
 */
public class Circulo {
    // Atributos
    private int radio;

    // Constructores

    /**
     * Crea un objeto "Circulo" con el parametro introducido.
     *
     * @param radio int
     */
    public Circulo(int radio) {
        this.radio = radio;
    }

    // Getters & Setters

    /**
     * Devuelve el radio del círculo.
     *
     * @return int
     */
    public int getRadio() {
        return radio;
    }

    /**
     * Si el radio es menor a 0 ocurre una excepción.
     *
     * @param radio int
     */
    public void setRadio(int radio) {
        try {
            if (radio >= 0) {
                this.radio = radio;
            } else {
                throw new DataException();
            }
        } catch (DataException de) {
            System.out.println("Error: " + de.getMessage());
        }
    }

    // Metodos

    // longitud

    /**
     * Calcula la longitud del círculo aplicando la formula "2 * Pi * radio".
     *
     * @return longitud - double
     */
    public double longitud() {
        return 2 * Math.PI * radio;
    }

    // superficie

    /**
     * Calcula la superficie del círculo aplicando la formula "Pi * radio^2".
     *
     * @return longitud - double
     */
    public double superficie() {
        return Math.PI * Math.pow(radio, 2);
    }

    // diametro

    /**
     * Calcula el diametro del círculo aplicando la formula "2 * radio".
     *
     * @return diametro - int
     */
    public int diametro() {
        return 2 * radio;
    }

    // cuartaParteSuperficie50

    /**
     * Si la cuarta de la superficie del círculo es mayor a 50 devuelve "true", si no es así, devuelve "false".
     *
     * @return boolean
     */
    public boolean cuartaParteSuperficie50() {
        return superficie() / 4 > 50;
    }

}
