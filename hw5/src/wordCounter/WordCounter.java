package wordCounter;
import java.util.*;
import java.io.*;
public class WordCounter {
	
	public static String key;
	static Hashtable<Integer, Integer> table;
	static Hashtable<Integer, String> keys;
	public static int hashCode;
	private final static int TABLE_SIZE = 311;
public static void readFile(String fileName){
	try{
		
		FileInputStream fstream = new FileInputStream(fileName);
		DataInputStream in = new DataInputStream(fstream);
		Scanner br = new Scanner(new InputStreamReader(in));
		
		table = new Hashtable<Integer, Integer>(TABLE_SIZE);
		keys = new Hashtable<Integer, String>(TABLE_SIZE);
		
		while(br.hasNext()) {
			int count=1;
			key = br.next().toLowerCase();
			int value = getHashIndex(key);
			keys.put(value, key);
			if(table.containsKey(value)){
				table.put(value, (table.get(value)+1));
			}
			else
				table.put(value, count);
		}
		
			
		in.close();
		br.close();
	}

	catch(Exception e){
		System.err.println("Error: " + e.getMessage());
	}

}

	public static int getHashIndex(String word){
		hashCode = Word.toHash(word);
		int hashIndex = hashCode % TABLE_SIZE;
		
		if (hashIndex < 0){
			hashIndex = hashIndex + TABLE_SIZE;
		}
		
		return hashIndex;
	}
	public static void main(String[] args){
		readFile("C://Users//chaissonl//Desktop//java 285//hw5//src//wordCounter//file.txt");
		System.out.println("Table: " + table.toString());
		System.out.println("Table: " + keys.toString());
		
	}
}



