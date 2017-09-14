package main;
import java.util.Date;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;


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
                this.students=students;
               
	}
        

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
                return students[index];
               

	
	public void setStudent(Student student, ) int = 0 index
{
		// Add your implementation here
                 int length=students.length;
        int index = 0;
   for(int i=index;i<length;i++){
                    students[i+1]=students[i];
                }
                students[index]=student[];
	}

	
	 public void addFirst(Student student) {
		// Add your implementation here
                  int length=students.length;
                for(int i=0;i<length;i++){
                    students[i+1]=students[i];
                }
                students[0]=student;
                
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
                int length=students.length;
                students[length]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
               int length=students.length;
                for(int i=index;i<length;i++){
                    students[i+1]=students[i];
                }
                students[index]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
                  int length=students.length;
                for(int i=index;i<length;i++){
                    students[i]=students[i+1];
                }
                students[length]=null;
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
                 int length=students.length;
                for(int i=0;i<length;i++){
                    students[i]=null;
                }
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
                  int length=students.length;
                for(int i=index+1;i<length;i++){
                    students[i]=null;
                }
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
                int count=0;
   int length=students.length;
  for(int i=0;students[i]!=student;i++){
                    count++;
                }
                for(int i=count+2;i<length;i++){
                    students[i]=null;
                }
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
                 int length=students.length;
  for(int i=0;i<index;i++){
                    students[i]=null;
                }
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
                  int count=0;
   int length=students.length;
  for(int i=0;students[i]!=student;i++){
                    count++;
                }
                for(int i=0;i<count+1;i++){
                    students[i]=null;
                }
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
                   int n = students.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (students[i].getId() > students[k].getId()) {
                    swapNumbers(i, k, students);
                }
            }
           
        }
	}
        private static void swapNumbers(int i, int j, Student[] array) {
 
        Student[] temp=null;
        temp[i] = array[i];
        array[i] = array[j];
        array[j] = temp[i];
    }

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		 Student[] arr=null;
                int k=0;
                int length=students.length;
                for(int i=0;i<length;i++){
                       if((students[i].getBirthDate()).compareTo(date)==0){
                           arr[k]=students[i];
                           k++;
                       }
                }
                return arr;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		Student[] arr=null;
                int k=0;
                int length=students.length;
                for(int i=0;i<length;i++){
                       if(((students[i].getBirthDate()).compareTo(firstDate)>=0)&&((students[i].getBirthDate()).compareTo(lastDate)<0)){
                           arr[k]=students[i];
                           k++;
                       }
                }
                return arr;
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
		  int len=students.length;
                int avg=0;
                int index=0;
                for(int i=0;i<len;i++){
                    if(students[i].getAvgMark()>avg){
                        
                    }
                }
  return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		  int length=students.length;
            int count=0;
  for(int i=0;students[i]!=student;i++){
                   count++;
                }
  return students[count+2];
 }
	}
        
}

