package wordCounter;

public class Word {
public static int toHash(String word){
	int hashCode = 0;
	for(int i = 0; i<word.length(); i++)
		hashCode += (int)word.charAt(i);
	return hashCode;
}
}
