union PersonPropertyValue {
	1: string full_name;
	2: GenderType gender;
	3: Location location;
	4: i16 age;
}

struct LinkedEdge {
	1: required PageID source;
	2: required PageID target;
}

union DataUnit {
	1: PersonProperty person_property;
	2: PageProperty page_property;
	3: EquivEdge equiv;
	4: PageViewEdge page_view;
	5: LinkedEdge page_link;
}
