create table dashboard_transactions (
	type_ VARCHAR(75) not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	count INTEGER
);