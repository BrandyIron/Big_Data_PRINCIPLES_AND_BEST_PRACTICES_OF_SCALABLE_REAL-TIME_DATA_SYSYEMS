public static void appendData() throws IOException {
	Pail<Login> loginPail = new Pail<Login>("/tmp/logins");
	Pail<Login> updatePail = new Pail<Login>("/tmp/updates");
	loginPail.absorb(updatePail);
	loginPail.consolidate();
}
