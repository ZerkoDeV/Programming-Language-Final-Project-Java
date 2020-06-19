import java.io.IOException;//This import is used for when there is any input / output file operation issues while application performing certain tasks accessing the files. 

public class ATM extends OptionMenu{
	public static void main(String[] args) throws IOException{
		OptionMenu optionMenu = new OptionMenu();
		
		optionMenu.getLogin();
	}
}
