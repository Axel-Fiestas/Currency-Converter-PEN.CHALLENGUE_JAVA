package Temperature;

public class Fahrenheit extends Degrees{
	
	public Fahrenheit() {
		celsius=new ConvertFAHtoCEL();
		kelvin=new ConvertFAHtoKEL();
	}
}
