package assignment3;

public class Main {

			public static void main(String[] args) {
				
				Student student1 = new Student();
				student1.setId(1);
				student1.setFirstName("Aylin");
				student1.setLastName("Calçı");
				student1.setMail("mail@gmail.com.tr");
				student1.setPassword("45658");
				
				Student student2 = new Student();
				student2.setId(2);
				student2.setFirstName("Batuhan");
				student2.setLastName("Altan");
				student2.setMail("mail@gmail.com.tr");
				student2.setPassword("57821");
				
				Instructor instructor1 = new Instructor();
				instructor1.setId(3);
				instructor1.setInstructorId(34);
				instructor1.setFirstName("Engin");
				instructor1.setLastName("Demiroğ");
				instructor1.setMail("mail@gmail.com");
				instructor1.setPassword("6798");
				
				Instructor instructor2 = new Instructor();
				instructor2.setId(4);
				instructor2.setInstructorId(21);
				instructor2.setFirstName("Irmak");
				instructor2.setLastName("Çakmak");
				instructor2.setMail("maill@gmail.com");
				instructor2.setPassword("9636");
				
				User[] users = {student1,student2,instructor1,instructor2};
				System.out.println("---------Users---------");
				for (User user : users) {
					
					System.out.println("User Name :" +  user.getFirstName() + " " + user.getLastName());
				}
				
				System.out.println("---------Learners---------");
				Student[] students = {student1,student2};
				for (Student student : students) {
					System.out.println("Learner Name :" + student.getFirstName() + "///" + "Progress Status :" + student.getPercent());
				}
				

				System.out.println("---------------Instructors---------------------");
				
				Instructor[] instructors = {instructor1,instructor2};
				for (Instructor instructor : instructors) {
					System.out.println("Instructor Name :" + instructor.getFirstName() + " " + instructor.getLastName());
				}
				
				
				System.out.println("------------------------------------");
				
				StudentManager studentManager = new StudentManager();
				studentManager.add(student1);
				
				System.out.println("------------------------------------");
				
				UserManager userManager = new UserManager();
				userManager.add(student1);		
				userManager.add(instructor1);
				
				
				System.out.println("------------------------------------");
				
				InstructorManager instructorManager = new InstructorManager();
				instructorManager.add(instructor1);
				instructorManager.addCamp();
				

			}

		

	}


