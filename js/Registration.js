function Register(e) {
    // prevent reload
    e.preventDefault();
    // console.log(e);
    
    // selecting the registration form values
    let Username = document.getElementById("regUsername").value;
    let Email = document.getElementById("regEmail").value;
    let Pass = document.getElementById("regPass").value;

    console.log("User Details : " + Username, Email, Pass);
    
    let userDetails = {
        username : Username,
        email : Email,
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
    fetch('http://localhost:5000/api/register', data).then(res => res.json()).then(res => {
        console.log(res);
        res ? alert(Username + ", Your Registration is Successful!") : alert("Sorry, Something Went Wrong!");
    })
}