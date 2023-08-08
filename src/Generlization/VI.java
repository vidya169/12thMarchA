package Generlization;

public class VI implements SimCard {

	public void sms() {
		System.out.println("sms: 100");
		
		
	}

	
	public void audiocalling() {
		System.out.println("audio calling: 300");
		
		
	}

	public void internet() {
		System.out.println("internet: 3GB");
		
		
	}
	public void newfeatureC()
	{
		System.out.println("new featureC");
	}
	
	public static void main(String[] args) {
		System.out.println("feature of jio sim");
		Jio j=new Jio();
		j.sms();
		j.audiocalling();
		j.internet();
		j.newfeatureA();
		
		System.out.println("===========================");
		
		System.out.println("feature of Airtel sim");
		Airtel a=new Airtel();
		a.audiocalling();
		a.sms();
		a.internet();
		a.newfeatureB();
		
		System.out.println("=============================");
		
		System.out.println("feature of VI");
		
		VI v=new VI();
		v.sms();
		v.audiocalling();
		v.internet();
		v.newfeatureC();
	}
}
