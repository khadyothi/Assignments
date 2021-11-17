const fs=require('fs');
const path=require('path');

//create folder with asyn call back function
fs.mkdir(path.join(__dirname,'/Javafile'),{},function(err){
    if(err)throw err;
    console.log('')
})



fs.readFile(path.join(__dirname,'/Javafile','file.java'),'utf8',(err,data)=>{

    if(err)throw err;

    console.log(data);

});