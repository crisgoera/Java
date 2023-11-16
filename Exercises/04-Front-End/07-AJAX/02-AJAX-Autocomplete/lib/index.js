// TODO: Autocomplete the input with AJAX calls.
const searchBar = document.querySelector('#search');
const apiUrl = 'https://wagon-dictionary.herokuapp.com/autocomplete/';
const resultList = document.querySelectorAll('li');


searchBar.addEventListener('input', (e) => {
  e.preventDefault();
  const userInput = searchBar.value;
  const url = `${apiUrl}${userInput}`;
  console.log(url);

  fetch(url)
    .then(response => response.json())
    .then((data) => {
      for (let i = 0; i <= 1; i += 1) {
        console.log(data.words);
        resultList[i].innerHTML = data.words[i];
      }
    });
});
