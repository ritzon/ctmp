function Checks()
{
    var obs1 = document.getElementById("observacion1");
    var chb1 = document.getElementById("chkVerificar1");
    var obs2 = document.getElementById("observacion2");
    var chb2 = document.getElementById("chkVerificar2");
    var obs3 = document.getElementById("observacion3");
    var chb3 = document.getElementById("chkVerificar3");
    var obs4 = document.getElementById("observacion4");
    var chb4 = document.getElementById("chkVerificar4");
    if (chb1.checked == false)
    {
        obs1.disabled = false;
    } else {
        obs1.disabled = true;
    }
    
    if (chb2.checked == false)
    {
        obs2.disabled = false;
    } else {
        obs2.disabled = true;
    }
    
    if (chb3.checked == false)
    {
        obs3.disabled = false;
    } else {
        obs3.disabled = true;
    }
    
    if (chb4.checked == false)
    {
        obs4.disabled = false;
    } else {
        obs4.disabled = true;
    }

}


	