import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int op=0;
        
        ArrayList<series> arraySeries= new ArrayList<>();
        Scanner tc = new Scanner(System.in);

        do{
            System.out.println("1:Adicionar série nova");
            System.out.println("2:Exibir series cadastradas");
            System.out.println("3:Encontrar serie");
            System.out.println("4:Exibir quantidade de series cadastradas");
            op=tc.nextInt();

            switch (op){
                case 1: {
                    series series= new series();
                    if (arraySeries.add(series)){
                        System.out.println("serie cadastrada!");
                        series.mostrar();
                    }else{
                        System.out.println("serie não cadastrada! :( ");
                    }
                    break;
                }
                case 2:{
                    if (arraySeries.isEmpty()){
                        System.out.println("nenhuma serie cadastrada!");
                    }else{
                        int i;
                        for (i=0; i < arraySeries.size(); i++)
                        System.out.println(arraySeries.get(i).nomeSerie);
                    }
                    break;
                }
                case 3:{
                   // String serie=tc.next();
                    series busca = new series();
                    if(arraySeries.contains(busca)){
                        System.out.println("Serie já cadastrada!");
                        System.out.println("Posição:"+arraySeries.indexOf(busca));
                    }else{
                        System.out.println("Série não encontrada!");
                    }
                    break;
                }
                case 4:{
                    System.out.println(arraySeries.size());
                }
            }
        }while(op!=99);
    }
}
