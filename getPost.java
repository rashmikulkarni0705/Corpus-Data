import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.io.*;

//import javax.swing.text.html.HTMLDocument.Iterator;


public class getPost extends Corpus{
	Set<Integer> postdoc=new HashSet<Integer>();
	Corpus corpus=new Corpus();
	
	public void checkPosting(String term) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//System.out.println("checkPosting");
		//System.out.println(Corpus.iindex);
		if (Corpus.iindex.containsKey(term)) {
            HashSet<Integer> newhashSet=Corpus.iindex.get(term);
            System.out.println(newhashSet);
            postdoc.addAll(newhashSet);
           /* if(newhashSet != null){
            Iterator<Integer> it=newhashSet.iterator();
            while(it.hasNext()){
            	if(postdoc.contains(it.next()))
            	{
            		System.out.println(it.next() +" EXISTS");
            	}
            	else{            		
            		postdoc.add(it.next());
            		System.out.println(it.next()+" ADDED");
            	}
            	//String id=corpus.getDocs(it.next());
            	
            	/*FileReader docid= new FileReader(id);
            	BufferedReader in = new BufferedReader(docid);
            }
            }*/
		}
}
	void result() throws FileNotFoundException
	{
		for(int i=0;i<postdoc.size();i++)
		{
			String id=corpus.getDocs(i);
			System.out.println(id+"\n");
			FileReader docid= new FileReader(id);
			BufferedReader in = new BufferedReader(docid);
			String line = null;
			 try {
				while ((line = in.readLine())!= null) {
				   System.out.println(line);
				 }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
