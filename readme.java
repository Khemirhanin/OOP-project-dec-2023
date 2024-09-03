
//    Clothes eCommerce Application - Java OOP Project
//            Overview
//    This project is an Object-Oriented Programming (OOP) implementation of a clothes eCommerce application in Java. The application includes various classes and functionalities to manage user authentication, product management, shopping cart, order processing, inventory management, dynamic product search, optional features like discounts, promotions, and shipping options.
//
//    Classes Included:
//    UserAuthentication:
//
//    Handles user signup, login, and logout functionalities.
//    Validates user credentials during signup and login.
//    Manages user sessions and authentication status.
//    User:
//
//    Represents registered users in the application.
//    Stores user information (name, email, password, etc.).
//    Enables user-related actions such as updating profile details and managing orders.
//    Communicates with UserAuthentication for signup, login, and logout operations.
//            Product (Abstract) -> Shirts, Pants:
//
//    Abstract class for products with extended classes for shirts and pants.
//    Contains attributes such as name, price, quantity, and category.
//    Each extended class contains a Vector that stores instances of products (shirts or pants).
//    Enables CRUD operations (Create, Read, Update, Delete) for managing products.
//    Includes methods to add, update, delete, and read product details.
//            ShoppingCart:
//
//    Manages a Vector of products selected by the user.
//    Allows users to add products to the cart, view cart contents, and remove items.
//    Handles checkout and payment processing, accessing credit card information for payment.
//    Interacts with the OrderProcessing class for finalizing orders.
//    OrderProcessing:
//
//    Manages the process of placing orders.
//    Calculates the total cost of the order, applies discounts or promotions (if applicable).
//    Verifies and confirms the order after payment confirmation from ShoppingCart.
//    InventoryManagement:
//
//    Manages the inventory of available products.
//    Checks product availability and updates stock levels based on orders placed.
//    Alerts when a product is out of stock or low in quantity.
//    DynamicProductSearch:
//
//    Implements search functionality for products based on their names.
//    Allows users to search for specific products by entering the product name.
//    Displays search results to the user.
//    Optional Features:
//    Discounts and Promotions:
//
//    Implements discounts based on the total cost of products in the shopping cart.
//    Applies promotions like percentage-based discounts or buy-one-get-one offers.
//
//    ShippingOptions:
//
//    Offers various shipping methods using switch case.
//    Provides options for standard shipping, express, same-day delivery, or pickup.
//}
