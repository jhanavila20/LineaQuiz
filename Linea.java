**
 * Sample Line Problem. This exercise is similar to previous exercise Linea
 * You must obtain minimum 75%
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
class Line {

    /**Coordenada X del punto mas a la izquierda o punto inicial*/
    double startX;//COMPLETE
    /**Coordenada Y del punto mas a la izquierda o punto inicial*/
    double startY;//COMPLETE
    /**Coordenada X del punto mas a la derecha o punto final*/
    double endX;//COMPLETE
    /**Coordenada Y del punto mas a la derecha o punto final*/
    double endY;//COMPLETE

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
        this.startX = x1;
        this.startY = y1;
        this.endX = x2;
        this.endY = y2;
        //COMPLETE
    }

    /**Retorna true si la linea se encuentra en el primer cuadrante*/
    public boolean isOnFirstQuadrant()       
    {
        return false;
    }//fin isOnFirstQuadrant

    /**Retorna true si la linea se encuentra en el segundo cuadrante*/
    public boolean isOnSecondQuadrant() 
    {
        return false;//COMPLETE
    }//fin isOnSecondQuadrant

    /**Retorna true si la linea se encuentra en el tercer cuadrante*/
    public boolean isOnThirdQuadrant() 
    {
        return false;//COMPLETE
    }//fin isOnThirdQuadrant

    /**Retorna true si la linea se encuentra en el cuarto cuadrante*/
    public boolean isOnFourthQuadrant() 
    {
        return false;
    }//fin isOnFourthQuadrant

    double getPendiente()
    {
        double pendiente;
        if (endX - startX == 0) {
            pendiente = 0;
        }
        else{
           pendiente = (endY - startY) / (endX - startX);
        }
        
        return pendiente;//COMPLETE
    }

    double getIntersecto()
    {
       double intersectoY;
        if ((getPendiente()==0)) {
            intersectoY = 0; 
        }
        else {
            intersectoY = startY - getPendiente() * startX;
        }
        
        return intersectoY;//COMPLETE
    }

    /**Retorna la cantidad de cuadrantes por donde pasa la linea: 1, 2  o 3*/
    public int getQuadrants() 
    {
       int cuadrantes = 0;
        if (isOnFirstQuadrant()) cuadrantes++;
        if (isOnSecondQuadrant()) cuadrantes++;
        if (isOnThirdQuadrant()) cuadrantes++;
        if (isOnFourthQuadrant()) cuadrantes++;
        return cuadrantes;//COMPLETE
    }//fin getQuadrants

    /**Mueve la linea horizontalmente hacia la derecha*/
    public void moveRight(int d)
    {
       this.startX += d;
       this.endX += d;//COMPLETE
    }

    /**Mueve la linea horizontalmente hacia la izquierda*/
    public void moveLeft(int d)
    {
       this.startX -= d;
       this.endX -= d;//COMPLETE
    }

    /**Mueve la linea verticalmente hacia arriba*/
    public void moveUp(int d)
    {
       this.startY += d;
       this.endY += d;//COMPLETE
    }

    /**Mueve la linea verticalmente hacia abajo*/
    public void moveDown(int d)
    {
        this.startY -= d;
       this.endY -= d;//COMPLETE
    }

    //COMPLETE GET y SET

//Start GetterSetterExtension Source Code

    /**GET Method Propertie startX*/
    public double getStartX(){
        return this.startX;
    }//end method getStartX

    /**SET Method Propertie startX*/
    public void setStartX(double startX){
        this.startX = startX;
    }//end method setStartX

    /**GET Method Propertie startY*/
    public double getStartY(){
        return this.startY;
    }//end method getStartY

    /**SET Method Propertie startY*/
    public void setStartY(double startY){
        this.startY = startY;
    }//end method setStartY

    /**GET Method Propertie endX*/
    public double getEndX(){
        return this.endX;
    }//end method getEndX

    /**SET Method Propertie endX*/
    public void setEndX(double endX){
        this.endX = endX;
    }//end method setEndX

    /**GET Method Propertie endY*/
    public double getEndY(){
        return this.endY;
    }//end method getEndY

    /**SET Method Propertie endY*/
    public void setEndY(double endY){
        this.endY = endY;
    }//end method setEndY

//End GetterSetterExtension Source Code


}//End class
