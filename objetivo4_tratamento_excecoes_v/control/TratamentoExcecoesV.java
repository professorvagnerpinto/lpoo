package control;

import java.util.InputMismatchException;

public class TratamentoExcecoesV {

	public static void main(String[] args) {
		
		//Divisão por Zero
		//System.out.println(10/0);
		
		//NullPointerException (Ponteiro Nulo)
		//Conta4V conta1 = null;//new Conta4V();
		//System.out.println(conta1.toString());
		
		//analisando a Pilha de exceção
		comportamento1(); //chamada de método

	}
	
	private static void comportamento1() {
		comportamento2(); //chamada de método
	}
	
	private static void comportamento2() {
		//Divisão por Zero
		//System.out.println(10/0); //lança a exceção
		//System.out.println("Executou todas as chamadas.");

		//InputMismatchException exception = new InputMismatchException();
		//throw exception;
		
		
//		try {
//			throwException();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
	//lança uma exceção verificada.
	/*
	 * Segundo Deitel (2010), todas as classes que são herdadas da classe Exception, mas não direta ou indiretamente da classe 
	 * RuntimeException, são consideradas exceções verificadas.
	 */
	private static void throwException() throws Exception{
		// throw an exception and immediately catch it
		try { 
		     System.out.println("Method throwException");
		     throw new Exception(); // generate exception
		}
		catch (Exception exception) { // catch exception thrown in try
		     System.err.println(
		        "Exception handled in method throwException");
		     throw exception; // rethrow for further processing
		}
		finally { // executes regardless of what occurs in try...catch
			System.err.println("Finally executed in throwException");
		}
	
	  // code here would not be reached; would cause compilation errors
	
	}
	
}// fim classe TratamentoExcecoesV



class Conta4V {
	private Double saldo=0.0;
	
	public Conta4V() {
		super();
	}

	public Conta4V(Double saldo) {
		super();
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "\nConta [saldo=" + saldo + "]";
	}
	
}
