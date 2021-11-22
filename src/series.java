import java.util.Objects;
import java.util.Scanner;

public class series {
    String titulo;
    String nomeSerie;
    Double numeros;
    Scanner tc = new Scanner(System.in);

    public void ler(){
        System.out.println("Digite o nome da serie:");
        titulo =tc.next();
        System.out.println("Digite o numero de temporadas:");
        numeros =tc.nextDouble();
        System.out.println("Digite o numero de episodios:");
        numeros =tc.nextDouble();
        System.out.println("Digite a sinopse:");
        titulo =tc.next();
    }
    public series(){
        System.out.println("digite nome da serie:");
        nomeSerie =tc.next();
        System.out.println("Digite o numero de temporadas:");
        numeros =tc.nextDouble();
        System.out.println("Digite o numero de episodios:");
        numeros =tc.nextDouble();
        System.out.println("Digite a sinopse:");
        titulo =tc.next();
        System.out.println("Já foi vista? (sim ou não):");
        titulo =tc.next();
    }
    public void mostrar(){
        System.out.println("Nome da serie cadastrada: "+this.nomeSerie);
        System.out.println("Quantidade de episodios: "+this.numeros);
        System.out.println("-------------------");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        series series = (series) o;
        return Objects.equals(titulo, series.titulo) && Objects.equals(numeros, series.numeros) && Objects.equals(tc, series.tc);
    }

}
