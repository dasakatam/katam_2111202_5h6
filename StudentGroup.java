import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Stream;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		 
		if(students == null){
			throw new IllegalArgumentException("No Students found");
		}
		this.students=students;		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here

		if(index < 0 || index >= students.length){
			throw new IllegalArgumentException("IllegalArgumentException index must be greater than 0 or " + (students.length-1));
		}
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if (student == null){
			throw new IllegalArgumentException("No Students found");
		}
		if(index < 0 || index >= students.length){
			throw new IllegalArgumentException("IllegalArgumentException index must be greater than 0 or " + (students.length-1));
		}
		ArrayList<Student> tempArray = new ArrayList<Student>(Arrays.asList(students));
		tempArray.add(index,student);
		students = (Student[]) tempArray.toArray();
	}

	@Override
	public void addFirst(Student student) {
				// Add your implementation here
		if (student == null){
			throw new IllegalArgumentException("No Students found");
		}
		ArrayList<Student> tempArray = new ArrayList<Student>(Arrays.asList(students));
		tempArray.add(0,student);
		students = (Student[]) tempArray.toArray();
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if (student == null){
			throw new IllegalArgumentException("No Students found");
		}
		ArrayList<Student> tempArray = new ArrayList<Student>(Arrays.asList(students));
		tempArray.add(tempArray.size(),student);
		students = (Student[]) tempArray.toArray();
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		
		if (student == null){
			throw new IllegalArgumentException("");
		}
		if(index < 0 || index >= students.length){
			throw new IllegalArgumentException("IllegalArgumentException index must be greater than 0 or " + (students.length-1));
		}
		students[index] = student;
		
	}

	@Override
	public void remove(int index) {
		// Add your implementation here

		if(index < 0 || index >= students.length){
			throw new IllegalArgumentException("IllegalArgumentException index must be greater than 0 or " + (students.length-1));
		}
		
		ArrayList<Student> tempArray = new ArrayList<Student>(Arrays.asList(students));
		tempArray.remove(index);
		students = (Student[]) tempArray.toArray();
			
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		
		if (student == null){
			throw new IllegalArgumentException("null value passed");
		}
		
		ArrayList<Student> tempArray = new ArrayList<Student>(Arrays.asList(students));
		if(!tempArray.contains(student)){
			throw new IllegalArgumentException("Student not exist");
		}
		tempArray.remove(student);
		students = (Student[]) tempArray.toArray();
	
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	
		if(index < 0 || index >= students.length){
			throw new IllegalArgumentException("IllegalArgumentException index must be greater than 0 or " + (students.length-1));
		}
		
		ArrayList<Student> tempArray = new ArrayList<Student>(Arrays.asList(students));
		tempArray.remove(index);
		students = (Student[]) tempArray.toArray();
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		
		
		if (student == null){
			throw new IllegalArgumentException("null value passed");
		}
		
		ArrayList<Student> tempArray = new ArrayList<Student>(Arrays.asList(students));
		tempArray.remove(student);
		students = (Student[]) tempArray.toArray();
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length){
			throw new IllegalArgumentException("IllegalArgumentException index must be greater than 0 or " + (students.length-1));
		}
		
		ArrayList<Student> tempArray = new ArrayList<Student>(Arrays.asList(students));
		tempArray.remove(index);
		students = (Student[]) tempArray.toArray();
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		
		if (student == null){
			throw new IllegalArgumentException("null value passed");
		}
		
		ArrayList<Student> tempArray = new ArrayList<Student>(Arrays.asList(students));
		tempArray.remove(student);
		students = (Student[]) tempArray.toArray();
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		   for (int i = 0; i < students.length-1; i++)      
		 
		       // Last i elements are already in place   
		       for (int j = 0; j < students.length-i-1; j++) {
		           if (students[j].compareTo(students[j+1])>1){
		        	   Student temp = students[j];
		        	   students[j] = students[j+1];
		        	   students[j+1] = temp;
		           }
		       }
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here

		if (date == null){
			throw new IllegalArgumentException("null value passed");
		}
//		Stream.of(students).filter(s->{s.getBirthDate().equals(date);});
		
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
