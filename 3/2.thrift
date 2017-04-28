struct EquivEdge {
	1: required PersonID id1;
	2: required PersonID id2;
}

struct PageViewEdge {
	1: required PersonID person;
	2: required PageID page;
	3: required 164 nonce;
}
