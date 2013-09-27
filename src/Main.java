import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fsortie = new FileWriter("lena2.pgm");
		FileReader fentree = new FileReader("lena.pgm");
		BufferedReader in  = new BufferedReader(fentree);
		
		String line;
		 //lecture du header
		for(int i=0;i<3;i++){
		line = in.readLine();
		fsortie.write(line + "\n");
		}
		
		//récupérer les dimensions
		String[] size = new String[2];
		size = line.split(" ", 2);
		
		int hauteur = Integer.parseInt(size[0]);
		int largeur = Integer.parseInt(size[1]);
		
		int[][] image = new int[hauteur][largeur];
		
		//lire le tableau de pixel
		for(int i=0;i<hauteur;i++){
			line = in.readLine();
			//recopier dans le fichier de sortie
			fsortie.write(line + "\n");
			
			//stocker les valeurs dans le tableau image
			String[] pixels = new String[largeur];
			pixels = line.split(" ", largeur);
			for(int j=0;j<largeur;j++){
				image[i][j]=Integer.parseInt(pixels[j]);
			}
		}
		

	}

}
