// TODO: write your code here!

// 1- Determine clickable elements.

const elements = document.querySelectorAll('.clickable'); // returns array of elements.


// 2- Iterate over the elements of the array.
for (let i = 0; i < elements.length; i += 1) {
  // 2.1- Add event listener.
  elements[i].addEventListener("click", () => {
    // 2.2- Toggle active class.
    elements[i].classList.toggle('active');
  });
}
