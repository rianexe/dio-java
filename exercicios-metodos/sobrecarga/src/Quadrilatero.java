public class Quadrilatero{
    //Utilizando sobrecarga de método
    public static double area(double lado){
        return lado * lado;
    }

    public static double area(double lado1, double lado2){
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static float area(float diagonal1, float diagonal2){          //não pode ser utilizado o double, pois já temos um método que possui dois double como parametros
        return (diagonal1 * diagonal2) / 2;
    }
}
