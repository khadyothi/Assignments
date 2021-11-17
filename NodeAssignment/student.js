const fs=require('fs');
const path=require('path');

//create folder with asyn call back function
fs.mkdir(path.join(__dirname,'/TrainingDetails'),{},function(err){
    if(err) throw err;
    console.log('')
})


fs.readFile(path.join(__dirname,'/TrainingDetails','studentdetails.txt'),'utf8',(err,data)=>{

    if(err)throw err;

    console.log(data);

});

fs.writeFile(path.join(__dirname,'TrainingDetails','studentdetails.txt')
,'My text file contains Traing Details of the students'
,(err)=>{
    if(err) throw err;
    console.log('File written to...');
})

fs.appendFile(path.join(__dirname,'/TrainingDetails','/studentdetails.txt'),
'Hari',
err=>{
    if(err) throw err;
    console.log('File appended to...')
}
)
