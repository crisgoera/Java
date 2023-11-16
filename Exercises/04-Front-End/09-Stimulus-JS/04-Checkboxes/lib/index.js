import { Application } from "@hotwired/stimulus";

// TODO: Import the Stimulus Controller here
// eslint-disable-next-line
import CheckAllController from './controllers/check_all_controller.js';

window.Stimulus = Application.start();
// TODO: Register your Stimulus Controller below
window.Stimulus.register('check-all-checkboxes', CheckAllController);
