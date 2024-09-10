/**
 * Sample Line Problem. This exercise is similar to previous exercise Linea
 * You must obtain minimum 75%
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
class Line {

    /**Coordenada X del punto mas a la izquierda o punto inicial*/
    //COMPLETE
    /**Coordenada Y del punto mas a la izquierda o punto inicial*/
    //COMPLETE
    /**Coordenada X del punto mas a la derecha o punto final*/
    //COMPLETE
    /**Coordenada Y del punto mas a la derecha o punto final*/
    //COMPLETE

    /**Default Constructor*/
    public Line() 
    {
        //COMPLETE  
    }

        /**
     * Constructor con parametros.
     * Debe ordenar las coordenadas recibidas
     */
    public Line(double x1, double y1, double x2, double y2) 
    {
        //COMPLETE
    }

    /**Retorna true si la linea se encuentra en el primer cuadrante*/
    public boolean isOnFirstQuadrant()       
    {
        //COMPLETE
    }//fin isOnFirstQuadrant

    /**Retorna true si la linea se encuentra en el segundo cuadrante*/
    public boolean isOnSecondQuadrant() 
    {
        //COMPLETE
    }//fin isOnSecondQuadrant

    /**Retorna true si la linea se encuentra en el tercer cuadrante*/
    public boolean isOnThirdQuadrant() 
    {
        //COMPLETE
    }//fin isOnThirdQuadrant

    /**Retorna true si la linea se encuentra en el cuarto cuadrante*/
    public boolean isOnFourthQuadrant() 
    {
        //COMPLETE
    }//fin isOnFourthQuadrant

    double getPendiente()
    {
        //COMPLETE
    }

    double getIntersecto()
    {
       //COMPLETE
    }

    /**Retorna la cantidad de cuadrantes por donde pasa la linea: 1, 2  o 3*/
    public int getQuadrants() 
    {
       //COMPLETE
    }//fin getQuadrants

    /**Mueve la linea horizontalmente hacia la derecha*/
    public void moveRight(int d)
    {
       //COMPLETE
    }

    /**Mueve la linea horizontalmente hacia la izquierda*/
    public void moveLeft(int d)
    {
       //COMPLETE
    }

    /**Mueve la linea verticalmente hacia arriba*/
    public void moveUp(int d)
    {
       //COMPLETE
    }

    /**Mueve la linea verticalmente hacia abajo*/
    public void moveDown(int d)
    {
        //COMPLETE
    }

    //COMPLETE GET y SET
}
