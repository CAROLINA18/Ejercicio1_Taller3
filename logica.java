import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class logica
{
	lectura leerArchivo = new lectura();
	
	public int centroX1 = 0;
	public int centroY1 = 0;
	public int radio1 = 0;
	public int centroX2 = 0;
	public int centroY2 = 0;
	public int radio2 = 0;
	
	public int[] vectorX;
	public int[] vectorY;
	
	double pruebaCircunferencia1 = 0;
	double pruebaCircunferencia2 = 0;
	
	public String salidaCircunferencia1 = "";
	public String salidaCircunferencia2 = "";
	public String salidaNinguna = "";
	public String salidaAmbas = "";
	
	public void procesamiento()
	{
		leerArchivo.leer();
		
		centroX1 = leerArchivo.getcx1();
		centroY1 = leerArchivo.getcy1();
		radio1 = leerArchivo.getr1();
		centroX2 = leerArchivo.getcx2();
		centroY2 = leerArchivo.getcy2();
		radio2 = leerArchivo.getr2();
	
		vectorX = leerArchivo.getvecx();
		vectorY = leerArchivo.getvecy();
				
		salidaCircunferencia1 = "Puntos que se encuentran en la circunferencia 1, con centro en ("+ centroX1 +", "+ centroY1 + ") y radio " + radio1 + ":\n";
		salidaCircunferencia2 = "Puntos que se encuentran en la circunferencia 2, con centro en ("+ centroX2 +", "+ centroY2 + ") y radio " + radio2 + ":\n";
		salidaAmbas = "Puntos que se encuentran en AMBAS circunferencias:\n";
		salidaNinguna = "Los puntos que NO se encuentran en ninguna circunferencia:\n";
		
		for(int i = 0; i < vectorX.length; i++)
		{
			pruebaCircunferencia1 = (Math.sqrt(
			(Math.pow(centroX1 - vectorX[i], 2)) + (Math.pow(centroY1 - vectorY[i], 2))));
			
			pruebaCircunferencia2 = (Math.sqrt(
			(Math.pow(centroX2 - vectorX[i], 2)) + (Math.pow(centroY2 - vectorY[i], 2))));
			
			
			if(pruebaCircunferencia1 <= radio1)
			{
				salidaCircunferencia1 += "(" + vectorX[i] + ", " + vectorY[i] + ")\n";
			}
		
			if(pruebaCircunferencia2 <= radio2)
			{
				salidaCircunferencia2 += "(" + vectorX[i] + ", " + vectorY[i] + ")\n";
			}
			
			if(pruebaCircunferencia1 <= radio1 && pruebaCircunferencia2 <= radio2)
			{
				salidaAmbas += "(" + vectorX[i] + ", " + vectorY[i] + ")\n";
			}
		
			if(pruebaCircunferencia1 > radio1 && pruebaCircunferencia2 > radio2)
			{
				salidaNinguna += "(" + vectorX[i] + ", " + vectorY[i] + ")\n";
			}
		}
	}
	
	public String getPuntosC1()
	{
		return salidaCircunferencia1;		
	}
	
	public String getPuntosC2()
	{
		return salidaCircunferencia2;		
	}
	
	public String getPuntosNinguna()
	{
		return salidaNinguna;		
	}
	
	public String getPuntosAmbas()
	{
		return salidaAmbas;		
	}	
	
}