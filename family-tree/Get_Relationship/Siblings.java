import java.util.List;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Siblings {

	public String getSiblings(String name, String mother_name, List<HashMap<String,String>> family_tree) {
		String siblings = "";
		for(HashMap<String,String> person: family_tree) {
			if((person.get("mother_name")).equals(mother_name)) {
				if ((person.get("name")).equals(name)) {
					continue;
				}
		    	siblings += person.get("name") + " ";
			}
		}
		return (siblings.equals("") ? "NONE" : siblings);
	}

	public String getSiblingsSpouse(String siblings, List<HashMap<String,String>> family_tree) {
		String in_laws="";
		for (HashMap<String,String> person: family_tree) {
			String pattern = person.get("mother_name");
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(siblings);
		    if (m.find())
		    	in_laws += person.get("father_name") + " ";
			pattern = person.get("father_name");
			r = Pattern.compile(pattern);
			m = r.matcher(siblings);
			if(m.find())
				in_laws += person.get("mother_name") + " ";
		}
		return (in_laws.equals("") ? "NONE" : in_laws);
	}
}
