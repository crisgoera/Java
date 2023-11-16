import { Controller } from "@hotwired/stimulus";

export default class extends Controller {
  static targets = ['list', 'toggle']

  connect() {
    // TODO: console.log something!
    console.log('Stimulus connected correctly');
  }

  checkAll() {
    const toggleState = this.toggleTarget.checked;
    const checkboxList = this.listTargets;
    if (toggleState === true) {
      checkboxList.forEach((entry) => { entry.checked = toggleState; });
    } else {
      checkboxList.forEach((entry) => { entry.checked = toggleState; });
    }
  }
}
