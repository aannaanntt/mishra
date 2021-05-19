"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var message = 'Welcome back';
console.log(message);
var isBeginner = true;
var total = 0;
var name = 'Anant';
var sent = "My name is " + name + " I am a beginner in TS";
console.log(sent);
var n = null;
var u = undefined;
var isNew = null;
var myName = undefined;
//let list: number[] =[1,2,3]
var list1 = [1, 2, 3];
var list2 = [1, 2, 3];
var person = ['anant', 23];
var Cars;
(function (Cars) {
    Cars[Cars["BMW"] = 9] = "BMW";
    Cars[Cars["AUDI"] = 10] = "AUDI";
    Cars[Cars["MARZARATI"] = 11] = "MARZARATI";
})(Cars || (Cars = {}));
var c = Cars.MARZARATI;
console.log(c);
var randomValue = 10;
randomValue = true;
randomValue = 'Anant';
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
var a;
a = 10;
a = true;
var b = 20;
var multiType;
multiType = 20;
multiType = true;
//optional parameter just put ?
function add(num1, num2) {
    if (num2)
        return num1 + num2;
    else
        return num1;
}
add(5, 10);
add(4);
//default parameters
function adds(num1, num2) {
    if (num2 === void 0) { num2 = 10; }
    if (num2)
        return num1 + num2;
    else
        return num1;
}
adds(2);
function fullName(person) {
    console.log(person.firstName + " " + person.lastName);
}
var p = {
    firstName: 'Bruce'
};
fullName(p);
var Employee = /** @class */ (function () {
    function Employee(name) {
        this.employeeName = name;
    }
    Employee.prototype.greet = function () {
        console.log("Good Morning " + this.employeeName);
    };
    return Employee;
}());
var emp1 = new Employee('Anant');
console.log(emp1.employeeName);
emp1.greet();
var Manager = /** @class */ (function (_super) {
    __extends(Manager, _super);
    function Manager(managerName) {
        return _super.call(this, managerName) || this;
    }
    Manager.prototype.delegateWork = function () {
        _super.prototype.greet.call(this);
        console.log('Manager delegating task');
    };
    return Manager;
}(Employee));
var m1 = new Manager('Bruce');
m1.delegateWork();
m1.greet();
console.log(m1.employeeName);
