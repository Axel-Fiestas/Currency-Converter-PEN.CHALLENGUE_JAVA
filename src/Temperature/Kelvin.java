package Temperature;

public class Kelvin extends Degrees{
	
	public Kelvin() {
		celsius=new ConvertKELtoCEL();
		fahrenheit=new ConvertKELtoFAH();
	}
}
