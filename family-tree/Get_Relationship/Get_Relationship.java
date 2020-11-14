import java.util.List;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Get_Relationship {

	static Siblings sib = new Siblings();
	static Gender gen = new Gender();
	static InLaws inlaw = new InLaws();
	static Members member = new Members();

	public String getRelationship(Input in, List<HashMap<String,String>> family_tree) {
		String name = in.getName();
		String relation = in.getRelation();
		String mother_name, siblings, children, in_laws, response="NONE";

		for(HashMap<String,String> person: family_tree) {
			if(relation.equals("SISTER-IN-LAW")) {
				in_laws = inlaw.getInLaws(name, family_tree);
				response = gen.getFemales(in_laws, family_tree);
			   	break;
			}
			if(relation.equals("BROTHER-IN-LAW")) {
				in_laws = inlaw.getInLaws(name, family_tree);
				response = gen.getMales(in_laws, family_tree);
				break;
			}
			if(name.equals(person.get("name"))) {
				if (!(person.get("mother_name").equals("NONE") && person.get("father_name").equals("NONE"))) {
		    			switch(relation) {
						case "PATERNAL-UNCLE":
							mother_name = member.getParent(person.get("father_name"), family_tree);
							siblings = sib.getSiblings(person.get("father_name"), mother_name, family_tree);
							response = gen.getMales(siblings, family_tree);
							break;
						case "SIBLINGS":
							response = sib.getSiblings(name, person.get("mother_name"), family_tree);
							break;
						case "MATERNAL-UNCLE":
							mother_name = member.getParent(person.get("mother_name"), family_tree);
							siblings = sib.getSiblings(person.get("mother_name"), mother_name, family_tree);
							response = gen.getMales(siblings, family_tree);
							break;
						case "PATERNAL-AUNT":
							mother_name = member.getParent(person.get("father_name"), family_tree);
							siblings = sib.getSiblings(person.get("father_name"), mother_name, family_tree);
							response = gen.getFemales(siblings, family_tree);
							break;
						case "MATERNAL-AUNT":
							mother_name = member.getParent(person.get("mother_name"), family_tree);
							siblings = sib.getSiblings(person.get("mother_name"), mother_name, family_tree);
							response = gen.getFemales(siblings, family_tree);
							break;
						case "DAUGHTER":
							children = member.getChildren(name, family_tree);
							response = gen.getFemales(children, family_tree);
							break;
						case "SON":
							children = member.getChildren(name, family_tree);
							response = gen.getMales(children, family_tree);
							break;
						default : response = "NONE";
					}
				}
			}
		}
		return response;
	}
}
