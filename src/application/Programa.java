package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <Contribuinte> contribuintes = new ArrayList<>();
		System.out.println("Quantidade de contribuintes:");
		int quantidade = sc.nextInt();
		Double totalImpostoPago=0.00;
		sc.nextLine();
		for(int i=0;i<quantidade;i++) {
			System.out.println("Contribuinte - "+(i+1));
			System.out.println("Tipo do contribuinte(F/J):");
			String tipoPessoa = sc.nextLine().toUpperCase();
			System.out.print("Nome:");
			String nomeContrabuinte = sc.nextLine();
			System.out.print("Renda anual: R$");
			Double rendaAnul = sc.nextDouble();
			if(tipoPessoa.charAt(0) == 'F') {
				System.out.println("Gastos com saúde: R$");
				Double gastoSaude = sc.nextDouble();
				PessoaFisica pessoaFisica = new PessoaFisica(nomeContrabuinte, rendaAnul, gastoSaude);
				contribuintes.add(pessoaFisica);
			}
			else {
				System.out.println("Qunatidade de funcionários:");
				Integer quantidadeFuncionario = sc.nextInt();
				PessoaJuridica pessoaJuridica = new PessoaJuridica(nomeContrabuinte, rendaAnul,quantidadeFuncionario);
				contribuintes.add(pessoaJuridica);
			}
			sc.nextLine();
		}
		System.out.println("\nDados dos contribuintes:\n");
		for(Contribuinte x: contribuintes) {
			System.out.println("Nome:"+x.getNomeContrbuinte());
			System.out.println("Imposto pago:"+String.format("%.2f",x.impostoAPagar()));
			totalImpostoPago+=x.impostoAPagar();
		}
		System.out.println("Total de imposto pago: R$"+String.format("%.2f",totalImpostoPago));
		sc.close();
	}

}
