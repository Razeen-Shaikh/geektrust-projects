import java.util.List;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Gender {
	public String getMales(String names, List<HashMap<String,String>> family_tree) {
		String males = "";
		for(HashMap<String,String> person: family_tree) {
			String name = person.get("name");
			Pattern pattern = Pattern.compile(name);
			Matcher match = pattern.matcher(names);
			if(match.find()) {
				if(person.get("gender").equals("Male")) {
					males += name + " ";
				}
			}
		}
		return ((males.equals("")) ? "NONE" : males);
	}

	public String getFemales(String names, List<HashMap<String,String>> family_tree) {
		String females = "";
		for(HashMap<String,String> person: family_tree) {
			String name = person.get("name");
			Pattern pattern = Pattern.compile(name);
			Matcher match = pattern.matcher(names);
			if(match.find()) {
				if(person.get("gender").equals("Female")) {
					females += name + " ";
				}
			}
		}
		return (females.equals("") ? "NONE" : females);
	}

}