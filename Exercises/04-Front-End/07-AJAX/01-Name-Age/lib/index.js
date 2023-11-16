const agifyApiUrl = "https://api.agify.io/";

const displayAge = (event) => {
  event.preventDefault();
  const firstName = document.getElementById("first-name").value;
  // TODO: Display your age with an AJAX call instead of the console.log()
  console.log(firstName);
  const url = `${agifyApiUrl}?name=${firstName}`;

  fetch(url)
    .then(response => response.json())
    .then((data) => {
      document.querySelector('#your-age').innerHTML = `Hello ${firstName}, your are ${data.age} years old`;
    });
};

const form = document.getElementById("fetch-age");
form.addEventListener("submit", displayAge);
