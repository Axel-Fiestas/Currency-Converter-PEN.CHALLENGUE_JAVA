package program;

import Currencies.*;

public class CurrencyConvertSystem {
	
	Currency pen=new PEN();
	Currency dol=new USD();
	Currency eur=new EUR();
	Currency krw=new KRW();
	Currency yen=new YEN();
	Currency gbp=new GBP();
	
	public double converterQuantity(String electedOption,double quantity) {
		
		double newValue;
		
		switch(electedOption){
 	 	
 	 	case "De Soles a Dolar":
 	 		newValue=pen.convertUSDPerformance(quantity);
 	 		break;
 	 		
 	 	case "De Soles a Yen":
 	 		newValue=pen.convertYENPerformance(quantity);
 	 		break;
 	 		
 	 	case "De Soles a Euros":
 	 		newValue=pen.convertEURPerformance(quantity);
 	 		break;
		
 	 	case "De Soles a Won Koreano":
 	 		newValue=pen.convertKRWPerfomance(quantity);
 	 		break;
 	 		
 	 	case "De Soles a Libras":
 	 		newValue=pen.convertGBPPerformance(quantity);
 	 		break;
 	 	
 	 	case "De Dolar a Soles":
 	 		newValue=dol.convertPENPerformance(quantity);
 	 		break;
 	 		
 	 	case "De Dolar a Yen":
 	 		newValue=dol.convertYENPerformance(quantity);
 	 		break;
 	 		
 	 	case "De Dolar a Euros":
 	 		newValue=dol.convertEURPerformance(quantity);
 	 		break;
 	 	case "De Dolar a Won Koreano":
 	 		newValue=dol.convertKRWPerfomance(quantity);
 	 		 break;
 	 	case "De Dolar  a Libras":
 	 		newValue=dol.convertGBPPerformance(quantity);
 	 		break;
 	 		
 	 	case "De Euros a Soles":
 	 		newValue=eur.convertPENPerformance(quantity);
 	 		break;
 	 		
 	 	case "De Euros a Yen":
 	 		newValue=eur.convertYENPerformance(quantity);
 	 		break;
 	 	case "De Euros a Dolar":
 	 		newValue=eur.convertUSDPerformance(quantity);
 	 		break;
 	 	case "De Euros a Won Koreano":
 	 		newValue=eur.convertKRWPerfomance(quantity);
 	 		break;
 	 	case "De Euros a Libras":
 	 		newValue=eur.convertGBPPerformance(quantity);
 	 		break;
 	 		
 	 	case "De Yen a Soles":
 	 		newValue=yen.convertPENPerformance(quantity);
 	 		break;
 	 		
 	 	case "De Yen a Euros":
 	 		newValue=yen.convertEURPerformance(quantity);
 	 		break;
 	 		
 	 	case "De Yen a Dolar":
 	 		newValue=yen.convertUSDPerformance(quantity);
 	 		break;
 	 	case "De Yen a Won Koreano":
 	 		newValue=yen.convertKRWPerfomance(quantity);
 	 		break;
 	 	case "De Yen a Libras":
 	 		newValue=yen.convertGBPPerformance(quantity);
 	 		break;
 	 		
 	 		
 	 	case "De Libras a Soles":
 	 		newValue=gbp.convertPENPerformance(quantity);
 	 		break;
 	 	
 	 	case "De Libras a Euros":
 	 		newValue=gbp.convertEURPerformance(quantity);
 	 		break;
 	 		
 	 	case "De Libras a Dolar":
 	 		newValue=gbp.convertUSDPerformance(quantity);
 	 		break;
 	 		
 	 	case "De Libras a Won Koreano":
 	 		newValue=gbp.convertKRWPerfomance(quantity);
 	 		break;
 		
 	 	case "De Libras a Yen":
 	 		newValue=gbp.convertYENPerformance(quantity);
 	 		break;
 	 		
 	 	case "De Won Koreano a Soles":
 	 		newValue=krw.convertPENPerformance(quantity);
 	 		break;
 			
 	 	case "De Won Koreano a Euros":
 	 		newValue=krw.convertEURPerformance(quantity);
 	 		break;
 	 		
 	 	case "De Won Koreano a Dolar":
 	 		newValue=krw.convertUSDPerformance(quantity);
 	 		break;
 	 		
 	 		
 	 	case "De Won Koreano a Libras":
 	 		newValue=krw.convertGBPPerformance(quantity);
 	 		break;
 	 		
 	 	case "De Won Koreano a Yen":
 	 		newValue=krw.convertYENPerformance(quantity);
 	 		break;
 	 	
 	 	default:
 	 		newValue=0;
 	 		
 	 	}
		return newValue;
	}
	
	public String getNameOfElectedCurrent(String electedOption) {
	
		String nameCurrency="Dinero";
		
		if (electedOption.contains("a Dolar")){
			nameCurrency="Dolares";
		}else if(electedOption.contains("a Soles")){
			nameCurrency="Soles";	
		}else if(electedOption.contains("a Yen")){
			nameCurrency="Yenes";
		}else if(electedOption.contains("a Euros")) {
			nameCurrency="Euros";
		}else if(electedOption.contains("a Libras")) {
			nameCurrency="Libras";
		}else if(electedOption.contains("a Won Koreano")) {
			nameCurrency="Wones Koreanos";
		}
		
		
		return nameCurrency;
		
	}
}
