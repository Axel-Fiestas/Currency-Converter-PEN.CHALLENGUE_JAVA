package Temperature;

public class Celsius extends Degrees{
	
	public Celsius() {
		kelvin=new ConvertCELtoKEL();
		fahrenheit=new ConvertCELtoFAH();
	}
}
