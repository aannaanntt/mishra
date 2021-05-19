export{}

let message = 'Welcome back';
console.log(message);

let isBeginner:boolean =  true;
let total:number=0;
let name:string='Anant';


let sent:string=`My name is ${name} I am a beginner in TS`

console.log(sent);

let n:null = null;
let u :undefined=undefined;

let isNew : boolean = null;
let myName:string=undefined

//let list: number[] =[1,2,3]
let list1:number[] =[1,2,3];
let list2:Array<number>=[1,2,3]


let person:[string,number] = ['anant',23]

enum Cars {BMW=9,AUDI,MARZARATI}

let c:Cars =Cars.MARZARATI;
console.log(c);

let randomValue:any=10;
randomValue=true;
randomValue='Anant';



// let myVariable:unknown=10;
// // console.log(myVariable.name);
// (myVariable as string).toUpperCase()




// function hasName(obj:any):obj is {name:string}{
//     return !! obj &&
//         typeof obj === "object" && "name" in obj
// }


// if(hasName(myVariable)){
//     console.log(myVariable.name);
// }


let a ;
a=10;
a=true;


let b =20;


let multiType:number | boolean;
multiType=20;
multiType=true;


//optional parameter just put ?
function add(num1:number,num2?:number) :number{
    if(num2)
        return num1+num2;
    else    
        return num1
}

add(5,10);
add(4)

//default parameters

function adds(num1:number,num2:number=10) :number{
    if(num2)
        return num1+num2;
    else    
        return num1
}
adds(2);
interface Person{
    firstName:string;
    lastName?:string; // optional
}

function fullName(person:Person){
    console.log(`${person.firstName} ${person.lastName}`);
}


let p={
    firstName:'Bruce',


};


fullName(p);

class Employee {
    employeeName:string;

    constructor(name:string){
        this.employeeName=name;
    }

    greet(){
        console.log(`Good Morning ${this.employeeName}`)
    }
}

let emp1 = new Employee('Anant');
 
   console.log(emp1.employeeName);
   emp1.greet()


   class Manager extends Employee{
       constructor(managerName:string){
           super(managerName);
       }


       delegateWork(){
           super.greet();
           console.log('Manager delegating task')
       }
   }

   let m1 = new Manager('Bruce');
   m1.delegateWork();
   m1.greet();
   console.log(m1.employeeName);