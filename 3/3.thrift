union PagePropertyValue {
	1: 132 page_views;
}

struct PageProperty {
	1: required PageID id;
	2: required PagePropertyValue property;
}

struct Location {
	1: optional string city;
	2: optional string state;
	3: optional string country;
}

enum GenderType {
	MALE =1,
	FEMALE = 2
}

union PersonPropertyValue {
	1: string full_name;
	2: GenderType gender;
	3: Location location;
}

struct PersonProperty {
	1: required PersonID id;
	2: required PersonPropertyValue property;
}
