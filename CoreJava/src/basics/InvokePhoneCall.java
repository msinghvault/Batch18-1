package basics;

import jrout.tutorial.classes.School;
import jrout.tutorial.mobile.phone.IPhone;

public class InvokePhoneCall {

	public static void main(String[] args) {
		School s = new School();
		s.callMe();
		
		IPhone ip = new IPhone();
		ip.makePhoneCall();
	}
}