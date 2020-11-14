import java.util.List;
import java.util.HashMap;

class Input {

	private String name;
	private String mother_name;
	private String child_name;
	private String gender;
	private String relation;
	private List<HashMap<String,String>> family_tree;
	private List<String> relationship_types;

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setMotherName(String mother_name) {
		this.mother_name = mother_name;
	}
	public String getMotherName() {
		return this.mother_name;
	}

	public void setChildName(String child_name) {
		this.child_name = child_name;
	}
	public String getChildName() {
		return this.child_name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return this.gender;
	}

	public void setRelation(String relation) {
		boolean is_relation = false;
		for(String rel: relationship_types) {
			is_relation = (relation.toUpperCase()).equals(rel) ? true : false;
			if(is_relation) break;
		}
		if(is_relation)
			this.relation = relation.toUpperCase();
		else System.out.println("No Such Relation");
	}
	public String getRelation() {
		return this.relation;
	}

	public void setFamilyTree(List<HashMap<String,String>> family_tree) {
		this.family_tree = family_tree;
	}
	public List<HashMap<String,String>> getFamilyTree() {
		return this.family_tree;
	}

	public void setRelationshipTypes(List<String> relationship_types) {
		this.relationship_types = relationship_types;
	}
	public List<String> getRelationshipTypes() {
		return relationship_types;
	}
}