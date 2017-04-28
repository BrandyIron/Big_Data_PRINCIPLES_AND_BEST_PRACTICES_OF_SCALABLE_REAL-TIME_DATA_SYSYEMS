union DataUnit {
	1: PersonProperty person_property;
	2: PageProperty page_property;
	3: EquivEdge equiv;
	4: PageViewEdge page_view;
}

struct Pedigree {
	1: required i32 true_as_of_secs;
}

struct Data {
	1: required Pedigree pedigree;
	2: required DataUnit dataunit;
}
