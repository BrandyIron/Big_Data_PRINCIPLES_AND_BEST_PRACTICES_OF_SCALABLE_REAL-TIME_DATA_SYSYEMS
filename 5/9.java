public static void partitionData() throws IOException {
	Pail<Login> pail = Pail.create("/tmp/partitioned_logins", new PartitionedLoginPailStructure());
	TypedRecordOutputStream os = pail.openWrite();
	os.writeObject(new Login("chris", 123));
	os.writeObject(new Login("david", 234));
	os.close();
}
