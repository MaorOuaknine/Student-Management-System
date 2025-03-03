              function del(){
                   var id = document.getElementById("IdfDel").value
                   fetch('/Student/' + id,{
                       method: 'Delete',
                   })
                   .then(response => alert("true"))
                   .catch(error => alert(error))
              }

           function allStudent(){
               var div = document.getElementById("div")
               fetch('/Student',{
                   method: 'Get'
               })
               .then(response => response.json() )
               .then(students => {
               if(students.length ==0){div.innerHTML =""}

               let html = "<ul>"
                students.forEach(student => {
                           html += "<li><strong>ID:</strong>" + student.id +", <strong>Name:</strong>" + student.name+",<strong>Email:</strong> "+ student.email+"</li>";
                });
                       html += "</ul>";
                       div.innerHTML = html;
               })

               .catch(error => alert(error))
           }