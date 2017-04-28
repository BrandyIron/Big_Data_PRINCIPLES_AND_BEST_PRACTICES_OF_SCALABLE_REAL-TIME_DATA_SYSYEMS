public static void createCompressedPail() throws IOException {
	Map<String, Object> options = new HashMap<String, Object>();
	options.put(SequenceFileFormat.CODEC_ARG, SequenceFileFormat.CODEC_ARG_GZIP);
	options.put(SequenceFileFormat.TYPE_ARG, SequenceFileFormat.TYPE_ARG_BLOCK);
	LoginPailStructure struct = new LoginPailStructure();
	Pail compressed = Pail.create("/tmp/compressed", new PailSpec("SequenceFile", options, struct));
}
