import { Application } from "@hotwired/stimulus";

// TODO: Import the Stimulus Controller here
// eslint-disable-next-line
import CharacterCountController from './controllers/character_count_controller.js';

window.Stimulus = Application.start();
// TODO: Register your Stimulus Controller below
window.Stimulus.register('character-count', CharacterCountController);
