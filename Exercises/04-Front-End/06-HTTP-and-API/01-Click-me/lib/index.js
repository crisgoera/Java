const displayAlertOnButtonClick = () => {
  // TODO: Select the big green button
  const button = document.querySelector(".btn-success");
  button.addEventListener('click', () => {
    button.classList.add("alert");
    button.classList.remove("btn-success");
    button.innerHTML = 'Thank you!';
    alert("Thank you!");
  });
  // TODO: Bind the `click` event to the button
  // TODO: On click, display `Thank you!` in a JavaScript alert!
};

displayAlertOnButtonClick(); // Do not remove!
