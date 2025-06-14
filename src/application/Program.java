package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Digite a quantidade de funcionário: ");
		int numeroFuncionarios = entrada.nextInt();
		
		for(int i = 1;i <= numeroFuncionarios;i++) {
			System.out.print("Digite os dados do "+numeroFuncionarios+"º funcionário: ");
			System.out.print("O funcionário é terceirizado?(y/n): ");
			char tipoFuncionario = entrada.next().charAt(0);
			
			System.out.println("Nome: ");
			entrada.nextLine();
			String nome = entrada.nextLine();
			
			System.out.print("Horas: ");
			int horas = entrada.nextInt();
			
			System.out.print("Valor por hora: ");
			double valorPorHora = entrada.nextDouble();
			
			if(tipoFuncionario == 'y') {
				System.out.print("Taxa adicional: ");
				double taxaAdicional = entrada.nextDouble();
				
				//Funcionario funcionario = new FuncionarioTerceirizado(nome, horas, valorPorHora, taxaAdicional);
				list.add(new FuncionarioTerceirizado(nome, horas, valorPorHora, taxaAdicional));
			}
			else {
				//Funcionario funcionario = new Funcionario(nome, horas, valorPorHora);
				list.add(new Funcionario(nome, horas, valorPorHora));
			}
			
		}
		
		System.out.println();
		System.out.println("Pagamentos:");
		for(Funcionario func : list) {
			System.out.println(func.getNome() + " - R$ " + String.format("%.2f", func.Pagamento()));
		}
		
		entrada.close();
	}
}