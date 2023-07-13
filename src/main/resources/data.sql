CREATE TABLE `producto` (
                            `producto_id` int NOT NULL,
                            `producto_nombre` varchar(100) DEFAULT NULL,
                            `producto_precio` int DEFAULT NULL,
                            `producto_descripcion` varchar(255) DEFAULT NULL,
                            `producto_categoria` varchar(20) DEFAULT NULL,
                            `producto_cantidad` int DEFAULT NULL,
                            PRIMARY KEY (`producto_id`),
                            KEY `idx_producto_cantidad` (`producto_cantidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
insert into `producto` (producto_id,producto_nombre,producto_precio, producto_descripcion, producto_categoria)
values (1, "Inmunapis", 6990, "Formulado científicamente para fortalecer tus defensas de manera natural, evitando y aliviando las enfermedades provocados por virus estacionales como resfrío común, influenza, faringitis, bronquitis, entre otros", "Nutracéutico apícola")
    (2,"Apicolon", 6990, "Formulado cientificamente para tratar úlceras gástricas, protegiendo su sistema digestivo de malestares provocados por H. Pylori, aliviando los reflujos, ardor estomacal y gastritis", "Nutracéutico apícola")
(3, "Propóleo en spray", 4000, "Formulado para aliviar los dolores de garganta producidos por la tos o irritación (contiene alcohol)", "Natural apícola")
(4, "Propóleo en tintura", 3500, "Propoleo en estado puro disuelto en alcohol, sirve para hacer gárgaras ante infecciones bucales, faringeas, laringeas (amigdalitis)","Natural apícola")
(5, "Bálsamo labial", 2000, "Hidrata, regenera, alivia ardor de labios y mucosas expuestas al frío y resequedad", "Souvenirs")
(6, "Gotas de variedades de hierbas medicinales", 4000, "Gotas de hierbas medicinales para coayudar al tratamiento de distintas afecciones (Salvia-Manzanilla, Melissa-Paz y Flora)","Natural Herbal")
(7, "Gotas relajantes e inductoras del sueño", 4000, "Gotas de hierbas medicinales, para tratar la ansiedad permitiendo inducir el sueño de manera gradual", "Natural Herbal")
(8, "Jabón miel maqui (gránulos) y canela",1500,"Jabon de tocador natural con base de aceite de coco, especial para pieles secas o maltratadas por el día a día", "Natural apícola")
(9, "Jabón miel maqui (gránulos) y lemon grass", 1500, "Jabon de tocador natural con base de aceite de coco, especial para pieles secas o maltratadas por el día a día","Natural apícola")
(10, "Miel pura (250 gramos)", 2500, "Producida respetando los ciclos naturales de vida en las abejas y con cuidados ecológicos y amigables con el medio ambiente, favoreciendo así a los polinizadores locales y la flora endémica de la Araucanía Andina", "Natural apícola")
(11, "Miel pura (500 gramos)", 4500, "Producida respetando los ciclos naturales de vida en las abejas y con cuidados ecológicos y amigables con el medio ambiente, favoreciendo así a los polinizadores locales y la flora endémica de la Araucanía Andina", "Natural apícola")
(12, "Polen granulado", 3500, "Polen granulado de flores del territorio Araucanía Andina recolectado por abejas", "Natural apícola")
(13, "Vela cera de abeja panal", 4500, "Vela de cera de abejas 100% natural sin aditivos, ayuda a limpiar los ambientes", "Souvenirs")
(14, "Vela cera de abeja hexagonal", 3000, "Vela de cera de abejas 100% natural sin aditivos, ayuda a limpiar los ambientes", "Souvenirs")
(15, "Llaveros de polinizadores nativos", 1500, "Llaveros hechos por manos de mujeres de Cunco, representan la diversidad de polinizadores que existen en el territorio", "Souvenirs")
(16, "Vela redonda tipo panal", 4500, "Vela de cera de abejas 100% natural sin aditivos, ayuda a limpiar los ambientes", "Souvenirs")
CREATE TABLE `blog` (
                        `blog_id` int NOT NULL AUTO_INCREMENT,
                        `blog_fecha` date DEFAULT NULL,
                        `blog_titulo` varchar(100) DEFAULT NULL,
                        `blog_contenido` varchar(3000) DEFAULT NULL,
                        PRIMARY KEY (`blog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
insert into `blog` (blog_id, blog_fecha, blog_titulo, blog_contenido) VALUES (1, 2023-07-20, "Tratamiento de residuos de las colmenas a través del vermicompostaje y sus beneficios para evitar el pillaje", "La generación de residuos por parte de los grupos de individuos y de poblaciones de individuos no es un problema, el problema es el manejo que le damos a este. Todos los seres vivos producen metabolitos secundarios que al parecer son un residuo para ellos, pero son un preciado regalo para otros, así como ocurre con el Oxígeno que respiramos emitido por las plantas, existen variados ejemplos en la naturaleza en donde estos supuestos residuos son parte de la dieta vital de otros, como apicultor reconocemos a uno de esos metabolitos en el néctar que es un metabolito secundario que las plantas usan para atraer agentes polinizadores que que le permiten preservar su propia especie y muchas veces una oportunidad de producir cambios genéticos que ayuden a una mejor preservación de la especie.
En el caso de la colmena, donde esta se comporta como un grupo de individuos los residuos que caen desde la limpieza de las celdas, restos de células vegetales (polen) y de toda la vida dentro de la misma (abejas muertas, restos de insectos, etc.), toda esta aparente basura es aprovechada por pequeños insectos y microorganismos que encuentran en estos residuos un exquisito y nutritivo manjar que les permite a ellos nutrirse con algunos de los alimentos mas ricos en vitaminas y minerales. Para el apicultor estos residuos son considerados un problema por la higiene e inocuidad que debe tener la colmena en la producción de alimentos para el consumo humano, además estos “manjares” que atraen a otros insectos y microorganismos pueden transferir contaminación y producir enfermedades en la colmena producto de la humedad y de los residuos que pueden producir estos microorganismos, recordemos que la colmena es el lugar donde viven las abejas Apis mellifera y mientras menos compañía tengan, su vida será mejor y por lo tanto su trabajo mas productivo.
Teniendo en cuenta estos antecedentes nosotros proponemos que para el manejo de estos residuos se utilicen otros microorganismos que también son benéficos para el medio ambiente y por otra parte generan un residuo que nos permitirá mejorar las condiciones del suelo. Nosotros en Esencias del Llaima el manejo de nuestros apiarios lo hacemos con pisos sanitarios que nos permite poder mover esa tapa inferior del piso y retirar todos los residuos producidos por la colmena, estos residuos son acopiados en baldes y llevados a compostar, en un proceso de compostaje mediado por lombrices californianas, llamado vermicompostaje, de esta forma hemos mejorado la sanidad de las abejas y por ende la calidad de las materias primas que utilizamos en nuestros productos y a la vez producir un nutritivo vermicompost que es utilizado en los huertos y trasplantes.")
    (2, 2023-07-22, "Análisis de laboratorios que validan el efecto terapéutico de Apicolon nutracéutico apícola en cápsulas, desarrollado por Esencias del Llaima", "Cuando el año 2017 junto a Cata mi compañera y mi amigo y socio fundador de Esencias del Llaima Joel propusimos el término Nutracéutico apícola nos miraron con una cara de duda y de no entender de qué les estábamos hablando, pues bien, la definición de nutracéutico involucra un alimento que a la vez es beneficioso para la salud y tiene un valor preventivo o terapéutico. Por lo tanto prácticamente todos los productos derivados de la colmena cumplen con esa definición. Pues bien, como Esencias del Llaima vimos que a través de esta oportunidad nosotros podríamos mezclar productos de la colmena con hierbas medicinales y frutos silvestres y con estas mezclas lograr potenciar las propiedades nutracéuticas de los productos de la colmena, siguiendo este impulso por crear productos con propiedades más allá de lo nutricional, formulamos nuestro nutracéutico APICOLON, el cual se formuló en base a estudios científicos previos que caracterizaron propóleos de nuestro país para ver la efectividad sobre la bacteria Helicobacter pylori, principal agente causante de úlceras gástricas y promotor del cáncer gástrico, estos estudios mostraron una gran capacidad bactericida contra H. pylori sin dañar la flora intestinal en los propóleos de la Araucanía y los Ríos. En Esencias del Llaima producimos propóleo a través de mallas captadoras y las mezclamos con hierbas y frutos silvestres en proporciones científicamente  calculadas, para que el consumo de este producto ayude a aliviar todos las molestias derivadas de la presencia de esta bacteria en su sistema digestivo.")

CREATE TABLE `comprobantedepago` (
                                     `comprobante_id` int NOT NULL AUTO_INCREMENT,
                                     `comprobante_sumatotal` int DEFAULT NULL,
                                     `orden_id` int DEFAULT NULL,
                                     PRIMARY KEY (`comprobante_id`),
                                     KEY `orden_id` (`orden_id`),
                                     CONSTRAINT `comprobantedepago_ibfk_1` FOREIGN KEY (`orden_id`) REFERENCES `orden` (`orden_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `imagenes` (
                            `imagen_id` int NOT NULL AUTO_INCREMENT,
                            `imagen_ruta` varchar(255) DEFAULT NULL,
                            `producto_id` int DEFAULT NULL,
                            `blog_id` int DEFAULT NULL,
                            PRIMARY KEY (`imagen_id`),
                            KEY `producto_id` (`producto_id`),
                            KEY `blog_id` (`blog_id`),
                            CONSTRAINT `imagenes_ibfk_1` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`producto_id`),
                            CONSTRAINT `imagenes_ibfk_2` FOREIGN KEY (`blog_id`) REFERENCES `blog` (`blog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `inventario` (
                              `inventario_total` int NOT NULL,
                              `producto_id` int DEFAULT NULL,
                              `producto_cantidad` int DEFAULT NULL,
                              PRIMARY KEY (`inventario_total`),
                              KEY `producto_id` (`producto_id`),
                              KEY `producto_cantidad` (`producto_cantidad`),
                              CONSTRAINT `inventario_ibfk_1` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`producto_id`),
                              CONSTRAINT `inventario_ibfk_2` FOREIGN KEY (`producto_cantidad`) REFERENCES `producto` (`producto_cantidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `orden` (
                         `orden_id` int NOT NULL AUTO_INCREMENT,
                         `orden_cantidaddeproducto` int DEFAULT NULL,
                         `orden_fecha` date DEFAULT NULL,
                         `producto_id` int DEFAULT NULL,
                         `cliente_id` int DEFAULT NULL,
                         PRIMARY KEY (`orden_id`),
                         KEY `producto_id` (`producto_id`),
                         KEY `cliente_id` (`cliente_id`),
                         CONSTRAINT `orden_ibfk_1` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`producto_id`),
                         CONSTRAINT `orden_ibfk_2` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`cliente_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `producto` (
                            `producto_id` int NOT NULL,
                            `producto_nombre` varchar(100) DEFAULT NULL,
                            `producto_precio` int DEFAULT NULL,
                            `producto_descripcion` varchar(255) DEFAULT NULL,
                            `producto_categoria` varchar(20) DEFAULT NULL,
                            `producto_cantidad` int DEFAULT NULL,
                            PRIMARY KEY (`producto_id`),
                            KEY `idx_producto_cantidad` (`producto_cantidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
CREATE TABLE `usuario` (
                           `usuario_id` int NOT NULL,
                           `usuario_clave` varchar(60) DEFAULT NULL,
                           `blog_id` int DEFAULT NULL,
                           `inventario_total` int DEFAULT NULL,
                           `producto_id` int DEFAULT NULL,
                           PRIMARY KEY (`usuario_id`),
                           KEY `producto_id` (`producto_id`),
                           KEY `blog_id` (`blog_id`),
                           KEY `inventario_total` (`inventario_total`),
                           CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`producto_id`),
                           CONSTRAINT `usuario_ibfk_2` FOREIGN KEY (`blog_id`) REFERENCES `blog` (`blog_id`),
                           CONSTRAINT `usuario_ibfk_3` FOREIGN KEY (`inventario_total`) REFERENCES `inventario` (`inventario_total`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;