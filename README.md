Método de Ordenamiento Burbuja (Bubble Sort)

Ejemplo en Java del algoritmo de ordenamiento burbuja.

Cómo ejecutarlo
bash
javac Burbuja.java
java Burbuja
Salida esperada
=== MÉTODO BURBUJA ===
Arreglo original: [64, 34, 25, 12, 22, 11, 90]

Pasada 1: [34, 25, 12, 22, 11, 64, 90]
Pasada 2: [25, 12, 22, 11, 34, 64, 90]
Pasada 3: [12, 22, 11, 25, 34, 64, 90]
Pasada 4: [12, 11, 22, 25, 34, 64, 90]
Pasada 5: [11, 12, 22, 25, 34, 64, 90]
Pasada 6: [11, 12, 22, 25, 34, 64, 90]

Arreglo ordenado: [11, 12, 22, 25, 34, 64, 90]
Teoría
¿Qué es el método burbuja?

El método burbuja (Bubble Sort) es un algoritmo de ordenamiento sencillo que recorre una lista varias veces, comparando cada par de elementos vecinos y intercambiándolos si están en el orden incorrecto. Se llama "burbuja" porque, en cada pasada, el elemento más grande va "subiendo" hasta el final de la lista, como una burbuja que sube a la superficie del agua.

¿Cómo funciona?
Se compara el primer elemento con el segundo. Si el primero es mayor, se intercambian.
Se pasa al siguiente par (segundo y tercero) y se repite la comparación.
Se continúa así hasta el final de la lista. Al terminar esta primera pasada, el número mayor queda en la última posición.
Se repite el proceso con el resto de la lista (sin contar los elementos que ya quedaron en su lugar).
El algoritmo termina cuando en una pasada completa no se realiza ningún intercambio, lo que significa que la lista ya está ordenada.
Ejemplo rápido

Lista: [5, 3, 1]

Pasada 1: compara 5 y 3 → intercambia → [3, 5, 1]; compara 5 y 1 → intercambia → [3, 1, 5]
Pasada 2: compara 3 y 1 → intercambia → [1, 3, 5]
Pasada 3: no hay intercambios → la lista está ordenada.
Complejidad
Caso	Complejidad de tiempo	Explicación
Mejor caso	O(n)	La lista ya está ordenada (con la optimización de detener si no hay intercambios).
Caso promedio	O(n²)	Hay que hacer muchas comparaciones.
Peor caso	O(n²)	La lista está ordenada al revés.
Espacio adicional: O(1), porque ordena en el mismo arreglo.
Es estable: los elementos iguales conservan su orden original.
Ventajas
Es muy fácil de entender y programar.
No necesita memoria extra.
Ideal para aprender los conceptos básicos de ordenamiento.
Desventajas
Es lento con listas grandes, porque su complejidad es O(n²).
Existen algoritmos mucho más eficientes, como Quick Sort o Merge Sort.
Conclusión

El método burbuja no es el más rápido, pero es uno de los algoritmos más importantes para aprender programación, ya que enseña cómo funcionan las comparaciones, los intercambios y los ciclos anidados.
