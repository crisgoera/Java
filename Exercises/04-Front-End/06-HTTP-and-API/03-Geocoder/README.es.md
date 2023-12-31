## Contexto y Objetivos

En este ejercicio pondremos en práctica tus habilidades AJAX. Comenzamos con algo simple como una petición `GET`. Aquí usaremos la [API Geocoding de MapBox](https://www.mapbox.com/search/). ¡Queremos crear una herramienta donde sea posible introducir una dirección, hacer clic en un botón y recuperar las **Coordenadas GPS**! Para cerrar con broche de oro, también mostraremos el mapa.

<div class="text-center">
  <img src="https://raw.githubusercontent.com/lewagon/fullstack-images/master/frontend/mapbox_ajax_geocoder.gif" alt="MapBox Geocoding demo" width="100%">
</div>

## Especificaciones

Puedes iniciar tu servidor web local con lo siguiente:

```bash
serve
```

### Geocoding

Primero, tienes que crear una cuenta en MapBox y obtener una clave de API (¡no hay que pagar nada!). Luego lee la [documentación de la API Geocoding de MapBox](https://www.mapbox.com/api-documentation/#geocoding). Todo se resume en hacer una petición HTTP tipo `GET` con una dirección como parámetro de cadena de consulta.

```javascript
'https://api.mapbox.com/geocoding/v5/mapbox.places/Los%20Angeles.json?access_token=YOUR-API-KEY'
```

NOTA: La petición a la API de MapBox necesitará tu clave de API como uno de los parámetros. Encontrarás dicha clave en la sección de [tu cuenta](https://www.mapbox.com/account/) una vez que la hayas creado y hayas iniciado sesión.

Sigue avanzando y encuentra el formulario que ya se encuentra en `index.html` del boilerplate del desafío. Tiene un `input` de tipo `"text"` donde un/a usuario/a puede introducir una dirección. También tiene un `input` de tipo `"submit"` para mostrar un botón.

Usa el evento `submit` para captar el momento en el que el formulario es posteado por el/la usuario/a. Ahí es donde hay que hacerle la consulta AJAX al servicio Geocoding de Mapbox usando `fetch` (regresa a las diapositivas de la clase de ayer para obtener más información al respecto).

**Recordatorio: debes escribir tu código JavaScript dentro de un controlador Stimulus**.

Regresa al desafío Stimulus y sigue las instrucciones de instalación.

Como siempre, cuando recuperas datos de una API, comienza por mostrar lo que recibes de MapBox usando `console.log()`. ¡Es un JSON gigante! Ahora que tienes eso, averigua dónde se encuentran las coordenadas GPS y haz que se muestren en la pantalla.

Pista: ¡Las coordenadas que devuelve Mapbox empiezan con la longitud y luego sigue la latitud!

### [OPCIONAL] Mostrar el mapa

Para mostrar un mapa MapBox con el marcador de una dirección dada usaremos una segunda API, la [API JavaScript de MapBox](https://www.mapbox.com/mapbox-gl-js/api/).

Para poder usarla debes agregar esta línea en el `head` de tu archivo HTML para así poder usar la hoja de estilo (stylesheet) de MapBox para tu mapa:

```html
<link href="https://api.mapbox.com/mapbox-gl-js/v1.11.1/mapbox-gl.css" rel="stylesheet">
```

Para agregar un mapa necesitarás un elemento HTML vacío de soporte. Por ejemplo:

```html
<div id="map" style="height: 300px; width: 600px"></div>
```

Para crear un mapa fácilmente y agregarle un marcador usaremos [el paquete [npm de mapbox-gl](https://yarnpkg.com/en/package/mapbox-gl).

Debes hacer un `yarn add mapbox-gl` para agregar este paquete a tu proyecto.

Para hacer que se muestre un mapa en tu `#map` con el paquete `mapbox-gl`, primero importa el paquete al principio de tu controlador Stimulus:

```javascript
import mapboxgl from "mapbox-gl"
```

Y luego haz que se muestre una mapa:

```javascript
mapboxgl.accessToken = "yourApiKey"
const map = new mapboxgl.Map({
  container: "map",
  style: "mapbox://styles/mapbox/streets-v9",
  center: [ -0.077, 51.533 ],
  zoom: 12
})
```

Para agregarle un marcador al mapa, en caso de que la variable `map` tenga el objeto `mapboxgl`, puedes correr:

```js
new mapboxgl.Marker()
  .setLngLat([ -0.077, 51.533 ])
  .addTo(map);
```

¡Que disfrutes geocoding! 🌎 🌍 🌏
