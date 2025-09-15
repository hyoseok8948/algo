console.log('hello');
console.log(typeof("test"))

let i
for(i=0; i<5;i++){
    if(i%2 == 1){
        console.log("ssafy")
    }
}


let j = 0

while(j < 11) {
    console.log(i)
    j += 1
}

const foods  =["a","b","c","d"]

for(const food of foods) {
    console.log(food)
}

const foods2 = { k: "kebab", t: "taco", p: "pizza", y: "yogurt"}
for(const key in foods2) {
    console.log(`${key}: ${foods2[key]}`)
}

//array에서는 인덱스 +1로 진행해야 한다.

let member1 = {id: "kim", email: "kim@ssafy.com"}

function Member(id, email) {
    this.id = id;
    this.email = email;
}

let member2 = new Member("lee", "lee@ssafy.com")
console.log(member2)

let student = { name: "김싸피"
    , age: 45, hobby: ["연구", "운동"],
    "favorite singer": "IU"
}

console.log(student.name);
console.log(student["age"])

var m1 = {name: "김싸피"}
var m2 = {name: "이싸피"}
function msg() {
    console.log(this.name + "님이 등장!")
}

m1.msg = msg
m1.msg()
m2.msg = msg
m2.msg()

function fn() {
    console.log(arguments.length)
    for(let i=0; i<arguments.length;i++){
        console.log(arguments[i])
    }
}

fn(1)
fn(1, 10, 100)