package ödev1;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + Angular)", "Engin demiroð");
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (Java + React)", "Engin demiroð");
		
          Course [] courses= {course1,course2};
        
        for (Course course : courses) {
			System.out.println(course.id+" "+course.courseName+" "+course.teacherName+" ");
		}
        
        
        courseSelection courseSelection = new ödev1.courseSelection();
        courseSelection.addToCart(course1);
        courseSelection.addToCart(course2);
        
        System.out.println("----------");
        
        
        System.out.println("Kurslarýmýza Katýldýðýnýz Ýçin Teþekkürler:)");
	}

}
