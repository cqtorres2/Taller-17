# Taller-17
alumno: Carlos jose torres del rio

Principio de sustitución de liskvo.

Como parte de los SOLID este principio nos provisiona de pautas y guias para el buen mantenimiento y dirección de una estructura de codigo.

En este caso el principio consiste en la idea de que cada clase derivdad debe ser capaz de reemplazar a su clase padre para estar bien estructurada.

Es decir:

Que si tuvieramos una clase padre con un metodo, hablar. Tendremos que garantizar que incluso sin la clase padre, las clases heredadas podria funcionar logicamente, por ejemplo si tuviran simplemente sus propias instancias de hablar, podria seguir funcionando.

Actividad 1:

Cuenta bancaria, se pide una clase cuenta bancaria, con saldo, tipo de cuenta y cedula.
    -Se sigue el principio de liskov tratando de mantener los principios previos.
    -Se le dota de un costructor, metodo y String e ints con datos
Cuenta ahorro
    -Se le dota de similares anteriores con un llamdo al constructor, su propio metodo variado y un metodo static void con los objetos de ambas clases para inicializar cada una un mensaje propio.

Actividad 2:

Clase Figura, se le dotan de clases derivadas, rectangulo y circulo.
    -se usa un metodo para mostrar el area de las 3
    -se crea un constructor para el calculo del area en una variable
    -se le da un objeto a cada una para mostrar su area
    -se cumple el principio asemejando las 3 clases en lo posible.
    -se crea un main para mantener un estilo organizado e inicializar los 3 objetos uno de cada clase con su mensaje.

Actividad 3:

Se pide una clase transporte con 2 derivadas, coche y bicicleta
se pide que cumpla el principio de sustitución
    -se realizan las 3 clases.
    -se crea el metodo moverse en transporte
    -se extienden coche y bicicleta a clase transporte.
    -se da su propia iteración a moverse en cada clase
    -se hace un static void para inicializar el codigo.
    -se crean 3 objetos uno para cada clase.
    -se cumple el principio manteniendo los codigos uniformes en lo posible donde cualquiera seraderivado o bicicleta podria reemplazar funcionalmente a transporte.