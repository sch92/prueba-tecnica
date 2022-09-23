let selectOffice = document.querySelector("#office");
let selectDepartment = document.querySelector("#department");

OFFICES.forEach( o => {
    let option = document.createElement("option");
    option.value = o.idOff;
    option.textContent = o.name;
    selectOffice.appendChild(option);
});

selectOffice.addEventListener("change", loadDeparments);
/**
 * Fills the departments selector with instances from the array "DEPARTMENTS" located in departments.js when an office is selected
 */
function loadDeparments(){
    selectDepartment.textContent = "Select your department";
    let option = document.createElement("option");
    option.setAttribute("disabled", "");
    option.setAttribute("selected", "")
    option.textContent = "Select your department";
    selectDepartment.appendChild(option)
    DEPARTMENTS.filter(d => d.idOff == selectOffice.value).forEach(d => {
        let option = document.createElement("option");
        option.textContent = d.name;
        selectDepartment.appendChild(option);
    });
}

