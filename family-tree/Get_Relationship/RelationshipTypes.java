import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

class RelationshipTypes {

	public List<String> getRelationshipTypes() {
		List<String> relationship_types = new ArrayList<>() {{
			add("PATERNAL-UNCLE");
			add("MATERNAL-UNCLE");
			add("PATERNAL-AUNT");
			add("MATERNAL-AUNT");
			add("SIBLINGS");
			add("DAUGHTER");
			add("SON");
			add("SISTER-IN-LAW");
			add("BROTHER-IN-LAW");
		}};
		return relationship_types;
	}
}