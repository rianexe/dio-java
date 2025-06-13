public class Mensagem {
    //Desenvolvimento de métodos para um sistema de Mensagens
    public static void obterMensagem(int hora){

        switch(hora){
            case 5:
            case 6:
            case 7:        
            case 8:
            case 9:
            case 10:
            case 11:
                bomDia();
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                boaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                boaNoite();
                break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                dormir();
                break;
            default: 
                System.out.println("Valor inválido.");
        }  
    }

    public static void bomDia(){
        System.out.println("Bom dia!");
    }

    public static void boaTarde(){
        System.out.println("Boa tarde!");
    }

    public static void boaNoite(){
        System.out.println("Boa noite!");
    }

    public static void dormir(){
        System.out.println("Hora de dormir...");
    }


}  

