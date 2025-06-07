public class Case {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicios com Case");

        //Dias da semana
    /* 
        String dia ="sexta";

        switch(dia){
            case "domingo":
                System.out.println("1");
                break;
            case "segunda":
                System.out.println("2");
                break;
            case "terca":
                System.out.println("3");
                break;
            case "quarta":
                System.out.println("4");
                break;
            case "quinta":
                System.out.println("5");
                break;
            case "sexta":
                System.out.println("6");
                break;
            case "sabado":
                System.out.println("7");
                break;
            default:
                System.out.println("Dia inexistente");
                break;
        }
    */

        //Numeros

        int num = 3;

        switch(num){
            case 1:           
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido.");
        }

    }
}

