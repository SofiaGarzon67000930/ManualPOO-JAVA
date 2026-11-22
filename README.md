# ManualPOO-JAVA

Código de los programas del *Manual de Programación Orientada a Objetos en Java*,
en el estado en que queda al terminar cada capítulo redactado (hasta la sección 4.8).
Todos los programas se probaron con Java 21.

| Carpeta | Capítulo | Programa principal |
| --- | --- | --- |
| `capitulo2/` | 2. Fundamentos del Lenguaje Java (2.1 a 2.7) | Uno por archivo; por ejemplo, `Tablero` |
| `capituloIntroPOO/` | 3. Introducción a la Programación Orientada a Objetos (3.1 a 3.7) | `Partida`, `PruebaAlfil` |
| `capituloEncapsulamiento/` | 4. Encapsulamiento y Diseño de Clases (4.1 a 4.8) | `Torneo`, `PruebaReloj`, `PruebaJugador` |

## Compilar y ejecutar

Desde la carpeta de un capítulo (por ejemplo, `capituloEncapsulamiento`):

```
javac -d bin src/*.java
java -cp bin Torneo
```

En VS Code basta con abrir la carpeta `ManualPOO-JAVA` y usar Run sobre el `main`.

## Qué incluye y qué no

- Cada archivo está en la versión final de su sección. Los archivos que el manual
  pide borrar (`ValoresPorDefecto`, `DosTorres`, `TorreAbierta`, `PartidaAbierta`,
  `TorreSinColocar`) no se incluyen.
- `capituloIntroPOO/src/Alfil.java` es una solución posible del experimento
  "del diagrama al código" de la sección 3.6.
- No se incluyen las soluciones de las actividades y los retos (por ejemplo,
  la clase `Caballo`): son trabajo del estudiante.
- `PedirFila` espera datos por teclado.
- `PruebaJugador` termina a propósito con una `IllegalArgumentException`
  (sección 4.3).
