# ValuacionesApp

Resolucion de la siguiente consigna:
Se debe construir una pantalla que permita consultar las valuaciones de automotores provistas por AFIP las cuales 
son utilizadas en las Declaraciones Juradas de Bienes Personales.

A tal efecto, AFIP publica anualmente una planilla Excel con la valuación fiscal de cada modelo de automotor 
del mercado (en este caso usaremos la del 2021):

https://www.afip.gob.ar/gananciasYBienes/bienes-personales/valuaciones/periodo-fiscal-2022.asp

Se deberá descargar dicha planilla, analizar sus campos y diseñar una tabla de base de datos que permita guardar 
dicha información considerando su normalización.
 
La carga de los datos desde la planilla Excel a la tabla creada se debería efectuar con ayuda de algún cliente de base de 
datos que permita su importación masiva hacia la tabla creada a tal fin (por ejemplo DbVisualizer). Esta tarea es de única
vez y se efectuaría como paso previo a la consulta a desarrollar.
 
Luego se deberá construir una aplicación web consistente en una pantalla que permita consultar el valor de tabla de un 
automotor en particular, mediante el ingreso de algunos campos que permitan filtrar la búsqueda. Dado que el set de datos 
resultante puede ser de uno o más registros, se sugiere la utilización de alguna grilla para la visualización de los resultados.
