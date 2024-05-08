function showClientsTable() {
    const table = document.getElementById("client-table");
    table.style.display = "table";
}

// Array para almacenar los clientes
let clients = [];

// Función para agregar un nuevo cliente
function addClient(event) {
    event.preventDefault();
    const idType = document.getElementById("client-id-type").value;
    const idNumber = document.getElementById("client-id-number").value;
    const name = document.getElementById("client-name").value;
    const lastname = document.getElementById("client-lastname").value;
    const phone = document.getElementById("client-phone").value;
    const address = document.getElementById("client-address").value;
    const city = document.getElementById("client-city").value;
    const state = document.getElementById("client-state").value;

    const newClient = {
        idType: idType,
        idNumber: idNumber,
        name: name,
        lastname: lastname,
        phone: phone,
        address: address,
        city: city,
        state: state
    };

    clients.push(newClient);
    displayClients();
    document.getElementById("client-form").reset();
}

// Función para mostrar la lista de clientes
function displayClients() {
    const clientList = document.getElementById("client-list");
    clientList.innerHTML = "";
    clients.forEach(client => {
        const row = document.createElement("tr");
        row.innerHTML = `
            <td>${client.idType}</td>
            <td>${client.idNumber}</td>
            <td>${client.name}</td>
            <td>${client.lastname}</td>
            <td>${client.phone}</td>
            <td>${client.address}</td>
            <td>${client.city}</td>
            <td>${client.state}</td>
        `;
        clientList.appendChild(row);
    });
}

// Event listener para el formulario de registro de cliente
document.getElementById("client-form").addEventListener("submit", addClient);

