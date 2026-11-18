
| Contacto      |
| ------------- |
| id_contacto   |
| nombre        |
| telefono      |
| mail          |
| observaciones |
```sql 
CREATE TABLE contacto (
id_contacto SMALLINT UNSIGNED PRIMARY KEY, 
nombre VARCHAR (25) NOT NULL,
apellido VARCHAR (25) NOT NULL,
telefono CHAR (9) NOT NULL,
mail VARCHAR (320) NOT NULL,
observaciones VARCHAR (500) NOT NULL
)ENGINE=InnoDB;
```