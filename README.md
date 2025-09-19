Lab 6 Plataformas 
Pedro Caso 241286

Explicacion de como se maneja el estado solo con remember/rememberSaveable:
Se utiliza nada mas en 2 archivos del proyecto, con el propósito de mantener cierto valor o parámetro durante la vida del composable, por ejemplo el remember se utiliza en el mainactivity para guardar el valor de la variable de DarkTheme, la cual indica el estado de la pantalla y su tema.
Mientras que rememberSaveable es un poco más avanzado que remember, ya que aunque exista actividad en la aplicacion se guarda el estado a pesar de una interrupcion como un giro de pantalla, en este caso se utilizo para mantener el estado de las variables de paginacion, busqueda, carga y error, ya que si el usuario decide rotar el telefono por ejemplo se mantienen estos datos a comparacion de remember, brindando mas fluidez al programa

Link del video:
https://youtu.be/LGep3T8-vZs

Link del repo:
https://github.com/Pxdro-410/Lab-6-plataformas---Pedro-Caso-/tree/Main
