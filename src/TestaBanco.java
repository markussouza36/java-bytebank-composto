
public class TestaBanco {

	public static void main(String[] args) {
		Cliente nico = new Cliente();
		nico.nome = "Nico Steppat";
		nico.cpf = "333.222.111-44";
		nico.profissao = "Desenvolvedor";
		
		Conta contaDoNico = new Conta();
		contaDoNico.deposita(200);
		
		//associa a cliente Nico a conta contaDoNico
		contaDoNico.titular = nico;
		
	    System.out.println(contaDoNico.titular.nome);
	    System.out.println(contaDoNico.titular);
	    System.out.println(nico);
	}
	
}
