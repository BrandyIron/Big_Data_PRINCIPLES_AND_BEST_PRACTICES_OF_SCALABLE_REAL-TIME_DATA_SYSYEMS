public static void readLogins() throws IOException {
	Pail<Login> loginPail = new Pail<Login>("/tmp/logins");
	for(Login l : loginPail) {
		System.out.println(l.userName + " " + l.loginUnixTime);
	}
}
