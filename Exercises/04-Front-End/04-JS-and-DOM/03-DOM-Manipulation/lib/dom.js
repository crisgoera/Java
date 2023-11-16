/* eslint-disable no-multiple-empty-lines */
/* eslint-disable prefer-const */
/* eslint-disable import/extensions */
import runChallenges from "../spec/examiner.js";

// INSTRUCTIONS - PLEASE READ!!
// Here are some challenges. Solve them from top to bottom

// **Each time** you complete a challenge, please commit and push!
// This is a good practice. Each time you make some progress in software
// development, you want to save a snapshot.


// Ex 1. Read what's written in the email input
//       Make the function getEmail() return it
const getEmail = () => {
  // TODO: return the email
  let email = document.querySelector('#email');
  return email.value;
};

// /!\ DO NOT CHANGE THIS LINE - TEST PURPOSES
const borisesEmail = getEmail();

// Ex 2. Change the content of the email input by writing your own email address
let email = document.querySelector('#email');
email.value = 'crisgoera@lewagon.com';

// Ex 3. Replace the email hint (next to the input) with 'This is my email now'
//       The text should be emphasized using a <strong> tag
document.querySelector('#email-hint').innerHTML = '<strong>This is my email now</strong>';


// Ex 4. Add the .blue CSS class to the th elements

let elements = document.querySelectorAll('th');
elements.forEach((element) => { element.classList.add('blue'); });

// Ex 5. Count the number of table body rows there are
//       Make the function teamCount() return it
const teamCount = () => {
  // TODO: return the number of teams
  return document.querySelectorAll('tbody>tr').length;
};

// /!\ DO NOT CHANGE THIS LINE - TEST PURPOSES
const teamCountBeforeAddition = teamCount();

// Ex 6. Say there is a 15th team added to the table.
//       Add a row at the bottom, this new team should have zero points.

document.querySelector('tbody').insertAdjacentHTML('beforeend', '<tr><td>15</td><td>Athletic Club </td><td>0</td></tr>');

// Ex 7. Write some code to sum all points given to all teams
//       Make the function summarizePoints() return it
const summarizePoints = () => {
  // TODO: return the sum
  let scores = [];
  let points = 0;
  let tbl = document.getElementsByTagName('tbody')[0];
  for (let i = 0; i <= 13;) {
    scores.push(tbl.rows[i].cells[2].innerText);
    i += 1;
  }
  scores.forEach((entry) => { points += Number(entry); });
  return points;
};


// OPTIONAL METHOD FOR ACCESSING COLUMN tbody>tr>td:last-child

// Ex 8. Change the background color of all `<th>` cells to #DDF4FF

document.querySelectorAll('th').forEach((entry) => { entry.style.background = '#DDF4FF'; });

// Ex 9. Remove the "Email:" label from the DOM

document.querySelector('label').remove('label');


// Checking exercise answers. DO NOT MODIFY THIS LINE
runChallenges(borisesEmail, teamCountBeforeAddition, summarizePoints);
