package �dev1;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + Angular)", "Engin demiro�");
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java + React)", "Engin demiro�");
		
          Course [] courses= {course1,course2};
        
        for (Course course : courses) {
			System.out.println(course.id+" "+course.courseName+" "+course.teacherName+" ");
		}
        
        
        courseSelection courseSelection = new �dev1.courseSelection();
        courseSelection.addToCart(course1);
        courseSelection.addToCart(course2);
        
        System.out.println("----------");
        
        
        System.out.println("Kurslar�m�za Kat�ld���n�z ��in Te�ekk�rler:)");
	}

}
