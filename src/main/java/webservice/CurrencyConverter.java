package webservice;

import javax.jws.WebService;

@WebService
public interface CurrencyConverter {
	
	Double convert(String from, String to);

}
