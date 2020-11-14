import java.util.HashMap;
import java.util.List;

class InLaws {
	static Siblings sib = new Siblings();
	static Members member = new Members();

	public String getInLaws(String name, List<HashMap<String,String>> family_tree) {

		String in_laws = "", siblings, parent_name;

		for(HashMap<String,String> person: family_tree) {

			if(name.equals(person.get("mother_name"))) {
				parent_name = member.getParent(person.get("father_name"), family_tree);
				siblings = parent_name.equals("NONE") ? "NONE" : sib.getSiblings(person.get("father_name") ,parent_name, family_tree);
				in_laws = siblings.equals("NONE") ? "NONE" : siblings;
				break;
			} else if (name.equals(person.get("father_name"))) {
				parent_name = member.getParent(person.get("mother_name"), family_tree);
				siblings = parent_name.equals("NONE") ? "NONE" : sib.getSiblings(person.get("mother_name") ,parent_name, family_tree);
				in_laws = siblings.equals("NONE") ? "NONE" : siblings;
			} else if (name.equals(person.get("name"))) {
				siblings = sib.getSiblings(name, person.get("mother_name"), family_tree);
				in_laws = siblings.equals("NONE") ? "NONE" : sib.getSiblingsSpouse(siblings, family_tree);
			}
		}
		return (in_laws.equals("") ? "NONE" : in_laws);
	}
}