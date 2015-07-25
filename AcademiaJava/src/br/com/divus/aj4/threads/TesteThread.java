package br.com.divus.aj4.threads;

public class TesteThread implements Runnable{
	// eh possivel extender para a Classe Thread
	
	/*
	 * Para criar um thread extends Thread ou implements Runnable
	 * O codigo a ser executado deve estar dentro do metodo run
	 * Para iniciar um thread:
	 * 		extends Thread: Crie um objeto da propria classe e chame o .start()
	 * 		implements Runnable: Crie um objeto da classe, crie uma Thread passando no construtor o objeto criado,
	 * em seguida execute o .start() no objeto Thread
	 * 
	 *  a Thread tem prioridades, mas nao temos garantia de qual sera executada primeiro
	 *  Tambem nao sabemos por quanto tempo ela ficará em execucao
	 *  
	 *  os estados de um thread sao:
	 *  	
	 *  Runnable => running => Dead
	 *  
	 *  entre runnable e running estão:
	 *  	wait
	 *  	blocked
	 *  	sleep
	 */
	
	
	

	private char c;

	public TesteThread(char c) {
		this.c = c;
	}

	@Override
	public void run() {
		System.out.println("Thread: " + Thread.currentThread().getName());//verifica a thread em execucao
		for (int i = 1; i < 1000; i++) {
			System.out.print(c);
			if (i % 100 == 0) {
				System.out.println();
			}

		}
	}

	public static void main(String[] args) {
		TesteThread t1 = new TesteThread('A');
		TesteThread t2 = new TesteThread('B');
		TesteThread t3 = new TesteThread('C');
		TesteThread t4 = new TesteThread('D');
		
		//Runnable
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		Thread tt3 = new Thread(t3);
		Thread tt4 = new Thread(t4);
		
		tt1.start();
		tt2.start();
		tt3.start();
		tt4.start();
		/*
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		*/
		
		/*
		 * 
		 
		t1.run();// processamento na thread
		t2.run();
		t3.run();
		t4.run();
		*/
		
		/*
		 * nao eh possivel determinar a prioridade das threads
		 * assim, n se sabe qual sera executada ou parada
		 * 
		 * nao se pode dar dois start numa thread, terá que criar outro objeto
		 */
		
		
	
		
	}
}

