import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ordemNomes {

    public static void main(String []args){
        listaOrdemAlfabetica();
    }

    public static void listaOrdemAlfabetica(){
        System.out.println("---Lista de nomes em ordem alfabética---");
        List<String> lista = new LinkedList<String>();
        lista.add("Guilherme Murata");
        lista.add("Rebeca Silveira");
        lista.add("Lucas Batista");
        lista.add("Caue Saito");
        lista.add("Guilherme Mendes");
        lista.add("Daniel Bassoli");
        Collections.sort(lista);
        System.out.println(lista);
    }
}