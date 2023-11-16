const todos = [
  { title: "Code a to-do list", done: false },
  { title: "Eat breakfast", done: true },
  { title: "Do some exercise", done: false },
  { title: "Water the plants", done: true }
];

// To-do item HTML 👇
const template = `<div class="shadow-sm rounded px-4 py-3 mb-2 border d-flex">
                    <input class="d-flex form-check-input me-1" type="checkbox">
                    <div>Test text</div>
                  </div>`;

// TODO: Dynamically generate a list of to-dos based on `todos` array, and display them
const displayLoc = document.querySelector('#todosContainer');


todos.forEach((entry) => {
  displayLoc.insertAdjacentHTML('beforeend', template);
  const checkbox = document.querySelector('#todosContainer >.shadow-sm:last-child >input[type=checkbox]');
  const toDo = document.querySelector('#todosContainer >.shadow-sm:last-child >div');
  checkbox.checked = entry.done;
  toDo.innerHTML = entry.title;
});
