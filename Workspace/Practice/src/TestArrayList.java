import java.util.ArrayList;
import java.util.List;

import org.practice.collection.model.TestClass;

public class TestArrayList {

    public static void main(String args[]) {

	List<TestClass> list = new ArrayList<>();
	TestClass testClass = new TestClass();
	testClass.setName("Kavan");
	testClass.setPhoneNumber(123);
	list.add(testClass);

	// ArrayList<String> al = new ArrayList<String>();
	// al.add("Ravi");
	// al.add("Vijay");
	// al.add("Ravi");
	// al.add("Ajay");
	//
	// Iterator<String> iterator = al.iterator();
	// while (iterator.hasNext())
	// ;
	// {
	// System.out.println(iterator.next());
	//

    }
}
