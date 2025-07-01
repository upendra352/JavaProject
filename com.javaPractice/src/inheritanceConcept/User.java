package inheritanceConcept;
	
	class Sweet{
		 @SuppressWarnings("unused")
		private void kalakand() {
			System.out.println("Its Yummy");
			}
	}
	
	class User extends Sweet{
		
		protected void kalakand() {
			System.out.println("I purchase KG 900");
		}

	public static void main(String[] args) {
		
		User u=new User();
		u.kalakand();

	}

}
