import java.util.List;
import java.util.HashMap;

class Members {
	public String getParent(String name, List<HashMap<String,String>> family_tree) {
		String parent_name = "NONE";
		for (HashMap<String,String> person: family_tree) {
			if (name.equals(person.get("name"))) {
				parent_name = person.get("mother_name");
				break;
			}
		}
		return parent_name;
	}

	public String getChildren(String name, List<HashMap<String,String>> family_tree) {
		String children = "";
		for (HashMap<String,String> person: family_tree) {
			if (name.equals(person.get("mother_name")) || name.equals(person.get("father_name"))) {
				children += person.get("name");
			}
		}
		if(children.equals("")) return "NONE";
			else return children;
	}
}