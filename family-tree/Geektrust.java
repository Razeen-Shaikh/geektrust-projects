import java.util.List;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Geektrust {

	public static void main(String[] args) {
		
		if(args.length < 1 || args.length > 1)
			System.out.println("Enter correct file name");
		else {
			Input in = new Input();
			Family family = new Family();
			File file = new File(args[0]);
			FamilyTree fam = new FamilyTree();
			RelationshipTypes relations = new RelationshipTypes();
			List<HashMap<String,String>> family_tree = fam.getFamilyTree();
			List<String> relationship_types = relations.getRelationshipTypes();
			
			in.setFamilyTree(family_tree);
			in.setRelationshipTypes(relationship_types);
			try {
				Scanner sc = new Scanner(file);
				while(sc.hasNextLine()) {
					String[] input = (sc.nextLine()).split(" ");
					if (input[0].equals("ADD_CHILD")) {
						in.setMotherName(input[1]);
						in.setChildName(input[2]);
						in.setGender(input[3]);
						family_tree = family.addChild(in, family_tree);
					}
					else if (input[0].equals("GET_RELATIONSHIP")) {
						in.setFamilyTree(family_tree);
						in.setName(input[1]);
						in.setRelation(input[2]);
						family.getRelationship(in, family_tree);
					}
				}
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}