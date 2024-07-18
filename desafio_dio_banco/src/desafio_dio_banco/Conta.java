package desafio_dio_banco;

public abstract class Conta implements IConta {
	
	private static final int agencia_padrao = 1;
	private static int sequencial = 1;//uma constante criada.
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.agencia_padrao;
		this.numero = sequencial++;//com ++, ela vai somando conforme as contas criadas 1, 2, 3...
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		if (valor >= 10) {
			saldo += valor;
		} else {
			System.out.println("Deposito minimo de R$ 10,00 necessario para ativar a conta");
		}
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);//objeto de origem para sacar e transferir
		contaDestino.depositar(valor);//objeto de destino para receber o valor de origem
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	protected void imprimirInfoComuns() {
		System.out.println();
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println();
	}

}
