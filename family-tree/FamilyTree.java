import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/* Getting the whole family tree saved in a file. 
And Creating // HashMap for each person with name, mother_name, 
father_name, and gender // and adding each person to the List */

class FamilyTree {

	public List<HashMap<String,String>> getFamilyTree() {
		File file = new File("Files/FamilyTree.csv");
		List<HashMap<String,String>> family_tree = new ArrayList<HashMap<String,String>>();
		HashMap<String,String> person = new HashMap<String,String>() {{
			put("name","King Shah");
			put("mother_name","NONE");
			put("father_name","NONE");
			put("gender","Male");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Queen Anga");
			put("mother_name","NONE");
			put("father_name","NONE");
			put("gender","Female");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Amba");
			put("mother_name","NONE");
			put("father_name","NONE");
			put("gender","Female");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Lika");
			put("mother_name","NONE");
			put("father_name","NONE");
			put("gender","Female");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Chitra");
			put("mother_name","NONE");
			put("father_name","NONE");
			put("gender","Female");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Vyan");
			put("mother_name","NONE");
			put("father_name","NONE");
			put("gender","Male");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Jaya");
			put("mother_name","NONE");
			put("father_name","NONE");
			put("gender","Male");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Arit");
			put("mother_name","NONE");
			put("father_name","NONE");
			put("gender","Male");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Satvy");
			put("mother_name","NONE");
			put("father_name","NONE");
			put("gender","Female");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Krpi");
			put("mother_name","NONE");
			put("father_name","NONE");
			put("gender","Female");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Chit");
			put("mother_name","Queen Anga");
			put("father_name","King Shah");
			put("gender","Male");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Ish");
			put("mother_name","Queen Anga");
			put("father_name","King Shah");
			put("gender","Male");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Vich");
			put("mother_name","Queen Anga");
			put("father_name","King Shah");
			put("gender","Male");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Aras");
			put("mother_name","Queen Anga");
			put("father_name","King Shah");
			put("gender","Male");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Satya");
			put("mother_name","Queen Anga");
			put("father_name","King Shah");
			put("gender","Female");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Dritha");
			put("mother_name","Amba");
			put("father_name","Chit");
			put("gender","Female");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Tritha");
			put("mother_name","Amba");
			put("father_name","Chit");
			put("gender","Female");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Vritha");
			put("mother_name","Amba");
			put("father_name","Chit");
			put("gender","Male");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Asva");
			put("mother_name","Satya");
			put("father_name","Vyan");
			put("gender","Male");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Vyas");
			put("mother_name","Satya");
			put("father_name","Vyan");
			put("gender","Male");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Atya");
			put("mother_name","Satya");
			put("father_name","Vyan");
			put("gender","Female");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Laki");
			put("mother_name","Jnki");
			put("father_name","Arit");
			put("gender","Male");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Lavnya");
			put("mother_name","Jnki");
			put("father_name","Arit");
			put("gender","Female");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Vila");
			put("mother_name","Lika");
			put("father_name","Vich");
			put("gender","Female");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Chika");
			put("mother_name","Lika");
			put("father_name","Vich");
			put("gender","Female");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Jnki");
			put("mother_name","Chitra");
			put("father_name","Aras");
			put("gender","Female");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Ahit");
			put("mother_name","Chitra");
			put("father_name","Aras");
			put("gender","Male");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Yodhan");
			put("mother_name","Dritha");
			put("father_name","Jaya");
			put("gender","Male");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Vasa");
			put("mother_name","Satvy");
			put("father_name","Asva");
			put("gender","Male");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Kriya");
			put("mother_name","Krpi");
			put("father_name","Vyas");
			put("gender","Male");
		}};
		family_tree.add(person);
		person = new HashMap<String,String>() {{
			put("name","Krithi");
			put("mother_name","Krpi");
			put("father_name","Vyas");
			put("gender","Female");
		}};
		family_tree.add(person);

		return family_tree;
	}
}