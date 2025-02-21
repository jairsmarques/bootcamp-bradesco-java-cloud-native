
public class ComputadorPedrinho {

	public static void main(String[] args) {
		
		System.out.println("MSN");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarmensagem();
		msn.receberMensagem();
		
		System.out.println("FACEBOOK");
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarmensagem();
		fcb.receberMensagem();
		
		System.out.println("TELEGRAM");
		Telegram tlg = new Telegram();
		tlg.enviarmensagem();
		tlg.receberMensagem();
	}

}
