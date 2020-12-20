package programa;

import entidade.PessoaFisica;
import entidade.PessoaJuridica;
import entidade.TaxaPagamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        List<TaxaPagamento> listaTaxa = new ArrayList<>();
        int n = ler.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Taxa de pagamento " + (i+1));
            System.out.print("Pessoa fisica ou Juridica (F/J)?: ");
            String letra = ler.next().toUpperCase();
            if (letra.equals("F")){
                System.out.print("Nome: ");
                ler.nextLine();
                String nome = ler.nextLine();
                System.out.print("Renda Anual: ");
                Double rendaAnual = ler.nextDouble();
                System.out.print("Gasto com saude?: ");
                Double gastoComSaude = ler.nextDouble();
                listaTaxa.add(new PessoaFisica(nome, rendaAnual, gastoComSaude));
            }else{
                System.out.print("Nome: ");
                ler.nextLine();
                String nome = ler.nextLine();
                System.out.print("Renda Anual: ");
                Double rendaAnual = ler.nextDouble();
                System.out.print("Quantos funcionarios tem a empresa?: ");
                Integer numeroDeFuncionario = ler.nextInt();
                listaTaxa.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionario));
            }
        }
        double soma = 0.0;
        System.out.println();
        for (TaxaPagamento tp : listaTaxa){
            double taxa = tp.taxa();
            System.out.println(tp.getNome() + " - $ " + String.format("%.2f",taxa));
            soma += taxa;
        }

        System.out.println();
        System.out.println("taxa Total: $ " + String.format("%.2f", soma));

        ler.close();


    }
}
