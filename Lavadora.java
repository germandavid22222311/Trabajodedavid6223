package Patronestrategia;

public class Lavadora {
	public void encender() {
		System.out.println("** Lavadora Encendida **");
	}
	public void enjuagar() {
		System.out.println("** Lavadora Enjuagando **");
	}
	public void secar() {
		System.out.println("** Lavadora Secando **");
	}
	public void temperatura() {
		System.out.println("** Lavadora Temperatura,°");
	}
	public void apagar() {
		System.out.println("** Lavadora Apagada **");
	}
	
	//ENCENDER
	public interface IComando{
		void ejecutar();
	}
	 public class ComandoEncender implements IComando {
		 private Lavadora lv;
		 public ComandoEncender(Lavadora pLv) {
			 this.lv = pLv;
		 }
		 @Override
		 public void ejecutar() {
			 lv.encender();
		 }
	 }
	//FIN-ENCENDER

	 //ENJUAGAR
	 public class ComandoEnjuagar implements IComando{
		 private Lavadora lv;
		 public ComandoEnjuagar(Lavadora pLv) {
			 this.lv = pLv;
		 }
		 @Override public void ejecutar() {
			 lv.enjuagar();
		 }
	 }
	 //FIN-ENJUAGAR
	 
	 //SECAR
	 public class ComandoSecar implements IComando{
		 private Lavadora lv;
		 public ComandoSecar(Lavadora pLv) {
			 this.lv = pLv;
		 }
		 @Override public void ejecutar() {
			 lv.secar();
		 }
	 }
	 //FIN SECAR
	 
	 
	 //TEMPERATURA
	 public class ComandoTemperatura implements IComando{
		 private Lavadora lv;
		 public ComandoTemperatura(Lavadora pLv) {
			 this.lv = pLv;
		 }
		 @Override public void ejecutar() {
			 lv.temperatura();
		 }
	 }
	 //FIN-TEMPERATURA
	 
	 //APAGAR
	 public class ComandoApagar implements IComando{
		 private Lavadora lv;
		 public ComandoApagar(Lavadora pLv) {
			 this.lv = pLv;
		 }
		 @Override public void ejecutar() {
			 lv.apagar();
		 }
	 }
	 //FIN-APAGAR
	 
	//METODOS
	 private IComando ComandoEncender(Lavadora pLv) {
		return null;
	}
	 private IComando ComandoEnjuagar(Lavadora pLv) {
			return null;
		}
	 private IComando ComandoSecar(Lavadora pLv) {
		 return null;
	 }
	 private IComando ComandoTemperatura(Lavadora pLv) {
		 return null;
	 }
	 private IComando ComandoApagar(Lavadora pLv) {
		 return null;
	 }
	 
	 //FIN METODOS
	 
	 public class ControlPanel{
		 private IComando[] comandos = new IComando[6];
		 public ControlPanel(Lavadora pLv) {
			 comandos[0] = ComandoEncender(pLv);
			 comandos[1] = ComandoEnjuagar(pLv);
			 comandos[2] = ComandoSecar(pLv);
			 comandos[3] = ComandoTemperatura(pLv);
			 comandos[4] = ComandoApagar(pLv);
		}
		
		 //PANEL
		 public void SeleccionControl(int pIndice) {
			 comandos[pIndice].ejecutar();
		 }
	 }
	 

		}//FIN PAQUETE.CLASS

