CREATE TABLE USERS(
	
	UserId int Primary Key identity(1,1),
	UserName varchar(50) Not Null,
	Email varchar(50) Not Null,
	Phone varchar(11) Not Null,
	Password varchar(50) Not Null,
	Region varchar(50) Not Null,
	Age int Not Null
)


CREATE TABLE Game(
	
	GameId int Primary Key identity(1,1),
	GameTitle varchar(50) Not Null,
	Genre varchar(20) Not Null,
	ReleaseYear int Not Null,
	Price int Not Null,
	Description varchar(Max) Not Null
)


CREATE TABLE Platform(
	
	PlatformId int Primary Key identity(1,1),
	PlatformName varchar(50) Not Null,
	Platformdesc varchar(Max) Not Null	
)


CREATE TABLE Supports_rel(
	Id int Primary Key identity(1,1),
	GameId int Foreign Key references Game(GameId),
	PlatformId int Foreign Key references Platform(PlatformId)
)


CREATE TABLE Company(
	
	CompanyId int Primary Key identity(1,1),
	PublisherName varchar(200) Not null,
	DeveloperName varchar(200) Not null,
	Country varchar(80) Not null,
	GameId int Foreign Key references Game(GameId)
)


Create Table Review(
	UserId int Foreign Key references USERS(UserId),
	GameId int Foreign Key references Game(GameId),
	Rating int Not NUll Check (Rating>0 AND Rating<=10),
	ReviewPost varchar(Max) Not Null
)


Create Table MarketPlace(
	MarketId int Primary Key identity(1,1),
	Market varchar(100) Not Null,
	PaymentMethod varchar(300) Not Null
)


Create Table Soldon_rel(
	Id int Primary Key identity(1,1),
	GameId int Foreign Key references Game(GameId),
	MarketId int Foreign Key references MarketPlace(MarketId)
)