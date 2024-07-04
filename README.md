Autor: Bryan Maita

Mi codigo funciona principalmente de 5 clases, donde una de ellas es el app java, es decir, la clase principal donde se iniciaran los valores, y se probrara el código. 

En segundo lugar se creo una clase user genérica, para que sea más versatil y sencillo de usar, la clase user esta compuesta por tres atributos y sus métodos básicos que son los setter y getters, los atributos son el nombre, edad e intereses. 

En tercer lugar tenemos creado la clase nodeGraph genérica, que nos servira para tratar a los usuarios como nodos y nos ayudara a administrar de manera más sencilla este grafo, sus atributos son el usuario y una lista, para guardar a las personas o usuarios que vayan a ingresar en el grafo(También tiene sus getter y setters).

En cuarto lugar tenemos creado una clase muy importante donde esta el añadir los usuarios, donde se añadirán los usuarios, valga la redundancia, en forma de nodos; añadir una conexión entre ellos, ya que, así sabremos la conexión que tiene un usuario con otro y nos ayudara a recomendar a otros usuarios que pueden tener algún tipo de conexión; obtener los amigos del usuario que se busque, esto es gracias, también, a la clase de conexiones que nos ayuda a obtener los amigos del usuario; y por último un método donde se pueda recomendar amigos en común que tenga un usuario cono otro, como se observa está clase es muy importante para el funcionamiento general del proyecto. En esta clase se usaron los list y los HashMap, jugaran un papel importante para que haya un buen funcionamiento de los métodos
Como por ejemplo en adNodes se usa el putIfAbsent que conforma del HashMap y nos ayudara a que cada nodo inicialice como una lista, así para que en el siguiente método el addConection nos permita añadir una conexión entre los dos nodos. 
El getFriends es muy sencillo ya que solo returna los nodos que se guardaron en un nodo con una lista ya inicializada.
Por último tenemos a reomendFriends que es un código algo complejo que se tuvo que investigar para aplicarlo de manera correcta, pero, básicamente se encarga de buscar los amigos del nodo o usuario y con ayuda de ese método en la app principal creariamos un código que nos ayude a imprimir para mostrar los amigos recomendados

