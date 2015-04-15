import javax.swing.JOptionPane;

class ventana
{
	public static void main(String[] args)
	{
		logica procesar = new logica();
		procesar.procesamiento();
		
		System.out.println(procesar.getPuntosC1());
		System.out.println(procesar.getPuntosC2());
		System.out.println(procesar.getPuntosNinguna());
		System.out.println(procesar.getPuntosAmbas());
		
		JOptionPane.showMessageDialog
		(null, procesar.getPuntosC1() + procesar.getPuntosC2() + procesar.getPuntosAmbas() + procesar.getPuntosNinguna(),
		"",JOptionPane.INFORMATION_MESSAGE);		
	}
}