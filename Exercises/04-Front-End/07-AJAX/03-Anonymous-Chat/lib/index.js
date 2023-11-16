const batch = 1314; // change to your own batch id
const baseUrl = "https://wagon-chat.herokuapp.com/";
const url = `${baseUrl}${batch}/messages`;

// Your turn to code!

// Get all chat messages from API
const refresh = document.querySelector('#refresh');

refresh.addEventListener('click', (e) => {
  const postList = document.querySelector('.list-unstyled');
  document.querySelectorAll('li').forEach((li) => { li.innerHTML = ''; });

  fetch(url)
    .then(response => response.json())
    .then((data) => {
      const lastPosts = data.messages;
      console.log(lastPosts);
      lastPosts.forEach((post) => {
        const datePost = (Date.now() - Date.parse(post.created_at)) / 60000;
        postList.insertAdjacentHTML('beforeend', `<li>${post.content} (posted <span class="date">${Math.trunc(datePost)} minutes ago</span>) by ${post.author}</li>`);
      });
    });
});


// Post new message to API.
const send = document.querySelector('.btn-primary');

send.addEventListener('click', (e) => {
  e.preventDefault();

  const message = document.querySelector('#your-message').value;
  const user = document.querySelector('#your-name').value;

  fetch(url, {
    method: 'POST',
    headers: { 'Content-type': 'Text/plain' },
    body: JSON.stringify({ author: user, content: message })
  });
});
