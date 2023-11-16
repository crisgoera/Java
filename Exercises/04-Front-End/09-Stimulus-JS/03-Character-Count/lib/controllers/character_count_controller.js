import { Controller } from "@hotwired/stimulus";

export default class extends Controller {
  static targets = ['area', 'display']

  connect() {
    // TODO: console.log something!
    console.log('Stimulus connected correctly');
  }

  count() {
    const numChar = this.areaTarget.value.length + 1;
    if (numChar <= 140) {
      this.displayTarget.innerHTML = `${numChar} characters`;
    } else {
      this.displayTarget.innerHTML = "Text exceeded 140 characters.";
    }
  }
}
