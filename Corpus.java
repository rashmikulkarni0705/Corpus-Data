import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Corpus {
	
	public static HashMap<String, HashSet<Integer>> iindex = new HashMap<String, HashSet<Integer>>();
	public static HashSet<Integer> postlist= new HashSet<Integer>();
	String docs[]={"A.txt","B.txt"};
	void posting() throws IOException
	{cd
		
		for(int i=0;i<docs.length;i++)
		{
			FileReader docid= new FileReader(docs[i]);
			BufferedReader in = new BufferedReader(docid);
			StreamTokenizer tok = new StreamTokenizer(in);
	
			while(tok.nextToken() != StreamTokenizer.TT_EOF)
			{
				try{
					if(!(tok.sval.isEmpty())){
						//String term= tok.sval.toLowerCase();
						index(tok.sval.toLowerCase(),i);
					}
				}catch(Exception EX){}
			}
		}
	}
	
	String getDocs(Integer id)
	{
			return docs[id];
	}	
		

	
	void index(String term, Integer post){
		
		 if (iindex.containsKey(term)) {
	            HashSet<Integer> newhashSet=iindex.get(term);
	            if(newhashSet!=null)
	            {
	                newhashSet.add(post);
	            }
	            iindex.put(term, newhashSet);     
	        }

	        else {
	            Set<Integer> ids = new HashSet<Integer>();
	            ids.add(post);
	            iindex.put(term, (HashSet<Integer>) ids);
	        }
		}
	
	void show()
	{System.out.println(iindex);}
	
}
