public static void writeLogins() throws IOException {
	Pail<Login> loginPail = Pail.create("/tmp/logins", new LoginPailStructure());
	TypedRecordOutputStream out = loginPail.openWrite();
	out.writeObject(new Login("alex", 123));
	out.writeObject(new Login("bob", 234));
	out.close();
}
