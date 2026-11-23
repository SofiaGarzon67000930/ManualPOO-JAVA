# ManualPOO-JAVA

Código de los programas del *Manual de Programación Orientada a Objetos en Java*,
en el estado en que queda al terminar cada capítulo redactado.
Todos los programas se probaron con Java 21.

| Carpeta | Capítulo | Programa principal |
| --- | --- | --- |
| `capituloFundamentos/` | Fundamentos del Lenguaje Java | Uno por archivo; por ejemplo, `Tablero` |
| `capituloIntroPOO/` | Introducción a la Programación Orientada a Objetos | `Partida`, `PruebaAlfil` |
| `capituloEncapsulamiento/` | Encapsulamiento y Diseño de Clases | `Torneo`, `PruebaReloj`, `PruebaJugador` |

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
  "del diagrama al código" de la sección "UML básico: diagrama de clases".
- No se incluyen las soluciones de las actividades y los retos (por ejemplo,
  la clase `Caballo`): son trabajo del estudiante.
- `PedirFila` espera datos por teclado.
- `PruebaJugador` termina a propósito con una `IllegalArgumentException`
  (sección Métodos getters y setters).
