const todos = [
  { title: "Code a to-do list", done: false },
  { title: "Eat breakfast", done: true },
  { title: "Do some exercise", done: false },
  { title: "Water the plants", done: true }
];

// TODO: Use the template in the `index.html` to dynamically generate a list based on `todos` array
const template = document.querySelector('#todoItemTemplate');

todos.forEach((entry) => {
  const clone = template.content.cloneNode(true);
  clone.querySelector('input[type=checkbox]').checked = entry.done;
  clone.querySelector('.title').innerHTML = entry.title;
  document.querySelector('#todosContainer').appendChild((clone));
});
