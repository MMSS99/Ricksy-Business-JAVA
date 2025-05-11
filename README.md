# Ricksy Business

Solución al kata propuesto por [dfleta](https://github.com/dfleta/) [Ricksy-Business](https://github.com/dfleta/ricksy-business), que hace uso de Hashmaps para el guardado de dos valores correlacionados (`UfosPark`) y patrón Singleton (`Receptivo`).

El resultado por consola es vagamente legible debido a la colisión de *println* entre mi código y el código main original, pero el programa cumple con sus objetivos de diseño y casos de uso (e informa sobre las incompatibilidades del proceso).

(!!): En `UfosPark` aparece un if-else de 5 profundidades. Pese a susodicha profundidad, el if-else permanece legible ya que sólamente existe para dar cuenta de la parte del proceso que no permite que el mismo se complete. Pese a que podría ser refactorizado, el código producido para este ejercicio nació de forma rápida.