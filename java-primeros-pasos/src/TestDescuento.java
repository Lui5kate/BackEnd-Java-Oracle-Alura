
public class TestDescuento {

    public static void main(String[] args) {

    	double valorCompra = 1000.0;
    	boolean descuento10 = valorCompra >= 100 && valorCompra <= 199.99;
    	boolean descuento15 = valorCompra >= 200 && valorCompra <= 299.99;
    	boolean descuento20 = valorCompra >= 300;
    	double resultado = 0;
    	int descuento = 0;
    	
    	if (descuento10) {
    		resultado = valorCompra - (valorCompra * .10);
    		descuento = 10;
    	}
    	if (descuento15) {
    		resultado = valorCompra - (valorCompra * .15);
    		descuento = 15;
    	}
        if (descuento20) {
        	resultado = valorCompra - (valorCompra * .20);
        	descuento = 20;
        }

        System.out.println("Valor de la compra: $" + valorCompra);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Valor final: $" + resultado);
    }
}