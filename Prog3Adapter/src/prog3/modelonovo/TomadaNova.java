package prog3.modelonovo;

public class TomadaNova {
	public void on(boolean status){
		System.out.println("Tomadas Novas");
		checkEnergia(status);
	}

	private void checkEnergia(boolean status) {
		if (status) {
			System.out.println("controle de seguran�a de energia est� " + status);
		}else{
			System.out.println("controle de seguran�a de energia est� " + status);
		}		
	}

	public void off(boolean status) {
		checkEnergia(status);		
	}
}
