import java.io.File;
public class File1{

	public static void main (String args[]) {
		File fichero = new File ("/home/zubiri/Escritorio/testua.txt");
		if(fichero.exists()){
			
	        System.out.println("Nombre del archivo "+fichero.getName());
	        System.out.println("Camino             "+fichero.getPath());
	        System.out.println("Camino absoluto    "+fichero.getAbsolutePath());
	        System.out.println("Se puede escribir  "+fichero.canRead());
	        System.out.println("Se puede leer      "+fichero.canWrite());
	        System.out.println("Tamaño             "+fichero.length());
  		}else{
  			System.out.println("ez dago fitxategi hori");
  		}


	
	
	}

}
