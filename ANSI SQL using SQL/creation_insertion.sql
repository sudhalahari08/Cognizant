create database event_management;
use event_management;
create table Users(user_id int primary key auto_increment,
	full_name varchar(100) not null,
    email varchar(100) unique not null,
    city varchar(100) not null,
    registration_date date not null);
create table Events(event_id int primary key auto_increment,
	title varchar(200) not null,
    description text,
    city varchar(100) not null,
    start_date datetime not null,
    end_date datetime not null,
    status enum('upcoming','completed','cancelled'),
    organizer_id int,
    foreign key (organizer_id) references Users(user_id));
create table Sessions(session_id int primary key auto_increment,
	event_id int,
    foreign key(event_id) references Events(event_id),
    title varchar(200) not null,
    speaker_name varchar(100) not null,
    start_time datetime not null,
    end_time datetime not null);
create table Registrations(registration_id int primary key auto_increment,
	user_id int,
    foreign key(user_id) references Users(user_id),
    event_id int,
    foreign key(event_id) references Events(event_id),
    registration_date date not null);
create table Feedback(feedback_id int primary key auto_increment,
	user_id int,
    foreign key(user_id) references Users(user_id),
    event_id int,
    foreign key(event_id) references Events(event_id),
    rating int check (rating between 1 and 5),
    comments text,
    feedback_date date not null);
create table Resources(resource_id int primary key auto_increment,
	event_id int,
    foreign key(event_id) references Events(event_id),
    resource_type enum('pdf','image','link'),
    resource_url varchar(225) not null,
    uploaded_at datetime not null);
show tables;
insert into Users(full_name,email,city,registration_date) 
values
('Alice Johnson','alice@example.com','New York','2024-12-01'),
('Bob Smith','bob@example.com','Los Angeles','2024-12-05'),
('Charlie Lee','charlie@example.com','Chicago','2024-12-10'),
('Diana King','diana@example.com','New York','2025-01-15'),
('Ethan Hunt','ethan@example.com','Los Angeles','2025-02-01');
select * from Users;
INSERT INTO Events(event_id,title,description,city,start_date,end_date,status,organizer_id)
VALUES
(1,'Tech Innovators Meetup','A meetup for tech enthusiasts.','New York',
'2025-06-10 10:00:00','2025-06-10 16:00:00','upcoming',1),
(2,'AI & ML Conference','Conference on AI and ML advancements.',
'Chicago','2025-05-15 09:00:00','2025-05-15 17:00:00','completed',3),
(3,'Frontend Development Bootcamp','Hands-on training on frontend tech.',
'Los Angeles','2025-07-01 10:00:00','2025-07-03 16:00:00',
'upcoming',2);
INSERT INTO Sessions(session_id,event_id,title,speaker_name,start_time,end_time)
VALUES
(1,1,'Opening Keynote','Dr. Tech','2025-06-10 10:00:00',
'2025-06-10 11:00:00'),
(2,1,'Future of Web Dev','Alice Johnson','2025-06-10 11:15:00',
'2025-06-10 12:30:00'),
(3,2,'AI in Healthcare','Charlie Lee','2025-05-15 09:30:00',
'2025-05-15 11:00:00'),
(4,3,'Intro to HTML5','Bob Smith','2025-07-01 10:00:00',
'2025-07-01 12:00:00');
select * from Events;
select * from Sessions;
INSERT INTO Registrations
(registration_id,user_id,event_id,registration_date)
VALUES
(1,1,1,'2025-05-01'),
(2,2,1,'2025-05-02'),
(3,3,2,'2025-04-30'),
(4,4,2,'2025-04-28'),
(5,5,3,'2025-06-15');
select * from Registrations;
INSERT INTO Feedback
(feedback_id,user_id,event_id,rating,comments,feedback_date)
VALUES
(1,3,2,4,'Great insights!','2025-05-16'),
(2,4,2,5,'Very informative.','2025-05-16'),
(3,2,1,3,'Could be better.','2025-06-11');
select * from Feedback;
insert into Resources(resource_id,event_id,resource_type,resource_url,uploaded_at)
VALUES
(1,1,'pdf','https://portal.com/resources/tech_meetup_agenda.pdf','2025-05-01 10:00:00'),
(2,2,'image','https://portal.com/resources/ai_poster.jpg','2025-04-20 09:00:00'),
(3,3,'link','https://portal.com/resources/html5_docs','2025-06-25 15:00:00');
select * from Resources;