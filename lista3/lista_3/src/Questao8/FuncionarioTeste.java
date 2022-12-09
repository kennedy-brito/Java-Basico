package Questao8;

public class FuncionarioTeste {
    
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        
        funcionario1.setNome("willian kennedy");
        funcionario1.setCPF("040.155.626-18");
        funcionario1.setMatricula("001554888");
        funcionario1.setSalario(3000);
        funcionario1.setAdmissao(2, 6, 2006);
        
        System.out.println("Funcionário: " + funcionario1.getNome());
        System.out.println("Matrícula:" + funcionario1.getMatricula());
        System.out.println("CPF: " + funcionario1.getCPF());
        System.out.print("Entrou em "); funcionario1.getAdmissao();
        System.out.println("Ganho Bruto anual: R$" + funcionario1.calcularGanhoBrutoAnual());
        System.out.println("Imposto: R$" + funcionario1.calcularImposto());
        System.out.println("Ganho Liquido Mensal: R$" + funcionario1.calcularGanhoLiquidoAnual());
        System.out.println("Ganho Liquido Anual: R$" + funcionario1.calcularGanhoLiquidoAnual());
        funcionario1.receberAumento(10);
        System.out.println("Com um aumento de 10% seu salario passará a ser R$" + funcionario1.getSalario());
    }
}
