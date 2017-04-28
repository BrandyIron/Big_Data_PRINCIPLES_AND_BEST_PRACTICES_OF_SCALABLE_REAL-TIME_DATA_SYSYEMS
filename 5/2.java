public static void simpleIO() throws IOException {
	Pail pail = Pail.create("/tmp/mypail");
	TypedRecordOutputStream os = pail.openWrite();
	os.writeObject(new byte[] {1, 2, 3});
	os.writeObject(new byte[] {1, 2, 3, 4});
	os.writeObject(new byte[] {1, 2, 3, 4, 5)};
	os.close();
}
