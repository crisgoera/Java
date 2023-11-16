// Create a function to get the coordinates from an address and display a map with a marker on it
const showMap = (userInput) => {
  // TODO: Construct the URL (with apiKey & userInput) and make the fetch request to the mapbox API
  const address = userInput.replace(/\s/g, '%20');
  const apiKey = 'pk.eyJ1IjoiZnJhbmNlc2NhbWlsayIsImEiOiJjbGwwcDJ0dTIwZ3MxM2dwMzRjY3M1M28zIn0.qx_JDU3qJqQPDLQTHZghmg';

  const url = `https://api.mapbox.com/geocoding/v5/mapbox.places/${address}.json?access_token=${apiKey}`;
  console.log(url);
  fetch(url)
    .then(response => response.json())
    .then((data) => {
      console.log(data);
      // TODO: Insert the info into the DOM
      // - Extract the coordinates from the parsed JSON response (lang, lat)
      const coordinates = data.features[0].geometry.coordinates;
      const longitude = coordinates[0];
      const latitude = coordinates[1];
      // - Display the coordinates in the element where the coordinates will be displayed
      const displayLocation = document.querySelector('p');
      displayLocation.innerHTML = `Longitude: ${longitude}, Latitude: ${latitude}`;
      // - Create a map using the Mapbox API and the coordinates
      // - Add a marker to the map at the coordinates
    });
};


//
// TODO: Select the form element
const form = document.querySelector('form');

// TODO: Add event listener to the form that:
// - Prevents the default form submission behavior
// - Get the user input
// - Calls the showMap function with the user input as an argument

form.addEventListener('submit', (e) => {
  e.preventDefault();
  const address = document.querySelector("input[type = 'text']").value;
  if (address === '') {
    alert('An address must be introduced');
  } else {
    showMap(address);
  }
});
