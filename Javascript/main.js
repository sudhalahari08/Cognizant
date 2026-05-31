console.log("Welcome to the Community Portal");
window.onload=function(){
    alert("Page fully loaded");
};
const eventname="Music event";
const eventdate="7th-June-2026";
let seats=100;
console.log(`Event:${eventname}`);
console.log(`Date:${eventdate}`);
console.log(`Available seats:${seats}`);
seats--;
console.log(`Seats left after registration:${seats}`);
const events=[
    {name:"Music show",seats:10,upcoming:true},
    {name:"Dance club",seats:10,upcoming:true},
    {name:"Arts club",seats:7,upcoming:false}
];
events.forEach(event=>{
    if(event.upcoming && event.seats>0){
        console.log(event.name);
    }
});
function register(event){
    try{
        if(event.seats<=0){
            throw new Error("No seats available");
        }
        event.seats--;
        console.log("Registration successful");
    }
    catch(error){
        console.log(error.message);
    }
}
register(events[0]);
register(events[1]);
let eventlist=[];
function addEvent(event){
    eventlist.push(event);
}
function registerUser(eventname){
    console.log(`User registered for event:${eventname}`);
}
function filterEventsByCategory(category,callback){
    let results=
    eventlist.filter(
        event=>event.category===category
    );
    callback(results);
}
function registrationCounter(){
    let cnt=0;
    return function(){
        cnt++;
        return cnt;
    };
}
const counter=registrationCounter();
console.log(counter());
console.log(counter());
addEvent({
    name:"Music Show",
    category:"Music"
});
addEvent({
    name:"Dance Workshop",
    category:"Workshop"
});
filterEventsByCategory(
    "Music",
    result=>console.log(result)
);
registerUser("Music Show");
class Event{
    constructor(name,seats){
        this.name=name;
        this.seats=seats;
    }
}
Event.prototype.checkAvailability=function(){
    return this.seats>0;
};
let e1=new Event("Workshop",50);
console.log(e1.checkAvailability());
Object.entries(e1).forEach(([key,value])=>{
    console.log(key,value);
});
let communityEvents = [];
communityEvents.push({
    name: "Music Night",
    category: "Music"
});
communityEvents.push({
    name: "Baking Workshop",
    category: "Workshop"
});
communityEvents.push({
    name: "Rock Concert",
    category: "Music"
});
let musicEvents =communityEvents.filter(event => event.category === "Music");
console.log(musicEvents);
let cards =communityEvents.map(event => `Workshop on ${event.name}`);
console.log(cards);
const container=document.querySelector("#eventContainer");
communityEvents.forEach(event => {
    const card = document.createElement("div");
    card.innerHTML = `<h3>${event.name}</h3>
    <p>${event.category}</p>`;
    container.appendChild(card);
});
document.getElementById("registerbtn").onclick=function(){
    card.innerHTML = `
    <h3>${event.name}</h3>
    <p>Category: ${event.category}</p>
`;
    alert("Registered");
};
document.getElementById("category").onchange=function(){
    let selected=this.value;
    let filtered=
    communityEvents.filter(
        event=>event.category===selected
    );
    console.log(filtered);
};
document.getElementById("searchBox").addEventListener("keydown",function(event){
    console.log(event.key);
});
fetch("events.json").then(response=>response.json()).then(data=>{
    console.log(data)
}).catch(error=>{
    console.log(error)
});
async function getEvents() {
    try {
        document.getElementById("loading").innerText = "Loading...";
        let response = await fetch("events.json");
        let data = await response.json();
        console.log(data);
        document.getElementById("loading").innerText = "";
    }
    catch(error) {
        console.log(error);
        document.getElementById("loading").innerText = "";
    }
}
getEvents();
function greet(name = "Guest") {
    console.log(name);
}
greet();
const event = {
    name: "Music Show",
    category: "Music"
};
const { name, category } = event;
console.log(name);
console.log(category);
const clonedEvents = [...communityEvents];
console.log(clonedEvents);
document.getElementById("regForm").addEventListener("submit",function(event){
    event.preventDefault();
    let name =this.elements["username"].value;
    let email =this.elements["email"].value;
    console.log("Form Submitted");
    console.log(name);
    console.log(email);
    console.log("Sending Data...");
    if(name.trim() === "" || email.trim() === ""){
        document.getElementById("error").innerText ="All fields required";
        return;
    }
    console.log(name,email);
});
function submitRegistration() {
    setTimeout(async () => {
        try {
            let response =await fetch("https://jsonplaceholder.typicode.com/posts",{
                method:"POST",headers:{
                    "Content-Type":
                    "application/json"
                },
                body: JSON.stringify({
                    name:"Lahari",
                    event:"Music Show"
                })
            });
            if(response.ok){
                document.getElementById("status").innerText ="Registration Successful";
            }
            else{
                document.getElementById("status").innerText ="Registration Failed";
            }
        }
        catch(error){
            console.log(error);
        }
    },2000);
}
document.getElementById("regForm")
.addEventListener("submit",function(event){
    event.preventDefault();
    submitRegistration();
});