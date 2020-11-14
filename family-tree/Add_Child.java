import java.util.List;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

class Add_Child {

	public List<HashMap<String,String>> addChild(Input in, List<HashMap<String,String>> family_tree) {
		HashMap<String,String> person;
		String mother_name = in.getMotherName();
		String child_name = in.getChildName();
		String gender = in.getGender();
		boolean is_added = false;

		if (personExists(mother_name, child_name, gender, family_tree)) {
			for(HashMap<String,String> fam: family_tree) {
				if(fam.get("mother_name").equals(mother_name)) {
					person = new HashMap<String,String>() {{
						put("name", child_name);
						put("mother_name", mother_name);
						put("father_name", fam.get("father_name"));
						put("gender", gender);
					}};
					family_tree.add(person);
					is_added = true;
					break;
				}
			}
			if(is_added) System.out.println("CHILD_ADDITION_SUCCEEDED");
				else System.out.println("CHILD_ADDITION_FAILED");
		} else System.out.println("CHILD_ADDITION_FAILED");
		return family_tree;
	}

	public boolean personExists(String mother_name, String child_name, String gender, List<HashMap<String,String>> family_tree) {
		boolean person_exists = true;
		for (HashMap<String,String> person: family_tree) {
			if (mother_name.equals(person.get("mother_name"))
				&& child_name.equals(person.get("name"))
				&& gender.equals(person.get("gender"))) {
				person_exists = false;
			}
		}
		return person_exists;
	}
}