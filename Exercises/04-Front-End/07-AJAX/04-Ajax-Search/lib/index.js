const omdbapiUrl = "http://www.omdbapi.com/";
const apiKey = "48727053";

// Here is 2 other API key if the one above doesn't work anymore:
// - 48727053
// - 8691812a

// Your turn to code!

const form = document.querySelector('#search-movies');

// Movie Card
const createCard = (movie) => {
  document.querySelector('#poster').src = movie.Poster;
  document.querySelector('#year').innerHTML = movie.Year;
  document.querySelector('#title').innerHTML = movie.Title;
};

form.addEventListener('submit', (e) => {
  e.preventDefault();
  const userInput = document.querySelector('#movie-name').value;
  console.log(userInput);
  const url = `${omdbapiUrl}?apikey=${apiKey}&t=${userInput}`;
  console.log(url);
  fetch(url)
    .then(response => response.json())
    .then((data) => {
      createCard(data);
    });
});
