import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {
	}

public static ArrayList<String> perms(String str) {

	ArrayList<String> permutations = new ArrayList<String>();

	permHelper("", str, permutations);
	return permutations;
	}

	public static void permHelper(String usedStr, String unUsedStr, ArrayList<String> permutations) {
	if(unUsedStr.isEmpty()){
	permutations.add(usedStr);
	return;
	}
	for(int x = 0; x < unUsedStr.length(); x++){
	permHelper(usedStr + unUsedStr.charAt(x), unUsedStr.substring(0,x) + unUsedStr.substring(x+1), permutations);
	}
}


public static ArrayList<String> permsUnique(String str) {

	ArrayList<String> permutations = new ArrayList<String>();

	permUniqueHelper("", str, permutations);
	return permutations;
	}

	public static void permUniqueHelper(String usedStr, String unUsedStr, ArrayList<String> permutations) {
	if(unUsedStr.isEmpty()){
	if(!(permutations.contains(usedStr))){
	permutations.add(usedStr);
	return;
	} 
	return;
	}
	for(int x = 0; x < unUsedStr.length(); x++){
	permUniqueHelper(usedStr + unUsedStr.charAt(x), unUsedStr.substring(0,x) + unUsedStr.substring(x+1), permutations);
	}
	}
}
