function loginAuth(e) {
    // prevent reload
    e.preventDefault();
    
    // selecting the registration form values
    let Username = document.getElementById("loginUsername").value;
    let Pass = document.getElementById("loginPass").value;

    console.log("User Details : " + Username, Pass);
    
    let userDetails = {
        username : Username,
        pass : Pass,
    }
    // constructing the request object & setting up request headers
    const data = {
        headers: {
            "content-type": "application/json",
        },
        body: JSON.stringify(userDetails),
        method: "POST",
    }

    // call our java backend api to store the details
    fetch('http://localhost:5000/api/auth', data).then(res => res.json()).then(res => {
        console.log(res);
        res ? window.location = "file:///C:/Users/User/Desktop/ecommerceProj/index.html" : alert("Login Failed, Please Check Your Username & Password!");
    })
}