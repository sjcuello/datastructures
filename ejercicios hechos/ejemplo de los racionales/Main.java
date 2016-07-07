import java.io.*;


	public class Main {
		
		public static void main(String args[]){
			int aux1= 0;
			InputStreamReader in= new InputStreamReader(System.in);
			BufferedReader buffer = new BufferedReader(in);
			try{
				aux1 =buffer.readLine();
			}catch (IOException e){};
			int aux2= 0;
			InputStreamReader in= new InputStreamReader(System.in);
			BufferedReader buffer = new BufferedReader(in);
			try{
				aux2 =buffer.readLine();
			}catch (IOException e){};
			
			Racionales s = new Racionales(aux1,aux2);
			System.out.println(s.numerador+"/"+s.denominador);
		}
		
		
	}