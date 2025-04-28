//if... else
function inventory(numArray){
    let i = 0 ;
    for (i; i<numArray.length;i++){
        if(numArray[i]==0){
            console.log("item is not available");
        }
        else{
            console.log("item is available");
        }
    }
}

inventory([1,4,5,0,56]);

function  grade(scores){
    let i = 0;
    for (i;i<scores.length;i++){
        if(scores[i] >= 85){
            console.log(`Your have a score of ${scores[i]} and your grade is A.`);
        }
        else if(scores[i ]<85 && scores[i]>=70){
            console.log(`Your have a score of ${scores[i]} and your grade is B.`);
        }
        else if(scores[i] <70 && scores[i]>=60){
            console.log(`Your have a score of ${scores[i]} and your grade is C.`);
        }
        else if(scores[i] <60 && scores[i]>=50){
            console.log(`Your have a score of ${scores[i]} and your grade is D.`);
        }
        else {
            console.log(`Your have a score of ${scores[i]} and your grade is E.`);
        }
    }
}
  
grade([80,97,34,56,70]);

//while loop

function login(){
    let loginAttempt=1;
    while(loginAttempt<=3){
        console.log(`Login attempt: ${loginAttempt}`);
        loginAttempt++;
    }
}
login()

const loginAttemptUsingDoWhile = ()=>{
    let loginAttempt=1;
    do{
        console.log(`Login attempt using do...while: ${loginAttempt}`);
        loginAttempt++;
    }
    while(loginAttempt<=3);
}
loginAttemptUsingDoWhile();


//switch case
const notification=(notificationType)=>{
    notificationType.forEach(notification=>{
        switch (notification){
            case "email":
                console.log("Send email");
                break;
            case "sms":
                console.log("Send sms");
                break;
            case "push":
                console.log("Send push notification");
                break;
            default:
                console.log("Notification type not supported");
                break;
        }
    })
}
notification(["email","sms","push","comment"])

const accessType=(userRoles)=>{
    userRoles.map(userRole =>
    {
        switch (userRole){
            case "admin":
                return "Admin access";
                // console.log();
                break;
            case "viewer":
                return "Viewer access";
                // console.log();
                break;
            case "editor":
                return "Editor access";
                // console.log();
                break;
            case "commenter":
                return "Commenter access";
                // console.log();
                break;
            default:
                return "Access not specified";
                // console.log();
                break;
        }
    })
}
console.log(accessType(["admin","editor","commenter","viewer","reader"]));