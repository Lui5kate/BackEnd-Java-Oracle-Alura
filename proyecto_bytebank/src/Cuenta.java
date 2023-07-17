// entidad cuenta:
class Cuenta {
	private double saldo;
	private int agencia;
	int numero;
	// Creamos un objeto para referenciar la clase Cliente
	// Inicializamos la referencia titular del objeto Cliente
	private Cliente titular = new Cliente();
	// La variable total no es de la instancia y no es alterada por ella, es de la clase
	public static int total = 0;
	
	// esto es un constructor, los constructores se utilizan para inicializar los atributos
	public Cuenta(int agencia) {
		if (agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Se van creando: " + total + " cuentas");
	}

	// public es un modificador de acceso
	public void depositar(double valor) { //Esto es un método, void => no retorna nada
		this.saldo += valor;
		// this (apunta a un objeto) es para referirse al atributo saldo del objeto
		// Sin el this, se trata de la variable de entrada
	}
	// retorna un booleano
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;			
		}
		return false;
	}
	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	public double getSaldo() {
		return this.saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Cuenta.total;
	}
}