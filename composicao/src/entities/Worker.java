package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	// Declarando as associa��es (composi��es)
	private Department department; // Indica que 1 Worker tem um Department
	private List<HourContract> contracts = new ArrayList<>(); // Indica que um trabalhador tem (ou pode ter) v�rios contratos
	// OBS: Quando tiver uma composi��o do tipo 'tem muitos' (que no caso � uma lista) voc� n�o � inclui no constructor, simplesmente inicia a lista vazia
	
	// Declarando um construtor vazio
	public Worker() {}
	
	// Declarando um construtor com argumentos
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	// Declarando os Getters e Setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public WorkerLevel getLevel() {
		return level;
	}
	
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	
	public Double getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDeparment(Department department) {
		this.department = department;
	}
	
	public List<HourContract> getContracts() {
		return contracts;
	}
	
	// Implementando os m�todos
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) { // Calcula quanto a pessoa ganhou em determinado m�s de um ano
		double sum = baseSalary;
		Calendar calendar = Calendar.getInstance();
		
		// Percorrendo os contratos do funcion�rio para saber qual contrato � de determinado m�s
		for (HourContract contract : contracts) {
			calendar.setTime(contract.getDate());
			int contract_year = calendar.get(Calendar.YEAR);
			int contract_month = 1 + calendar.get(Calendar.MONTH);
			
			if (year == contract_year && month == contract_month) {
				sum += contract.totalValue();
			}
		}
		return sum;
	}

}
