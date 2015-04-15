import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
public class lectura {
         
         public   int cx1; //punto X1
         public  int cy1; //punto Y1
         public   int cx2; //punto X2
         public   int cy2; // punto Y2
         public  int r1; //Radio 1
         public   int r2; //radio 2
         public   int xn; //
       	 
         public int[] vecx; //Coordenada X del vector
         public int[] vecy ;  //Coordenada Y del vector
        
        
        public void leer()
        	{            
        	    String contenido = null; //Destino para el contenido del fichero
                File archivo = new File("archivo.txt"); //Ruta completa al fichero que deseamos leer
                try {
                        //lectura del archivo completo
                        FileReader lectura = new FileReader(archivo);//Objeto encargado de leer
                        char[] caracteres = new char[(int) archivo.length()];//Arreglo que contendra los caracteres del fichero
                        lectura.read(caracteres);//Lectura del fichero y deposito del contenido en el arreglo
                        contenido = new String(caracteres);//Deposito del contenido del arreglo en el String destino
                       
                        //cerramos el lectura
                        lectura.close();
                       
                        //eliminamos espacios en blanco (opcional)
                        contenido = contenido.replaceAll("\\s","");
                       
                        //asignamos cada valor al nuevo vector (usamos como separador la coma)
                        String[] vector = contenido.split(",");
                        //String matriz[][]= contenido.split(",");
                        //mostramos el vector
                        /*for(int nJ = 0; nJ < vector.length; nJ++) {
                                //System.out.println("Leido: " + vector[nJ]);
                                //Integer.parseInt(vector[nJ]); 
                        }*/
                        //System.out.println(vector[0]);
                        //System.out.println(vector.length);
                        // System.out.println(vector[7]);
                        //int[] vec2 = new int[0];
                        int[] vec2 = new int[vector.length];//Arreglo contenedor de todos los valores en el archivo
                        for(int i = 0; i < vector.length; i++) {
                        	
                        	vec2[i]   = Integer.parseInt(vector[i]);//Conversion de todos los valores a enteros

                        }  
						//Asignacion de las variables de los circulos
                        cx1 = vec2[0];//Coordenada X del circulo 1
                        cy1 = vec2[1];//Coordenada Y del circulo 1
                        r1 = vec2[2];//Radio del circulo 1
                        cx2 = vec2[3];//Coordenada X del circulo 2
                        cy2 = vec2[4];//Coordenada Y del circulo 2
                        r2 = vec2[5];//Radio del circulo 2

                        vecx = new int[(vec2.length - 6) / 2];//Inicializacion del arreglo de coordenadas X, iniciando desde la posicion 6 del contenedor
                        int j=0;
                        //Llenado del arreglo de coordenadas X
                        for(int i = 6; i < vec2.length; i+=2) {
                        	
                        	vecx[j]=vec2[i];
                        	//System.out.println(vecx[j]);
                        	j++;

                        }

                        vecy = new int[(vec2.length - 6) / 2];//Inicializacion del arreglo de coordenadas Y, iniciando desde la posicion 7 del contenedor
                        int init = 3;
                        int k=0;
                        //Llenado del arreglo de coordenadas Y
                        for(int i = (init*2)+1; i < vec2.length; i=(2*init)+1) {
                        	
                        	vecy[k]=vec2 [i]  ;
                        	//System.out.println(vecy[k]);
                        	init ++;
                        	k++;

                        }

                } catch (IOException e) {
                        e.printStackTrace();
                }
        }



public int getcx1(){ 
return this.cx1; 
} 

public int getcy1(){ 
return this.cy1; 
} 

public int getcx2(){ 
return this.cx2; 
} 
public int getcy2(){ 
return this.cy2; 
} 
public int getr1(){ 
return this.r1; 
} 
public int getr2(){ 
return this.r2; 
}

public int [ ] getvecy(){

return this.vecy;


}

public int [ ] getvecx(){

return this.vecx;


}

}
