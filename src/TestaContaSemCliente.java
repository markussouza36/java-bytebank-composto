
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDoNicoSteppat = new Conta();
		System.out.println(contaDoNicoSteppat.getSaldo());
		
		contaDoNicoSteppat.titular = new Cliente();
		System.out.println(contaDoNicoSteppat.titular);
		
		contaDoNicoSteppat.titular.nome = "Nico";
		System.out.println(contaDoNicoSteppat.titular.nome);
		
	}

}
