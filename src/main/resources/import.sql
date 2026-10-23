-- Clientes
INSERT INTO clientes (codigo_cliente, nombre, email, telefono, tipo_cliente, fecha_alta, fecha_modificacion) VALUES ('CLI001', 'Acme Corporation', 'contact@acmecorp.com', '+34-91-555-0001', 'ACTIVO', '2025-01-15', '2025-01-15');
INSERT INTO clientes (codigo_cliente, nombre, email, telefono, tipo_cliente, fecha_alta, fecha_modificacion) VALUES ('CLI002', 'Juan García López', 'juan@example.com', '+34-91-555-0002', 'PROSPECTO', '2025-01-20', '2025-02-01');
INSERT INTO clientes (codigo_cliente, nombre, email, telefono, tipo_cliente, fecha_alta, fecha_modificacion) VALUES ('CLI003', 'Ayuntamiento de Madrid', 'info@madrid.es', '+34-91-555-0003', 'ACTIVO', '2025-02-01', '2025-02-01');

-- Productos
INSERT INTO productos (referencia, descripcion, precio_venta, precio_coste, stock, fecha_alta, activo) VALUES ('PROD001', 'Juego de Mesa Premium', 29.99, 15.50, 100, '2025-01-10', true);
INSERT INTO productos (referencia, descripcion, precio_venta, precio_coste, stock, fecha_alta, activo) VALUES ('PROD002', 'Expansion Avanzada', 14.99, 7.00, 50, '2025-01-15', true);
INSERT INTO productos (referencia, descripcion, precio_venta, precio_coste, stock, fecha_alta, activo) VALUES ('PROD003', 'Pack Accesorios', 9.99, 4.50, 200, '2025-01-20', true);

-- Empleados
INSERT INTO empleados (numero_empleado, nombre, apellidos, cargo, departamento, email, fecha_incorporacion, activo) VALUES ('EMP001', 'Maria', 'Rodriguez Garcia', 'Jefe de Ventas', 'Ventas', 'maria@iesdoctorbalmis.edu', '2024-06-01', true);
INSERT INTO empleados (numero_empleado, nombre, apellidos, cargo, departamento, email, fecha_incorporacion, activo) VALUES ('EMP002', 'Carlos', 'Martinez Lopez', 'Jefe de Almacen', 'Almacén', 'carlos@iesdoctorbalmis.edu', '2024-07-15', true);
INSERT INTO empleados (numero_empleado, nombre, apellidos, cargo, departamento, email, fecha_incorporacion, activo) VALUES ('EMP003', 'Sofia', 'Lopez Martinez', 'Administrativo', 'Administración', 'sofia@iesdoctorbalmis.edu', '2024-08-01', true);