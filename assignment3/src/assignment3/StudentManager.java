package assignment3;

public class StudentManager extends UserManager{

		@Override
			
			public void add(User user) {
				System.out.println(user.getFirstName() + " -- Learner added");
			}
			public void update(User user) {
				System.out.println(user.getFirstName() + " -- Learner updated");
			}
			public void delete(User user) {
				System.out.println(user.getFirstName() + " -- Learner deleted");
			}
			
		

	}


