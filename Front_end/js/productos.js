// Array para almacenar los productos
let products = [];

// Función para agregar un nuevo producto
function addProduct(event) {
    event.preventDefault();
    const name = document.getElementById("product-name").value;
    const description = document.getElementById("product-description").value;
    const quantity = document.getElementById("product-quantity").value;
    const price = document.getElementById("product-price").value;
    const iva = document.getElementById("product-iva").value;
    const discount = document.getElementById("product-discount").value;
    const state = document.getElementById("product-state").value;

    const newProduct = {
        name: name,
        description: description,
        quantity: quantity,
        price: price,
        iva: iva,
        discount: discount,
        state: state
    };

    products.push(newProduct);
    displayProducts();
    document.getElementById("product-form").reset();
}

// Función para mostrar la lista de productos
function displayProducts() {
    const productList = document.getElementById("product-list");
    productList.innerHTML = "";
    products.forEach(product => {
        const row = document.createElement("tr");
        row.innerHTML = `
            <td>${product.name}</td>
            <td>${product.description}</td>
            <td>${product.quantity}</td>
            <td>${product.price}</td>
            <td>${product.iva}</td>
            <td>${product.discount}</td>
            <td>${product.state}</td>
        `;
        productList.appendChild(row);
    });
}

// Event listener para el formulario de registro de producto
document.getElementById("product-form").addEventListener("submit", addProduct);
