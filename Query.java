import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Query {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public void Query1(String que) throws IOException{
		Corpus corpus= new Corpus();
		corpus.posting();
		corpus.show();
		
		getPost gpost= new getPost();
		//System.out.println("Enter the Query");
		//Scanner keyboard= new Scanner(System.in);
		//String que= keyboard.nextLine();
		//FileReader q= new FileReader(que);
		//BufferedReader in = new BufferedReader(q);
		System.out.println(que);
		StringTokenizer tok = new StringTokenizer(que);
		
		while(tok.hasMoreTokens())
		{
			//try{
				//if(!(tok.sval.isEmpty())){
				//String term= tok.sval.toLowerCase();
				//Post.index(tok.sval.toLowerCase(),i);
//				System.out.println(tok.nextToken());		
				String term= tok.nextToken();
				gpost.checkPosting(term.toLowerCase());
					//System.out.println(tok.nextToken());
				//}
			//}
			//catch(Exception EX){}
			//Post.index(tok.sval,i);
		}
		gpost.result();

	}

}
