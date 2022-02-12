------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Polimorfismo
PURPOSE OF PROJECT: Aprender sobre polimorfismo y excepciones.
VERSION or DATE: 2 - 22 de Julio de 2021
HOW TO START THIS PROJECT: 
AUTHORS: Nayarith el Carmen Jiménez Sierra 2017100188
USER INSTRUCTIONS: Introduzca el número atómico de un elemento de la tabla periódica y obtendrá;
1.Configuración electrónica, utilizando el método ObtenerConfElect de la subclase ConfiguraciónElectrónica.
2.Números cuánticos, utilizando el método ObtenerNumCuan de la subclase NúmerosCuánticos.

Cree un objeto de la clase Neutrones, coloque el número atómico y el número másico de un elemento.
De esta manera el programa le informará el número de neutrones en el átomo.

Cree un objeto de la clase Moles, coloque la cantidad en gramos y el número másico de la sustancia.
De esta manera el programa le informará el número moles de la sustancia.


EXPLICACIÓN: Este programa tiene una superclase estática que sirve para heredar métodos a las clases hijas.
Los métodos heredados más importantes son Operaciones y Cálculos que se heredan de la clase Procedimiento.
El método Operaciones se sobreescribe en todas las clases.
El método Cálculos se sobrecarga en las clases Neutrones y Moles.
Esto es para observar el comportamiento de métodos sobreescritos y métodos en sobrecarga en java.

Puedes crear objetos de la subclase ConfiguraciónElectrónica suministrando el número atómico de un elemento.
Con la clase ObtenerConfElect puedes saber la configuración electrónica del elemento según su número atómico.

También puedes crear objetos de la subclase NúmerosCuánticos suministrando el número atómico de un elemento.
Con la clase ObtenerConfElect puedes conocer los cuatro números cuánticos del elemento según su número atómico.

Los objetos de las clases Neutrones y Moles se crean sin parámetros y posteriormente se introducen parámetros el método.

Los números atómicos deben ser enteros que van del 1 al 156.
Recuerde que en la realidad los elementos descubiertos llegan hasta el oganesón, de número atómico 118.
Los demás números serán tentativos.

La clase HerramientaExcepciones ayuda a tratar con las excepciones.

PARA MÁS INFORMACIÓN:
Teoría:
https://bibliotecadeinvestigaciones.wordpress.com/quimica/configuracion-electronica-y-numeros-cuanticos/
Procedimiento:
https://www.youtube.com/watch?v=K0W2DT_AV1E
