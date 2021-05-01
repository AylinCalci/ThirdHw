package assignment3;

public class InstructorManager extends UserManager{
			@Override
			
			public void add (User user) {
				System.out.println(user.getFirstName() + " -- Instructor added");
			}
			public void update (User user) {
				System.out.println(user.getFirstName() + " -- Instructor updated");
			}
			public void delete (User user) {
				System.out.println(user.getFirstName() + " -- Instructor deleted");
			}
			
			
			public void addCamp() {
				System.out.println("Camp has been added to the system:)");
			}

		

	}


