import { Controller } from "@hotwired/stimulus";

export default class extends Controller {
  static targets = ['input', 'btn']

  connect() {
    // TODO: console.log something!
    console.log('Stimulus connected correctly');
  }

  copy() {
    const text = this.inputTarget.value;
    this.btnTarget.innerHTML = 'Copied!';
    this.btnTarget.setAttribute('disabled', '');
    navigator.clipboard
      .writeText(text);
  }
}
