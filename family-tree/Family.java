import java.util.List;
import java.util.HashMap;

class Family {

	public List<HashMap<String,String>> addChild(Input in, List<HashMap<String,String>> family_tree) {
		String mother_name = in.getMotherName();
		if(personExists(mother_name, family_tree)) {
			Add_Child add_child = new Add_Child();
			family_tree = add_child.addChild(in, family_tree);
		} else System.out.println("PERSON_NOT_FOUND");
		return family_tree;
	}

	public void getRelationship(Input in, List<HashMap<String,String>> family_tree) {
		String name = in.getName();
		String relation = in.getRelation();
		if (personExists(name, family_tree)) {
			if (!relation.equals(null)) {
				Get_Relationship get_relation = new Get_Relationship();
				System.out.println(get_relation.getRelationship(in, family_tree));
			}
		} else System.out.println("PERSON_NOT_FOUND");
	}

	public boolean personExists(String name, List<HashMap<String,String>> family_tree) {
		boolean is_present = false;
		for (HashMap person: family_tree) {
			if (person.get("name").equals(name))
				is_present = true;
		}
		return is_present;
	}
}