package prog3.modelonovo;

public class TomadaNova {
	public void on(boolean status){
		System.out.println("Tomadas Novas");
		checkEnergia(status);
	}

	private void checkEnergia(boolean status) {
		if (status) {
			System.out.println("controle de segurança de energia está " + status);
		}else{
			System.out.println("controle de segurança de energia está " + status);
		}		
	}

	public void off(boolean status) {
		checkEnergia(status);		
	}
}
