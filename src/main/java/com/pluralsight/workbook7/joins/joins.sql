-- 1. List the product id, product name, unit price and category name of all
-- products. Order by category name and within that, by product name.
USE northwind;
SELECT p.ProductID, p.ProductName, p.UnitPrice, c.CategoryName 
FROM products AS p 
JOIN categories AS c 
ON c.CategoryID = p.CategoryID
ORDER BY c.CategoryName, p.ProductName;
-- 2. List the product id, product name, unit price and supplier name of all
-- products that cost more than $75. Order by product name.
SELECT p.ProductID, p.ProductName, p.UnitPrice, s.CompanyName
FROM products AS p
JOIN suppliers AS s
ON p.SupplierID = s.SupplierID
WHERE p.UnitPrice > 75
ORDER BY p.ProductName;
-- 3. List the product id, product name, unit price, category name, and supplier
-- name of every product. Order by product name.
SELECT p.ProductID, p.ProductName, p.UnitPrice, c.CategoryName, s.CompanyName
FROM products AS p 
JOIN categories AS c
ON c.CategoryID = p.CategoryID
JOIN suppliers AS s
ON p.SupplierID = s.SupplierID
ORDER BY p.ProductName ASC;
-- 4. What is the product name(s) and categories of the most expensive
-- products? HINT: Find the max price in a subquery and then use that in
-- your more complex query that joins products with categories.
SELECT ProductName, CategoryName, UnitPrice
FROM products AS p
JOIN categories AS c
ON p.CategoryID = c.CategoryID
WHERE UnitPrice = (SELECT MAX(UnitPrice) FROM products);
-- 5. List the order id, ship name, ship address, and shipping company name of
-- every order that shipped to Germany.
SELECT OrderID, ShipName, ShipAddress, CompanyName
FROM orders as o
JOIN shippers AS s
ON o.ShipVia = s.ShipperID
WHERE ShipCountry = "Germany";
-- 6. List the order id, order date, ship name, ship address of all orders that
-- ordered "Sasquatch Ale"?
SELECT od.OrderID, OrderDate, ShipName, ShipAddress
FROM orders as o
JOIN `order details` AS od
ON o.OrderID = od.OrderID
JOIN products as p
ON od.ProductID = p.ProductID
WHERE ProductName = "Sasquatch Ale";
